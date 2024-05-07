import java.util.Scanner;

public class SobreMim {
    public static void main(String[] args) throws Exception {

        //criando o objeto Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next(); // lendo uma String

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble(); //lendo um valor decimal

        //imprimindo os dados na tela
        System.out.println("Meu nome é " + nome);
        System.out.println("Minha altura é de " + altura + "cm");
    }
}
