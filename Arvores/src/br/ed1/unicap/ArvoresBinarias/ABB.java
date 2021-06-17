package br.ed1.unicap.ArvoresBinarias;

public class ABB<T extends Comparable<T>> {

    private ABBNode<T> raiz;

    public boolean isEmpty() {
        if (raiz == null) {
            return true;
        } else {
            return false;
        }
    }

    public void insert(T valor) {
        if (this.isEmpty() == true) {
            raiz = new ABBNode(valor);
        } else { // árvore não vazia
            raiz.insertNode(valor);
        }
    }

    public void emOrdem() {
        if (this.isEmpty() == true) {
            System.out.println("Árvore vazia");
        } else {
            percorrerEmOrdem(raiz);
        }
    }

    public void Menor() {// Letra B
        if (this.isEmpty() == true) {
            System.out.println("Árvore vazia");
        } else {
            MenorValor(raiz);
        }
    }
    public void Maior() {// Letra D
        if (this.isEmpty() == true) {
            System.out.println("Árvore vazia");
        } else {
            MaiorValor(raiz);
        }
    }
    
     public void insertNaoRecursivo (T valor) { // Letra E
        ABBNode<T> aux;
        ABBNode<T> novo = new ABBNode (valor);
        if (this.isEmpty() == true) {
            raiz = novo;
        }
        else {
            aux = raiz;
            while (true) {
                if (valor.compareTo (aux.getInfo()) == 0) {
                    System.out.println("Valor repetido.");
                    System.out.println("Inserção não efetuada");
                    return;
                }
                else if (valor.compareTo(aux.getInfo()) < 0) { // esquerda
                    if (aux.getEsquerda() != null) {
                        aux = aux.getEsquerda();
                    }
                    else {
                        aux.setEsquerda(novo);
                        System.out.println("Inserção efetuada");
                        return;
                    }
                }
                else { // direita
                    if (aux.getDireita() != null) {
                        aux = aux.getDireita();
                    }
                    else {
                        aux.setDireita(novo);
                        System.out.println("Inserção efetuada");
                        return;
                    }
                }            
            } // fim do while
        }          
    }
     public void contaNós(){ //Letra F
         int cont=0;
         Queue<ABBNode<T>> fila;
         ABBNode<T> aux;
         if(!isEmpty()){
             fila = new Queue();
             fila.enqueue(raiz);
             while(!fila.isEmpty()){
                 aux = fila.dequeue();
                 if(aux.getEsquerda() != null){
                     fila.enqueue(aux.getEsquerda());
                 }
                  if(aux.getDireita() != null){
                     fila.enqueue(aux.getDireita());
                 }
                  cont++;
             }
             System.out.println(cont);
         }
     }

     public void contafolhas(){ // Letra G
         int cont=0;
         Queue<ABBNode<T>> fila;
         ABBNode<T> aux;
         if(!isEmpty()){
             fila = new Queue();
             fila.enqueue(raiz);
             while(!fila.isEmpty()){
                 aux = fila.dequeue();
                 if(aux.getEsquerda() != null){
                     fila.enqueue(aux.getEsquerda());
                 }
                  if(aux.getDireita() != null){
                     fila.enqueue(aux.getDireita());
                 }
                  if(aux.getEsquerda() == null && aux.getDireita() == null){  // se for final, logo uma folha conta ela
                 cont++;
                 }
             }
             System.out.println(cont);
         }
     }     
      public void contaNaoFolha(){ // Letra G
         int cont=0;
         Queue<ABBNode<T>> fila;
         ABBNode<T> aux;
         if(!isEmpty()){
             fila = new Queue();
             fila.enqueue(raiz);
             while(!fila.isEmpty()){
                 aux = fila.dequeue();
                 if(aux.getEsquerda() != null){
                     fila.enqueue(aux.getEsquerda());
                 }
                  if(aux.getDireita() != null){
                     fila.enqueue(aux.getDireita());
                 }
                  if(aux.getEsquerda() != null && aux.getDireita() != null){  // se nao for final conta ela
                 cont++;
                 }
             }
             System.out.println(cont);
         }
     }
    
    private void percorrerEmOrdem(ABBNode<T> r) {
        if (r != null) {
            percorrerEmOrdem(r.getEsquerda());
            System.out.println(r.getInfo());
            percorrerEmOrdem(r.getDireita());
        }
    }

    private void MenorValor(ABBNode<T> r) { // Letra A
        if (r != null) {
            MenorValor(r.getEsquerda());
            if (r.getEsquerda() == null) {
                System.out.println(r.getInfo());
            }
        }
    }
    private void MaiorValor(ABBNode<T> r) { // Letra C
        if (r != null) {
            MaiorValor(r.getDireita());
            if (r.getDireita() == null) {
                System.out.println(r.getInfo());
            }
        }
    }
}
