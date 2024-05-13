import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {

        System.out.println("Discando...");

        do{
            System.out.println("Telefone tocando...");

        }while(tocando());

        System.out.println("Alô!!!");

    }

    //SORTEIA UM VALOR ENTRE 1 E 3 E RETORNA VERDADEIRO SE FOR IGUAL A 1
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);

        return ! atendeu;

    }

}
