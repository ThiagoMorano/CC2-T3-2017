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
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 *
 * @author Thiago, Matheus
 */
public class Visitor extends SQLoopBaseVisitor {
    PilhaDeTabelas escopos = new PilhaDeTabelas();
    TabelaDeSimbolos tabelaDeSimbolos = new TabelaDeSimbolos("global");
    Mensagem mensagem = new Mensagem();
    ArrayList<String> tipos = new ArrayList<String>();
    String escopo = "";
    String nomeFuncaoOuProc = "";
    
    
    public PilhaDeTabelas retorneEscopos() {
            return this.escopos;
    }

    //programa : ddl (dml)? EOF;
   @Override
    public Object visitPrograma(SQLoopParser.ProgramaContext ctx) {
        
        tipos.add("literal");
        tipos.add("inteiro");
        tipos.add("u_inteiro");
        tipos.add("data");
        tipos.add("tabela");
        
        visitDdl(ctx.ddl());
        
        if(ctx.dml() != null) {
            //visitDml(ctx.dml());
        }
        
        return null;
    }

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
        tabela.Table((String)ctx.IDENT().getText());
        
        //Adiciona Table à Tabela de Símbolos
        tabelaDeSimbolos.adicionarSimbolo(tabela.getNome(), "tabela", null, null);
        
        
        //Adiciona atributos à Table
        if(ctx.definicoes() != null) {
            visitDefinicoes(ctx.definicoes(), tabela);
        }
        
        
        //Adiciona relacoes à Table
        
        
        if(ctx.declaracoes() != null) {
            visitDeclaracoes(ctx.declaracoes());
        }
        return null;
    }

    //definicoes : tabela '->' def_metodos ';' (definicoes)?;
    public Object visitDefinicoes(SQLoopParser.DefinicoesContext ctx, Table tabela) {
        if(ctx.tabela() != null) {
            String nomeTabela = (String) visitTabela(ctx.tabela());
            if(!tabelaDeSimbolos.existeSimbolo(nomeTabela)) { //Se o nome da tabela não existir
                mensagem.append("Linha "+ ctx.tabela().linha + ": tabela "+ nomeTabela + " não declarada.\n");
            }
        }
        
        if(ctx.def_metodos() != null) {
            visitDef_metodos(ctx.def_metodos(), tabela);
        }
        
        if(ctx.definicoes() != null) {
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

        
        if(nome != "" && tabela.existeAtributo(nome)) { //Se já existe um atributo com esse nome na tabela
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

    
    
    
    

    

    
    
    

}