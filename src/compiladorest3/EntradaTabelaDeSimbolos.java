/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiladorest3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucas-pessoa
 */
public class EntradaTabelaDeSimbolos {
    private String nome, tipo, tipo_retorno;
    private List<String> parametros;    
    private TabelaDeSimbolos subTabeladoTable;
    private List<String> tipos_parametros;
    
    
    public EntradaTabelaDeSimbolos(String nome, String tipo, List<String> listaPassada, TabelaDeSimbolos sub, List<String> tipo_par, String tipo_retorno) 
    {
        this.nome = nome;
        this.tipo = tipo;
        this.tipo_retorno = tipo_retorno;
        this.subTabeladoTable = sub;
        this.tipos_parametros = tipo_par;
        if(listaPassada == null)
        {
            this.parametros = listaPassada;
        }else
        {
	    //inicializacao dos parametros
            this.parametros = new ArrayList<String>();
        
            for(int i=0; i< listaPassada.size(); i++)
            {
               this.parametros.add(i,listaPassada.get(i));
            }
        }

        
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public TabelaDeSimbolos getsubTabela()
    {
        return this.subTabeladoTable;
    }
    
    public List<String> getListaPar()
    {
        return this.parametros;
    }
    
     public List<String> getListaRetorno()
    {
        return this.tipos_parametros;
    }
            
    
    public String getTipo() {
        return this.tipo;
    }
    
    @Override
    public String toString() {
        return nome+"("+tipo+")";
    }

    String getTipoRetorno() {
        return this.tipo_retorno;
    }
}