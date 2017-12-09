/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiladorest3;

//import static com.sun.jmx.snmp.ThreadContext.contains;
import compiladorest3.SQLoopParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 *
 * @author Hugo, Lucas, Matheus, Thiago
 */
public class Visitor extends SQLoopBaseVisitor {

    PilhaDeTabelas escopos = new PilhaDeTabelas();
    TabelaDeSimbolos tabelaDeSimbolos = new TabelaDeSimbolos("global");
    Mensagem mensagem = new Mensagem();
    ArrayList<String> tipos = new ArrayList<String>();
    String escopo = "";
    String nomeFuncaoOuProc = "";
   
    //Relações são adicionadas a esse HashMap<Relacao, numero da linha> quando
    //são declaradas para serem validadas ao fim do DDL
    HashMap<Relationship, Integer> relacoesDeclaradas = new HashMap<Relationship, Integer>();
    
    public PilhaDeTabelas retorneEscopos() {
        return this.escopos;
    }

    //programa : ddl (dml)? EOF;
    @Override
    public Object visitPrograma(SQLoopParser.ProgramaContext ctx) {
        
        escopos.empilhar(tabelaDeSimbolos);
        
        tipos.add("string");
        tipos.add("inteiro");
        tipos.add("u_inteiro");
        tipos.add("a_inteiro");
        tipos.add("date");
        tipos.add("tabela");
        tipos.add("timestamp");
        visitDdl(ctx.ddl());

        //Validação das relacoes declaradas
        if(!relacoesDeclaradas.isEmpty()) {
            for(Relationship relacao : relacoesDeclaradas.keySet()) {
                //Acusa erro se a tabela relacionada não foi declarada
                if(!escopos.getGlobal().existeSimbolo(relacao.getTabelaRelacionada())) {
                    mensagem.append("Linha "+ relacoesDeclaradas.get(relacao) +": tentativa de relacionamento com uma tabela nao declarada\n");
                }
            }
        }
        
        if (ctx.dml() != null) {
            visitDml(ctx.dml());
        }

        return null;
    }

    /////////////////////////////////// DDL ////////////////////////////////////
    //ddl : '@DDL' declaracoes '@endDDL';
    @Override
    public Object visitDdl(SQLoopParser.DdlContext ctx) {
        visitDeclaracoes(ctx.declaracoes());
         List<Table> tabelas = tabelaDeSimbolos.getTables();
        for(Table tabela1 : tabelas) {
            for(Relationship rp : tabela1.getAllBelongsTo()) {
                String nome = rp.tabelaRelacionada;
                if(!tabelaDeSimbolos.existeSimbolo(nome))
                    mensagem.append("Linha " + rp.linha + ": tabela " + nome + " nao declarada\n");
            }  
            for(Relationship rp : tabela1.getAllHasMany()) {
                String nome = rp.tabelaRelacionada;
                if(!tabelaDeSimbolos.existeSimbolo(nome))
                    mensagem.append("Linha " + rp.linha + ": tabela " + nome + " nao declarada\n");
                
            }
            for(Relationship rp : tabela1.getAllHasOne()) {
                String nome = rp.tabelaRelacionada;
                if(!tabelaDeSimbolos.existeSimbolo(nome))
                    mensagem.append("Linha " + rp.linha + ": tabela " + nome + " nao declarada\n");
                
            }
        }
        return null;
    }

    //tabela : '$' IDENT;
    @Override
    public Object visitTabela(SQLoopParser.TabelaContext ctx) {
        return ctx.IDENT().toString();
    }

    //declaracoes : 'Table' IDENT '{' definicoes (relacoes)?  '}' (declaracoes)?;
    @Override
    public Object visitDeclaracoes(SQLoopParser.DeclaracoesContext ctx) {
        //Declara Table com IDENT como nome
        Table tabela = new Table();
        tabela.Table((String) ctx.IDENT().getText());

        //Adiciona Table à Tabela de Símbolos
        tabelaDeSimbolos.adicionarSimbolo(tabela.getNome(), "tabela", null, null);
        tabelaDeSimbolos.addTabela(tabela);

        //Adiciona atributos à Table
        if (ctx.definicoes() != null) {
            visitDefinicoes(ctx.definicoes(), tabela);
        }

        //Adiciona relacoes à Table
        if (ctx.relacoes() != null) {
            visitRelacoes(ctx.relacoes(), tabela);
        }

        if (ctx.declaracoes() != null) {
            visitDeclaracoes(ctx.declaracoes());
        }
        return null;
    }

    //definicoes : tabela '->' def_metodos ';' (definicoes)?;
    public Object visitDefinicoes(SQLoopParser.DefinicoesContext ctx, Table tabela) {
        if (ctx.tabela() != null) {
            String nomeTabela = (String) visitTabela(ctx.tabela());
            //Acusa erro se o nome da tabela não existir
            if (!tabelaDeSimbolos.existeSimbolo(nomeTabela)) {
                mensagem.append("Linha " + ctx.tabela().linha + ": tabela " + nomeTabela + " não declarada.\n");
            }
        }

        if (ctx.def_metodos() != null) {
            visitDef_metodos(ctx.def_metodos(), tabela);
        }

        if (ctx.definicoes() != null) {
            visitDefinicoes(ctx.definicoes(), tabela);
        }

        return null;
    }

