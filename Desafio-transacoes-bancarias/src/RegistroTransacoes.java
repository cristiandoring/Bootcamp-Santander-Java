import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroTransacoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar saldo inicial da conta
        
        double saldo = scanner.nextDouble();

        // Solicitar quantidade de transações
        
        int quantidadeTransacoes = scanner.nextInt();

        ArrayList<Transacao> transacoes = new ArrayList<>();

        // Entrada de transações
        for (int i = 0; i < quantidadeTransacoes; i++) {
            
            char tipo = scanner.next().toUpperCase().charAt(0);
            
            double valor = scanner.nextDouble();

            Transacao transacao = new Transacao(tipo, valor);
            transacoes.add(transacao);

            // Atualizar saldo
            if (tipo == 'D') {
                saldo += valor;
            } else if (tipo == 'S') {
                saldo -= valor;
            }
        }

        // Exibir saldo final e lista de transações
        System.out.println("Saldo: " + saldo);
        System.out.println("Transacoes:");
        for (int i = 0; i < transacoes.size(); i++) {
            System.out.println((i + 1) + ". " + transacoes.get(i));
        }

        scanner.close();
    }
}