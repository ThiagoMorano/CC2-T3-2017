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
 * Classe utilizada para tratar as relações entre tabelas.
 * 
 * A relação é descrita da forma:
 * tabelaOrigem -(tipo)> tabelaRelacionada
 * onde a tabelaOrigem se relaciona da forma "tipo" com a tabelaRelacionada
 */


//Enum para indicar os possíveis tipos de relação
enum Tipo {
    hasMany, belongsTo, hasOne
}

public class Relationship {
    String tabelaOrigem;        //Tabela de onde parte a relacao
    String tabelaRelacionada;   //Tabela com que a de origem se relaciona
    
    Tipo tipo; //O tipo de relacao entre tabelas de origem e a tabela relacionada
    int linha;
    Relationship(String tOrigem, String tRelacionada, Tipo tpo, int linha) {
        this.tabelaOrigem = tOrigem;
        this.tabelaRelacionada = tRelacionada;
        this.tipo = tpo;
        this.linha = linha;
    }
    
    public Relationship(String tOrigem) {
        tabelaOrigem = tOrigem;
    }
  
    public void setTabelaRelacionada(String tRelacionada) {
        this.tabelaRelacionada = tRelacionada;
    }
    public void setTipo(Tipo tpo) {
        this.tipo = tpo;
    }
    
    public boolean existeRelacao(String nome) {
        if(tabelaRelacionada.equals(nome)) {
                return true;
        }
        return false;
    }
    
    public Tipo getTipo () {
        return this.tipo;
    }
    
    public String getTabelaOrigem() {
        return this.tabelaOrigem;
    }
    
    public String getTabelaRelacionada() {
        return this.tabelaRelacionada;
    }    
}
