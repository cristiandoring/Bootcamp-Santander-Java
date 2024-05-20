import java.util.Scanner;

public class SimulacaoBancaria {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double saldo = 0;

        while(true){
            /* 
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Consultar Saldo");
            System.out.println("4. Encerrar");
            */
            //lê a operação
        int opcao = scanner.nextInt(); 

        switch (opcao) {
            case 1:
                double valor_deposito = scanner.nextDouble(); 
                saldo = saldo + valor_deposito;
                
                System.out.println("Saldo atual: " + saldo);
                break;
            case 2:
                double valor_saque = scanner.nextDouble(); 
                
                if(valor_saque > saldo){
                    System.out.println("Saldo insuficiente.");
                }
                else{
                    saldo -= valor_saque;
                    System.out.println("Saldo atual: " + saldo);
                }
                break;
            case 3:
                System.out.println("Saldo atual: " + saldo);
                break;
            case 0:
                System.out.println("Programa encerrado.");
                break;
                
            default:
                System.out.println("Opção inválida. Tente novamente."); 
                break;
            }
        
            if (opcao == 0) {
                break; // Sai do laço while
            }
        }
    }
}
