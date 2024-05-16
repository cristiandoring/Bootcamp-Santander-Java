import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();


            if (n2 > n1) {
                contar(n1,n2);
            }

            else{
                System.out.println("O segundo parâmetro deve ser maior que o primeiro");


        } 
    }   

    static void contar(int n1, int n2){
       
        for(int i=n1;i<=n2;i++){
            System.out.println("Imprimindo o número "+ i);
        }
    }
}