    //def_metodos : 'aincrement' '(' var_int ')' | 'integer' '(' var_int ')' ('->' 'unsigned' '()' )? |
    //		  'string' '(' var_str ')' | 'date' '(' var_date ')' | 'genTimestamps''()';
    public Object visitDef_metodos(SQLoopParser.Def_metodosContext ctx, Table tabela) {
        String nome = "";
        String nome2 = "";
        String tipo = "";
        int linha = 0;

        //Define o tipo de acordo com a variável
        switch (ctx.tipo_def) {
            case 0: 
                nome = (String) visitVar_int(ctx.var_int());
                linha = ctx.var_int().linha;
                tipo = "a_inteiro";
                break;
            case 1: //Caso integer(var_int)                
                nome = (String) visitVar_int(ctx.var_int());
                linha = ctx.var_int().linha;
                tipo = "inteiro";
                break;
            case 2: //Caso integer(var_int)->unsigned()
                nome = (String) visitVar_int(ctx.var_int());
                linha = ctx.var_int().linha;
                tipo = "u_inteiro";
                break;
            case 3: //Caso string(var_str)
                nome = (String) visitVar_str(ctx.var_str());
                linha = ctx.var_str().linha;
                tipo = "string";
                break;
            case 4: //Caso date(var_date)
                nome = (String) visitVar_date(ctx.var_date());
                linha = ctx.var_date().linha;
                tipo = "data";
                break;
            case 5:
                nome = "created_at";
                nome2 = "updated_at";             
                tipo = "timestamp";
                break;
        }

        //Acusa erro se já existe um atributo com esse nome na tabela
        if (nome != "" && tabela.existeAtributo(nome)) {
            mensagem.append("Linha " + linha + ": atributo " + nome + " ja declarado anteriormente\n");
        }

        //Adiciona aos atributos da Table
        EntradaTabelaDeSimbolos entrada = new EntradaTabelaDeSimbolos(nome, tipo, null, null, null, null);
        tabela.addAtributo(entrada);
        if(!nome2.equals("")) {
              EntradaTabelaDeSimbolos entrada2 = new EntradaTabelaDeSimbolos(nome2, tipo, null, null, null, null);
              tabela.addAtributo(entrada2);
        }
        

        return null;
    }

    //var_int : '\'' IDENT '\'';
    @Override
    public Object visitVar_int(SQLoopParser.Var_intContext ctx) {
        return ctx.IDENT().getText();
    }

    //var_str : '\'' IDENT '\'';
    @Override
    public Object visitVar_str(SQLoopParser.Var_strContext ctx) {
        return ctx.IDENT().getText();
    }

    //var_date : '\'' IDENT '\'';
    @Override
    public Object visitVar_date(SQLoopParser.Var_dateContext ctx) {
        return ctx.IDENT().getText();
    }

    //relacoes : 'Relationships' '{' rel_def '}';
    
    public Object visitRelacoes(SQLoopParser.RelacoesContext ctx, Table tabela) {
        visitRel_def(ctx.rel_def(), tabela);
        return null;
    }

    //rel_def : tabela '->' rel_metodos ';' (rel_def)? ;
    
    public Object visitRel_def(SQLoopParser.Rel_defContext ctx, Table tabela) {
        String nome = (String) visitTabela(ctx.tabela());
        
        //Acusa erro se o nome utilizado for diferente do nome da tabela do escopo atual
        if(!tabela.getNome().equals(nome)) {
            mensagem.append("Linha "+ ctx.tabela().linha +": definicao de relacionamento de tabela fora do escopo\n");
        }
        
        visitRel_metodos(ctx.rel_metodos(), tabela);
        
        if (ctx.rel_def() != null) {
            visitRel_def(ctx.rel_def());
        }
        return null;
    }

    //rel_metodos : 'belongsTo' '(' var_str ')' | 'hasMany' '(' var_str ')';
    
