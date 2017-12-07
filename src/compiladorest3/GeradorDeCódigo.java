package compiladorest3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.antlr.v4.runtime.Token;

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

    @Override
    public Object visitDefinicoes(SQLoopParser.DefinicoesContext ctx) {
        if(ctx.def_metodos() != null) 
            visitDef_metodos(ctx.def_metodos());
       
        if(ctx.definicoes() != null) {
            this.codigo.append(", \n");
            visitDefinicoes(ctx.definicoes()); 
        }
        return null;
    }

    @Override
    public Object visitDef_metodos(SQLoopParser.Def_metodosContext ctx) {
       
        if(ctx.tipo_def == 0) {
            String atributo = (String) visitVar_int(ctx.var_int());
            append(atributo + " INTEGER UNSIGNED AUTO_INCREMENT FOREIGN KEY");
        }
        else if(ctx.tipo_def == 1) {
            String atributo = ctx.var_int().IDENT().getText();
            append(atributo + " INTEGER");             
        }
        else if(ctx.tipo_def == 2) {
            String atributo = ctx.var_int().IDENT().getText();
            append(atributo + " INTEGER UNSIGNED");
        }
        else if(ctx.tipo_def == 3) {
            String atributo = ctx.var_str().IDENT.getText();
            append(atributo + " VARCHAR(30)");
        }
        else if(ctx.tipo_def == 4) {
            String atributo = ctx.var_date().IDENT.getText();
            append(atributo + " DATE");
        }
        else if(ctx.tipo_def == 5) {
            append("created_at TIMESTAMP DEFAULT '0000-00-00 00:00:00',\n");
            append("update_at TIMESTAMP DEFAULT '0000-00-00 00:00:00'");
        }
        return null;
    }
    
    @Override
    public Object visitDeclaracoes(SQLoopParser.DeclaracoesContext ctx) {
         this.codigo.append("CREATE TABLE "+ctx.IDENT().getText()+" (\n");
         this.spaceCounter++; 
         visitDefinicoes(ctx.definicoes());
         if(ctx.relacoes() != null)
             visitRelacoes(ctx.relacoes());
         if(ctx.declaracoes() != null)
             visitDeclaracoes(ctx.declaracoes());
         this.spaceCounter--;
         this.codigo.append("\n)");
         return null;         
    }

    @Override
    public Object visitVar_date(SQLoopParser.Var_dateContext ctx) {
         if(ctx != null)       
            return ctx.IDENT.getText(); 
        else
            return null;
    }

    @Override
    public Object visitVar_str(SQLoopParser.Var_strContext ctx) {
         if(ctx != null)       
            return ctx.IDENT.getText(); 
        else
            return null;
    }

    @Override
    public Object visitVar_int(SQLoopParser.Var_intContext ctx) {
        if(ctx != null)       
            return ctx.IDENT.getText(); 
        else
            return null;
    }

    @Override
    public Object visitRelacoes(SQLoopParser.RelacoesContext ctx) {
        if(ctx.rel_def() != null) 
            visitRel_def(ctx.rel_def());
        return null;
    }

    @Override
    public Object visitRel_def(SQLoopParser.Rel_defContext ctx) {
        if(ctx.rel_metodos() != null) {
            ArrayList<String> retorno = (ArrayList<String>) visitRel_metodos(ctx.rel_metodos());
            if(retorno != null) {
                this.codigo.append(",\n");
                String atributo = retorno.get(0);
                String tipo = retorno.get(1);
                String tabela = ctx.tabela().IDENT().getText();
                if(tipo.equals("belongsTo")) {
                    this.append("FOREIGN KEY fk_"+tabela+"("+atributo+") REFERENCES "+atributo+"(id)");
                }
            }
        }
        return null;
    }

    @Override
    public Object visitRel_metodos(SQLoopParser.Rel_metodosContext ctx) {
        if(ctx.var_str() != null) {
            ArrayList<String> retorno = new ArrayList<String>();
            retorno.add(ctx.var_str().IDENT().getText());            
            if(ctx.tipo_rel == 1) retorno.add("belongsTo");       
            if(ctx.tipo_rel == 2) retorno.add("hasMany");
            if(ctx.tipo_rel == 3) retorno.add("hasOne");            
            return retorno;
        }
        return null;
    }
    
    
}
    
    

