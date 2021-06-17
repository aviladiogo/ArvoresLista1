package testaarvore;
import br.ed1.unicap.ArvoresBinarias.ABB;
public class TestaArvore {


    public static void main(String[] args) {
        ABB<Integer> arv = new ABB();
        arv.insert(10);
        arv.insert(100);
        arv.insert(50);
        arv.insert(5);
        arv.insert(300);
        arv.insert (150);
        arv.insert (60);
        arv.insert (35);
        System.out.println("Valores em ordem crescente");
        arv.emOrdem();
        System.out.println("Menor valor: ");
        arv.Menor();
        System.out.println("Maior valor: ");
        arv.Maior();
        System.out.println("Numero de  Nós : ");
        arv.contaNós();
        System.out.println("Numero de Folhas: ");
        arv.contafolhas();
        System.out.println("Numero de Nós Nao terminais: ");
        arv.contaNaoFolha();

    }
    
}
