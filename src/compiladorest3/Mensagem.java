 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/* BASEADO EM ARQUIVOS DO PROFESSOR DANIEL LUCRÉDIO */
package compiladorest3;

public class Mensagem {

    StringBuffer mensagem;
    boolean errou;
    public Mensagem() {
        mensagem = new StringBuffer();
        errou = false;
    }

    public void append(String texto) {
        mensagem.append(texto);
        errou = true;
        //System.out.println(mensagem.toString());
    }
    
    public boolean errou() {
        return errou;
    }
    @Override
    public String toString() {
        return mensagem.toString();
    }
}