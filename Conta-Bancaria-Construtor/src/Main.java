import java.util.Scanner;

class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito feito.");
        } else {
            System.out.println("Valor de depósito inválido.");
            
        }
        System.out.println("Saldo atual: " + saldo);
    }
    
    public void sacar(double valor) {
        if (valor > 0) {
            if (valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque feito.");
            } else {
                System.out.println("Saldo insuficiente. Saque não realizado.");
            }
        } else {
            System.out.println("Valor de saque inválido.");
        }
        System.out.println("Saldo atual: " + saldo);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldoInicial = scanner.nextDouble();

        ContaBancaria conta = new ContaBancaria(saldoInicial);

        double valorDeposito = scanner.nextDouble();
        conta.depositar(valorDeposito);

        double valorSaque = scanner.nextDouble();
        conta.sacar(valorSaque);

        scanner.close();
    }
}
