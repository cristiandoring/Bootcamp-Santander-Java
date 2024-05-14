import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ExemploTryCatch {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            //lê os dados de entrada
            System.out.println("Digite o nome: ");
            String nome = scanner.next();
    
            System.out.println("Digite o sobrenome: ");
            String sobrenome = scanner.next();
    
            System.out.println("Digite a idade: ");
            int idade = scanner.nextInt();
    
            //imprime saída
            System.out.println(nome + " " + sobrenome + " tem " + idade + " anos.");  
        }

        //trata quando digitam uma letra na entrada de idade
        catch(InputMismatchException e){
            System.out.println("O campo idade precisa ser numérico.");
        }

    }
}
