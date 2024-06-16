import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Transacao {
    private char tipo; // 'D' para depósito, 'S' para saque
    private double valor;

    public Transacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public char getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return tipo + " de " + valor;
    }
}

public class RegistroTransacoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar saldo inicial da conta
        double saldoInicial = scanner.nextDouble();

        // Solicitar quantidade de transações
        
        int quantidadeTransacoes = scanner.nextInt();

        List<Transacao> transacoes = new ArrayList<>();

        // Entrada de transações
        for (int i = 0; i < quantidadeTransacoes; i++) {
            char tipo = scanner.next().toLowerCase().charAt(0); // Alterado para tratar 'd' e 's' em minúsculas
            
            double valor = scanner.nextDouble();

            Transacao transacao = new Transacao(tipo, valor);
            transacoes.add(transacao);
        }

        // Calcular saldo final utilizando Stream API
        double saldoFinal = saldoInicial + transacoes.stream()
                .mapToDouble(transacao -> transacao.getTipo() == 'd' ? transacao.getValor() : -transacao.getValor())
                .sum();

        // Exibir saldo final e lista de transações
        System.out.println("Saldo : " + saldoFinal);
        System.out.println("Transacoes:");
        List<String> transacoesDescritas = transacoes.stream()
                .map(Transacao::toString)
                .collect(Collectors.toList());
        for (int i = 0; i < transacoesDescritas.size(); i++) {
            System.out.println((transacoesDescritas.get(i)));
        }

        scanner.close();
    }
}
