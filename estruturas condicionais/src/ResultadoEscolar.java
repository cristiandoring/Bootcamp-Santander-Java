import java.util.Locale;
import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        scanner.useLocale(Locale.US);//aceita o formato decimal americano "."

        System.out.println("Digite a primeira nota: ");
        
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        if(media >= 7){
            System.out.println("APROVADO");
        }
        else{
            System.out.println("REPROVADO");
        }
    }
}
