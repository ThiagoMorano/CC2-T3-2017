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
 * 
 * Classe usada para representar as tabelas (SQL) dentro dos escopos da pilha de tabelas de símbolos.
 */
public class Table {
    private String nome;
    private ArrayList<EntradaTabelaDeSimbolos> atributos = new ArrayList<EntradaTabelaDeSimbolos>();
    
    private ArrayList<Relationship> relacoesHasMany = new ArrayList<Relationship>();
    private ArrayList<Relationship> relacoesBelongsTo = new ArrayList<Relationship>();
    private ArrayList<Relationship> relacoesHasOne = new ArrayList<Relationship>();
    
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
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome () {
        return this.nome;
    }
    
    
    //////Relações
    
    
    //Funções para adicionar relações de determinado tipo
    public void addRelacaoHasMany(Relationship rel) {        
        this.relacoesHasMany.add(rel);
    }
    public void addRelacaoBelongsTo(Relationship rel) {
        this.relacoesBelongsTo.add(rel);
    }
    public void addRelacaoHasOne(Relationship rel) {
        this.relacoesHasOne.add(rel);
    }
    
    //Funções para verificar existência de relação de determinado tipo
    public boolean existeRelacaoHasMany(String nome) {
        for(Relationship relacao : relacoesHasMany) {
            if(relacao.getTabelaRelacionada().equals(nome))
                return true;
        }
        return false;
    }
    public boolean existeRelacaoBelongsTo(String nome) {
       for(Relationship relacao : relacoesBelongsTo) {
            if(relacao.getTabelaRelacionada().equals(nome))
                return true;
        }
        return false;
    }
    public boolean existeRelacaoHasOne(String nome) {
       for(Relationship relacao : relacoesHasOne) {
            if(relacao.getTabelaRelacionada().equals(nome))
                return true;
        }
        return false;
    }
}
