/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ed1.unicap.ArvoresBinarias;

public class Queue <T> {
    private QueueNode<T> inicio;
    private QueueNode<T> fim;
    
    public boolean isEmpty() {
        if (inicio == null) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean isFull () {
        return false;
    }
    
    public T head () {
        return inicio.getInfo();
    }
    
    public void enqueue (T valor) { // enfileira - inserir no final
        QueueNode<T> novo = new QueueNode(valor);
        if (isEmpty() == true) {
            inicio = novo;
            fim = novo;
        }
        else {
            fim.setProx(novo);
            fim = novo;
        }
    }
    
    public T dequeue () { // desenfileirar - remover o primeiro
        QueueNode<T> aux = inicio;
        if (inicio == fim) {
            inicio = null;
            fim = null;
        }
        else {
            inicio = inicio.getProx();
        }
        return aux.getInfo();
    }
}
