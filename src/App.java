import com.projeto.atribuicaoreferencia.MeuObj;
import com.projeto.no.No;

public class App {
    public static void main(String[] args){
        testeNo();
        testeAtribuicaoEReferencia();
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

}
