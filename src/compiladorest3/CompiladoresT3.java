/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiladorest3;

import compiladorest3.SQLoopParser.ProgramaContext;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;

/**
 *
 * @author Thiago
 */
public class CompiladoresT3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
  
        Mensagem out = new Mensagem();
        File entrada = new File(args[0]);
            
        
         try{
        ANTLRInputStream  input = new ANTLRInputStream(new FileInputStream(entrada));
      
        SQLoopLexer lexer = new SQLoopLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SQLoopParser parser = new SQLoopParser(tokens);
        parser.addErrorListener(new ErrorListener(out));        
    
        ProgramaContext arvore = parser.programa();
        Visitor v = new Visitor();
        v.visitPrograma(arvore);
        if(v.mensagem.errou()) {
            System.out.print("Erro na compilação.\n\n");
            System.out.print(v.mensagem);
            v.mensagem.append("\nFim da compilacao\n");
            out = v.mensagem;
        }
        else {
            System.out.print("Compilou\n");
            out = v.mensagem;
            GeradorDeCódigo gerador = new GeradorDeCódigo(v.retorneEscopos());
            gerador.visitPrograma(arvore);
            out = gerador.codigo;                    
        }
        
        } catch (ParseCancellationException pce) {
            if (pce.getMessage() != null) {
                out.append(pce.getMessage());
                out.append("Fim da compilacao\n");              
            }
        }
     
        
        File saida = new File(args[1]);       
        PrintWriter pw = new PrintWriter(new FileWriter(saida));
        pw.print(out);
        pw.flush();
        pw.close();

        

    }
    
}
