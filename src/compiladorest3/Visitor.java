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
        
        tipos.add("literal");
        tipos.add("inteiro");
        tipos.add("u_inteiro");
        tipos.add("data");
        tipos.add("tabela");

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

        //Adiciona atributos à Table
        if (ctx.definicoes() != null) {
            visitDefinicoes(ctx.definicoes(), tabela);
        }

        //Adiciona relacoes à Table
        if (ctx.relacoes() != null) {
            TabelaDeSimbolos novaTS = new TabelaDeSimbolos(ctx.IDENT().getText());
            
            //Cria um novo escopo com o nome da tabela cujas relações serão declaradas
            escopos.empilhar(novaTS);
            
            visitRelacoes(ctx.relacoes());
            
            escopos.desempilhar();
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
        String tipo = "";
        int linha = 0;

        //Define o tipo de acordo com a variável
        switch (ctx.tipo_def) {
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
                tipo = "literal";
                break;
            case 4: //Caso date(var_date)
                nome = (String) visitVar_date(ctx.var_date());
                linha = ctx.var_date().linha;
                tipo = "data";
                break;
        }

        //Acusa erro se já existe um atributo com esse nome na tabela
        if (nome != "" && tabela.existeAtributo(nome)) {
            mensagem.append("Linha " + linha + ": identificador " + nome + " ja declarado anteriormente\n");
        }

        //Adiciona aos atributos da Table
        EntradaTabelaDeSimbolos entrada = new EntradaTabelaDeSimbolos(nome, tipo, null, null, null, null);
        tabela.addAtributo(entrada);

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
    @Override
    public Object visitRelacoes(SQLoopParser.RelacoesContext ctx) {
        visitRel_def(ctx.rel_def());
        return null;
    }

    //rel_def : tabela '->' rel_metodos ';' (rel_def)? ;
    @Override
    public Object visitRel_def(SQLoopParser.Rel_defContext ctx) {
        String nome = (String) visitTabela(ctx.tabela());
        
        //Acusa erro se o nome utilizado for diferente do nome da tabela do escopo atual
        if(!escopos.topo().getEscopo().equals(nome)) {
            mensagem.append("Linha "+ ctx.tabela().linha +": definicao de relacionamento de tabela fora do escopo\n");
        }
        
        visitRel_metodos(ctx.rel_metodos());
        
        if (ctx.rel_def() != null) {
            visitRel_def(ctx.rel_def());
        }
        return null;
    }

    //rel_metodos : 'belongsTo' '(' var_str ')' | 'hasMany' '(' var_str ')';
    @Override
    public Object visitRel_metodos(SQLoopParser.Rel_metodosContext ctx) {
        Relationship relacao = new Relationship(escopos.topo().getEscopo());
        
        String tabelaRelacionada = "";
        Tipo tipo = Tipo.belongsTo;
        int linha = 0;
        
        switch (ctx.tipo_rel) {
            case 0: //Caso belongsTo
                tabelaRelacionada = (String)visitVar_str(ctx.var_str());
                tipo = Tipo.belongsTo;
                linha = ctx.var_str().linha;
                break;
            case 1: //Caso hasMany
                tabelaRelacionada = (String)visitVar_str(ctx.var_str());
                tipo = Tipo.hasMany;
                linha = ctx.var_str().linha;
                break;
            case 2: //Caso hasOne
                tabelaRelacionada = (String)visitVar_str(ctx.var_str());
                tipo = Tipo.hasOne;
                linha = ctx.var_str().linha;
                break;
        }

        relacao.setTabelaRelacionada(tabelaRelacionada);
        relacao.setTipo(tipo);
        
        //Adiciona relacao ao hashmap de relacoes declaradas
        relacoesDeclaradas.put(relacao, linha);
        
        return null;
    }
    /////////////////////////////// FIM DDL ////////////////////////////////////

    /////////////////////////////////// DML ////////////////////////////////////
    @Override
    public Object visitDml(SQLoopParser.DmlContext ctx) {
        return super.visitDml(ctx); //To change body of generated methods, choose Tools | Templates.
    }

}
