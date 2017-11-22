package compiladorest3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author matheus
 */
public class GeradorDeCódigo extends SQLoopBaseVisitor {

    Mensagem codigo = new Mensagem();
    PilhaDeTabelas escopos = new PilhaDeTabelas();
    int spaceCounter = 0;

    GeradorDeCódigo(PilhaDeTabelas escopos) {
        this.escopos = escopos;

    }

    public void append(String texto) {
        String espaços = "";
        for (int i = 0; i < spaceCounter; i++) {
            espaços += "\t";
        }
        this.codigo.append(espaços + texto);
    }
    
    /*public String getTipo(String tipo_basico) {
        switch (tipo_basico) {
            case "inteiro":
                return "int ";
            case "literal":
                return "char ";
            case "real":
                return "float ";
            case "logico":
                return "boolean ";
        }
        return null;
    }

    private String getChar(String tipo) {
        switch (tipo) {
            case "inteiro":
                return "%d";
            case "real":
                return "%f";
            case "literal":
                return "%s";
            default:
                return null;
        }

    }*/
}
