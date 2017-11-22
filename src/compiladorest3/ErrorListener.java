/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiladorest3;

import java.util.BitSet;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.ParseCancellationException;

/**
 *
 * @author matheus
 */
public class ErrorListener implements ANTLRErrorListener{
    Mensagem mensagem;    

    ErrorListener(Mensagem out) {
        this.mensagem = out; //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void syntaxError(Recognizer<?, ?> rcgnzr, Object o, int i, int i1, String string, RecognitionException re) {
        Token token = (Token)o; 
        
        if(!mensagem.errou) {   
            if(token.getText() == "<EOF>")
                mensagem.append("Linha " + i + ":" + " erro sintatico proximo a EOF" + "\nFim da compilacao\n");
            else
                mensagem.append("Linha " + i + ":" + " erro sintatico proximo a "+ token.getText() + "\nFim da compilacao\n");
        }
        throw new ParseCancellationException();

    }

    @Override
    public void reportAmbiguity(Parser parser, DFA dfa, int i, int i1, boolean bln, BitSet bitset, ATNConfigSet atncs) {
     
    }

    @Override
    public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitset, ATNConfigSet atncs) {
    }

    @Override
    public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atncs) {
    }
    
}
