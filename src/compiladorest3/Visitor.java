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
    
    
    //declaracoes : 'Table' IDENT '{' definicoes (relacoes)?  '}' (declaracoes)?;
    @Override
    public Object visitDeclaracoes(SQLoopParser.DeclaracoesContext ctx) {
        
        return null;
    }


}