    public Object visitRel_metodos(SQLoopParser.Rel_metodosContext ctx, Table tabela) {
       
        Tipo tipo = Tipo.belongsTo;
        int linha = 0;
        String tabelaRelacionada = "";
        switch (ctx.tipo_rel) {
            case 0: //Caso belongsTo                
                tabelaRelacionada = (String)visitVar_str(ctx.var_str());
                tipo = Tipo.belongsTo;
                linha = ctx.var_str().linha;
                if(!tabela.existeAtributo(tabelaRelacionada+"_id"))
                    mensagem.append("Linha "+ linha +": chave estrangeira "+tabelaRelacionada+"_id nao declarada\n");
                tabela.addRelacaoBelongsTo(new Relationship(tabela.getNome(), tabelaRelacionada, tipo, linha));
                
                break;
            case 1: //Caso hasMany
                tabelaRelacionada = (String)visitVar_str(ctx.var_str());
                tipo = Tipo.hasMany;
                linha = ctx.var_str().linha;
                tabela.addRelacaoHasMany(new Relationship(tabela.getNome(), tabelaRelacionada, tipo, linha));
                if(!tabela.existeAtributo(tabelaRelacionada+"_id"))
                    mensagem.append("Linha "+ linha +": chave estrangeira "+tabelaRelacionada+"_id nao declarada\n");
                break;
            case 2: //Caso hasOne
                tabelaRelacionada = (String)visitVar_str(ctx.var_str());
                tipo = Tipo.hasOne;
                linha = ctx.var_str().linha;
                tabela.addRelacaoHasOne(new Relationship(tabela.getNome(), tabelaRelacionada, tipo, linha));
                if(!tabela.existeAtributo(tabelaRelacionada+"_id"))
                    mensagem.append("Linha "+ linha +": chave estrangeira "+tabelaRelacionada+"_id nao declarada\n");
                break;
        }
       
        //Adiciona relacao ao hashmap de relacoes declaradas
   //     relacoesDeclaradas.put(relacao, linha);
        
        return null;
    }
    /////////////////////////////// FIM DDL ////////////////////////////////////

    /////////////////////////////////// DML ////////////////////////////////////
    @Override
    public Object visitDml(SQLoopParser.DmlContext ctx) {
        if(ctx.comandos() != null)
            visitComandos(ctx.comandos());
        return null;
    }

    @Override
    public Object visitCmd(SQLoopParser.CmdContext ctx) {
       if(ctx.tabela() != null) {
           String tabelaStr = ctx.tabela().IDENT.getText();
           if(ctx.insercao() != null) {
               ArrayList<String> atributos = (ArrayList<String>) visitInsercao(ctx.insercao());
               Table tabela = tabelaDeSimbolos.getTable(tabelaStr); 
               ArrayList<EntradaTabelaDeSimbolos> atributosTabela = retiraAtributos(tabela.getAtrs());
               if(atributosTabela.size() < atributos.size())
                   mensagem.append("Linha "+ ctx.tabela().linha +": quantidade de parametros diferente da quantidade de atributos\n");
               else {
                   for(int i = 0; i < atributos.size(); i++) {
                       EntradaTabelaDeSimbolos entrada = atributosTabela.get(i);
                       String atributo = atributos.get(i);
                       if(atributo.equals("inteiro")) {
                           if(!entrada.getTipo().equals("u_inteiro") || entrada.getTipo().equals("inteiro")) {
                               mensagem.append("Linha "+ ctx.tabela().linha +": tipos diferentes entre parametro e atributo "+ entrada.getNome()+"\n");
                           }
                       }
                       else {
                           if(!atributo.equals(entrada.getTipo())) mensagem.append("Linha "+ ctx.tabela().linha +": tipos diferentes entre parametro e atributo "+entrada.getNome()+"\n");
                       }
                           
                   }
               }                   
           }
       }
       return null;
    }

    @Override
    public Object visitComandos(SQLoopParser.ComandosContext ctx) {
        if(ctx.cmd() != null)
            visitCmd(ctx.cmd());
        if(ctx.comandos() != null) {
            visitComandos(ctx.comandos());
        }
        return null;
    }

    @Override
    public Object visitInsercao(SQLoopParser.InsercaoContext ctx) {
        if(ctx.valores() != null) {
            ArrayList<String> atributos = (ArrayList<String>) visitValores(ctx.valores());
            return atributos;
        }
        return null;
    }

    @Override
    public Object visitValores(SQLoopParser.ValoresContext ctx) {
        ArrayList<String> ret = new ArrayList<String>();
        if(ctx.valor() != null)
        {
            String str = (String) visitValor(ctx.valor());
            ret.add(str);
        }
        if(ctx.mais_valor() != null) {
            ArrayList<String> retorno = (ArrayList) visitMais_valor(ctx.mais_valor());
            ret.addAll(retorno);
        }
        
        return ret;
    }

    @Override
    public Object visitMais_valor(SQLoopParser.Mais_valorContext ctx) {
        ArrayList<String> ret = new ArrayList<String>();
        if(ctx.valor() != null) {    
            for(SQLoopParser.ValorContext ctx1 : ctx.valor()) {
                String str = (String) visitValor(ctx1);
                ret.add(str);
            }
        }
        return ret;
    }

    @Override
    public Object visitValor(SQLoopParser.ValorContext ctx) {
        if(ctx.valor_date() != null)
            return "date";
        if(ctx.valor_int() != null)
            return "inteiro";
        if(ctx.valor_str() != null)
            return "string";
        return null;
    }

    private ArrayList<EntradaTabelaDeSimbolos> retiraAtributos(ArrayList<EntradaTabelaDeSimbolos> atributos) {
        ArrayList<EntradaTabelaDeSimbolos> retorno = new ArrayList<EntradaTabelaDeSimbolos>();
        for(EntradaTabelaDeSimbolos str : atributos) {
            if(!(str.getTipo().equals("a_inteiro") || str.getTipo().equals("timestamp")))
            {
                retorno.add(str);
            }
           
        }
        System.out.println(retorno);
        return retorno;
    }
    
    
    
    
    
    

}
