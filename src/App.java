import com.projeto.atribuicaoreferencia.MeuObj;
import com.projeto.no.No;
import com.projeto.pilha.Pilha;

public class App {
    public static void main(String[] args){
        testePilha();
    }

    private static void testeAtribuicaoEReferencia(){
        //Atribuição
        int intA = 1;
        int intB = intA;
        System.out.println("intA= "+ intA + " intB= " + intB);
        intA = 2;
        System.out.println("intA= "+ intA + " intB= " + intB);
        //Referência
        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA;
        System.out.println("objA= "+ objA + " objB= " + objB);
        objA.setNum(2);
        System.out.println("objA= "+ objA + " objB= " + objB);
    }
    private static void testeNo(){
        No<String> noS1 = new No("Conteúdo no1");
        No<String> noS2 = new No("Conteúdo no2");
        noS1.setNext(noS2);
        No<String> noS3 = new No("Conteúdo no3");
        noS2.setNext(noS3);
        No<String> noS4 = new No("Conteúdo no4");
        noS3.setNext(noS4);
        System.out.println(noS1);
        System.out.println(noS1.getNext());
        System.out.println(noS1.getNext().getNext());
        System.out.println(noS1.getNext().getNext().getNext());
        System.out.println(noS1.getNext().getNext().getNext().getNext());
        No<Integer> noI1 = new No(1);
        No<Integer> noI2 = new No(2);
        noI1.setNext(noI2);
        System.out.println(noI1);
        System.out.println(noI1.getNext());
        System.out.println(noI1.getNext().getNext());
    }

    private static void testePilha(){
        Pilha<Integer> minha_pilha = new Pilha<Integer>();
        minha_pilha.push(1);
        minha_pilha.push(2);
        System.out.println("Topo da pilha: " + minha_pilha.top());
        System.out.println("Popping topo da pilha: " + minha_pilha.pop());
        System.out.println("Minha pilha está vazia? " + minha_pilha.isEmpty());
        System.out.println("Novo topo da pilha: " + minha_pilha.top());
        System.out.println("Popping topo da pilha: " + minha_pilha.pop());
        System.out.println("Minha pilha está vazia? " + minha_pilha.isEmpty());
        System.out.println("Enchendo pilha...");
        for(int i = 0; i<=10; i++){
            System.out.println("Adicionando " + i + " à pilha");
            minha_pilha.push(i);
        }
        System.out.println("Topo da pilha: " + minha_pilha.top());
        System.out.println("Esvaziando pilha...");
        while (!minha_pilha.isEmpty()){
            System.out.println("Popping topo da pilha: " + minha_pilha.pop());
        }
        System.out.println("Minha pilha está vazia? " + minha_pilha.isEmpty());
    }
}
