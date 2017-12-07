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
public class TabelaDeSimbolos {
    private String escopo;
    private List<EntradaTabelaDeSimbolos> simbolos;
    private List<Table> tables;
    
    public TabelaDeSimbolos(String escopo) {
        simbolos = new ArrayList<EntradaTabelaDeSimbolos>();
        tables = new ArrayList<Table>();
        this.escopo = escopo;
    }
    public Table getTable(String nome) {
        for(Table tabela : tables) {
            if(tabela.getNome().equals(nome))
                return tabela;
        }
        return null;
    }
    
    public String getEscopo() {
        return escopo;
    }
    public void addTable(Table tabela) {
        this.tables.add(tabela);
    }
    public void adicionarSimbolo(String nome, String tipo, List<String> parametros, TabelaDeSimbolos sub) {
        simbolos.add(new EntradaTabelaDeSimbolos(nome,tipo, parametros, sub, null, null));
    }
    
     public void adicionarSimbolo(String nome, String tipo, List<String> parametros, List<String> tipos_parametros, TabelaDeSimbolos sub,  String tipo_retorno) {
        simbolos.add(new EntradaTabelaDeSimbolos(nome,tipo, parametros, sub, tipos_parametros, tipo_retorno));
    }
    
    
    public void adicionarSimbolos(List<String> nomes, String tipo, List<String> parametros, TabelaDeSimbolos sub) {
        for(String s:nomes) {
            simbolos.add(new EntradaTabelaDeSimbolos(s, tipo, parametros, sub, null, null));
        }
    }
    
    //Metodo para recuperar um tipo associado a um nome por meio de uma pesquisa nos simbolos da tabela.	
    public String getTipo(String nome)
    {
        String tipo = null;
        for(int i = 0; i < simbolos.size(); i++) {
            if(simbolos.get(i).getNome().equals(nome)) {
                tipo = simbolos.get(i).getTipo();
            }
        }
        return tipo;
    }
    
    public EntradaTabelaDeSimbolos getElement(String nome)
    {
        EntradaTabelaDeSimbolos entrada = null;
        for(int i = 0; i < simbolos.size(); i++) {
            if(simbolos.get(i).getNome().equals(nome)) {
                entrada = simbolos.get(i);
            }
        }
        return entrada;
    }
    //Metodo para recuperar uma subtabela a partir de um tipo informado nos simbolos da tabela
    public TabelaDeSimbolos getSubtabela(String tipo)
    {
        for(int i = 0; i < simbolos.size(); i++) {
            if(simbolos.get(i).getNome().equals(tipo)) {
                return simbolos.get(i).getsubTabela();
            }
        }
        
        return null;
    }
    
    //metodo para recuperar a lista de parametros associada a um nome de uma subrotina
    public List<String> getListaPar(String nomeSubrotina)
    {
        List<String> ListaPar = new ArrayList<String>();
        
        for(int i = 0; i < simbolos.size(); i++) {
            if(simbolos.get(i).getNome().equals(nomeSubrotina)) {
                ListaPar = simbolos.get(i).getListaPar();
                return ListaPar;
            }
        }
        
       return null; 
    }
    
    public List<String> getListaTipos(String nomeSubrotina)
    {
        List<String> ListaPar = new ArrayList<String>();
        
        for(int i = 0; i < simbolos.size(); i++) {
            if(simbolos.get(i).getNome().equals(nomeSubrotina)) {
                ListaPar = simbolos.get(i).getListaRetorno();
                return ListaPar;
            }
        }
        
       return null; 
    }

    public boolean existeSimbolo(String nome) {
        for(EntradaTabelaDeSimbolos etds:simbolos) {
            if(etds.getNome().equals(nome)) {
                return true;
            }
        }
        for(Table tabela : tables) {
            if(tabela.existeAtributo(nome) || tabela.getNome().equals(nome))
                return true;
            
        }
        return false;
    }
    
    @Override
    public String toString() {
        String ret = "Escopo: "+escopo;
        for(EntradaTabelaDeSimbolos etds:simbolos) {
            ret += "\n   "+etds;
        }
        return ret;
    }

    void addTabela(Table tabela) {
        tables.add(tabela);
    }
}