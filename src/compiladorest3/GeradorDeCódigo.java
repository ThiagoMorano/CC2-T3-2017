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

    @Override
    public Object visitDeclaracoes(SQLoopParser.DeclaracoesContext ctx) {
        this.codigo.append("CREATE TABLE " + ctx.IDENT().getText() + " (\n");
        this.spaceCounter++;
        visitDefinicoes(ctx.definicoes());
        
        if (ctx.relacoes() != null) {
            visitRelacoes(ctx.relacoes());
        }
        
        this.spaceCounter--;
        this.codigo.append("\n);\n\n");
        
        if (ctx.declaracoes() != null) {
            visitDeclaracoes(ctx.declaracoes());
        }

        return null;
    }
    
    @Override
    public Object visitDefinicoes(SQLoopParser.DefinicoesContext ctx) {
        if (ctx.def_metodos() != null) {
            visitDef_metodos(ctx.def_metodos());
        }

        if (ctx.definicoes() != null) {
            this.codigo.append(", \n");
            visitDefinicoes(ctx.definicoes());
        }
        return null;
    }


    
    @Override
    public Object visitDef_metodos(SQLoopParser.Def_metodosContext ctx) {

        if (ctx.tipo_def == 0) {
            String atributo = (String) visitVar_int(ctx.var_int());
            append(atributo + " INT AUTO_INCREMENT PRIMARY KEY NOT NULL");
        } else if (ctx.tipo_def == 1) {
            String atributo = ctx.var_int().IDENT().getText();
            append(atributo + " INT NOT NULL");
        } else if (ctx.tipo_def == 2) {
            String atributo = ctx.var_int().IDENT().getText();
            append(atributo + " INT UNSIGNED NOT NULL");
        } else if (ctx.tipo_def == 3) {
            String atributo = ctx.var_str().IDENT.getText();
            append(atributo + " VARCHAR(255) NOT NULL");
        } else if (ctx.tipo_def == 4) {
            String atributo = ctx.var_date().IDENT.getText();
            append(atributo + " DATE NOT NULL");
        } else if (ctx.tipo_def == 5) {
            append("created_at TIMESTAMP DEFAULT '0000-00-00 00:00:00' NOT NULL,\n");
            append("updated_at TIMESTAMP DEFAULT '0000-00-00 00:00:00' NOT NULL");
        }
        return null;
    }

    @Override
    public Object visitVar_date(SQLoopParser.Var_dateContext ctx) {
        if (ctx != null) {
            return ctx.IDENT.getText();
        } else {
            return null;
        }
    }

    @Override
    public Object visitVar_str(SQLoopParser.Var_strContext ctx) {
        if (ctx != null) {
            return ctx.IDENT.getText();
        } else {
            return null;
        }
    }

    @Override
    public Object visitVar_int(SQLoopParser.Var_intContext ctx) {
        if (ctx != null) {
            return ctx.IDENT.getText();
        } else {
            return null;
        }
    }

    @Override
    public Object visitRelacoes(SQLoopParser.RelacoesContext ctx) {
        if (ctx.rel_def() != null) {
            visitRel_def(ctx.rel_def());
        }
        return null;
    }

    @Override
    public Object visitRel_def(SQLoopParser.Rel_defContext ctx) {
        if (ctx.rel_metodos() != null) {
            ArrayList<String> retorno = (ArrayList<String>) visitRel_metodos(ctx.rel_metodos());
            if (retorno != null) {
                this.codigo.append(",\n");
                System.out.println(retorno);
                String atributo = retorno.get(0);
                String tipo = retorno.get(1);
                String tabela = ctx.tabela().IDENT().getText();
                if (tipo.equals("belongsTo") || tipo.equals("hasMany")) {
                    this.append("FOREIGN KEY " + "(" + atributo + "_id) REFERENCES " + atributo + "(id)");
                }
            }
        }
        return null;
    }

    @Override
    public Object visitRel_metodos(SQLoopParser.Rel_metodosContext ctx) {
        if (ctx.var_str() != null) {
            ArrayList<String> retorno = new ArrayList<String>();
            retorno.add(ctx.var_str().IDENT().getText());
            System.out.println(ctx.tipo_rel);
            if (ctx.tipo_rel == 0) {
                retorno.add("belongsTo");
            }
            if (ctx.tipo_rel == 1) {
                retorno.add("hasMany");
            }
            if (ctx.tipo_rel == 2) {
                retorno.add("hasOne");
            }
            return retorno;
        }
        return null;
    }

    @Override
    public Object visitCmd(SQLoopParser.CmdContext ctx) {
        if (ctx.tabela() != null) {
            String tabelaStr = ctx.tabela().IDENT.getText();
            this.codigo.append("INSERT INTO " + tabelaStr + " VALUES (\n");
            spaceCounter++;
            if (ctx.insercao() != null) {
                visitInsercao(ctx.insercao());
            }
            spaceCounter--;
            this.codigo.append("\n);\n\n");
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
            visitValor(ctx.valor());
            this.codigo.append("\t" + ctx.valor().getText());
        }
        if(ctx.mais_valor() != null) {
            visitMais_valor(ctx.mais_valor());
        }
        
        return ret;
    }
    
    @Override
    public Object visitMais_valor(SQLoopParser.Mais_valorContext ctx) {
        ArrayList<String> ret = new ArrayList<String>();
        if(ctx.valor() != null) {
            int i = 0;
            for(SQLoopParser.ValorContext ctx1 : ctx.valor()) {
                this.codigo.append(", \n");
                this.codigo.append("\t" + ctx1.getText());
            }
        }
        return ret;
    }

}
