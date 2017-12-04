/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiladorest3;

import java.util.ArrayList;

/**
 *
 * @author Thiago
 */
public class Table {
    private String nome;
    private ArrayList<EntradaTabelaDeSimbolos> atributos = new ArrayList<EntradaTabelaDeSimbolos>();
    private ArrayList<EntradaTabelaDeSimbolos> relacoes = new ArrayList<EntradaTabelaDeSimbolos>();
    
    
    public void Table(String nome) {
        this.nome = nome;
    }
    
    public boolean existeAtributo(String nome) {
        for(EntradaTabelaDeSimbolos atributo : atributos) {
            if(atributo.getNome().equals(nome))
                return true;
        }
        return false;
    }
    public void addAtributo(EntradaTabelaDeSimbolos entrada) {
        this.atributos.add(entrada);
    }
    
    public EntradaTabelaDeSimbolos procuraAtributo(String nome) {
        for(EntradaTabelaDeSimbolos entrada : this.atributos) {
            if(entrada.getNome().equals(nome))
                return entrada;
        }
        return null;
    }
    
    public ArrayList<EntradaTabelaDeSimbolos> getAtrs() {
        return this.atributos;
    }
    
    
    public void addRelacao(EntradaTabelaDeSimbolos entrada) {
        this.relacoes.add(entrada);
    }
    public boolean existeRelacao(String nome) {
        for(EntradaTabelaDeSimbolos relacao : relacoes) {
            if(relacao.getNome().equals(nome))
                return true;
        }
        return false;
    }
    
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome () {
        return this.nome;
    }
}
