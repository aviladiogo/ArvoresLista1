/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ed1.unicap.ArvoresBinarias;

/**
 *
 * @author Diogo
 */
class QueueNode <T> {
    private T info;
    private QueueNode<T> prox;
    
    QueueNode (T valor) {
        info = valor;
    }
    void setInfo(T valor) {
        info = valor;
    }
    void setProx (QueueNode<T> novoProx) {
        prox = novoProx;
    }
    T getInfo() {
        return info;
    }
    QueueNode<T> getProx() {
        return prox;
    }    
}
