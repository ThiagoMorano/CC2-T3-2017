/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiladorest3;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author lucas-pessoa
 */
public class PilhaDeTabelas {

    private LinkedList<TabelaDeSimbolos> pilha;

    public PilhaDeTabelas() {
        pilha = new LinkedList<TabelaDeSimbolos>();
    }
    public TabelaDeSimbolos getGlobal(){
        for(TabelaDeSimbolos tabela : pilha) {
            if(tabela.getEscopo().equals("global"))
                return tabela;
        }
        return null;
    }
    public void empilhar(TabelaDeSimbolos ts) {
        pilha.push(ts);
    }

    public TabelaDeSimbolos topo() {
        return pilha.peek();
    }

    public boolean existeSimbolo(String nome) {
        for (TabelaDeSimbolos ts : pilha) {
            if (ts.existeSimbolo(nome)) {
                return true;
            }
        }
        return false;
    }

    public void desempilhar() {
        TabelaDeSimbolos ret = pilha.pop();
        //Mensagem.append(ret.toString());
    }

    public List getTodasTabelas() {
        return pilha;
    }
}

