package br.ed1.unicap.ArvoresBinarias;

  class ABBNode<T extends Comparable <T>>{
     private T info;
     private ABBNode<T> esquerda;
     private ABBNode<T> direita;
   
     ABBNode (T valor){
         info = valor;
     }

     void setInfo (T valor){
         info = valor;
     }

     T getInfo(){
         return info;
     }
     void setEsquerda(ABBNode novaEsquerda){
         esquerda = novaEsquerda;
     }

     ABBNode<T> getEsquerda(){
         return esquerda;
     }

     void setDireita(ABBNode novaDireita){
         esquerda = novaDireita;
     }

     ABBNode<T> getDireita(){
         return direita;
     }
    void insertNode (T value){
        if (value.compareTo(this.getInfo()) == 0) {
            System.out.println("Valor repetido.");
        }
        else if (value.compareTo(this.getInfo()) < 0) {
            if (this.esquerda == null){
                this.esquerda = new ABBNode (value);
            }
            else {
                this.esquerda.insertNode (value);
            }
        }
        else {
            if (this.direita == null){
                this.direita = new ABBNode (value);
            }
            else {
                this.direita.insertNode (value);
            }
        }
    }
}

