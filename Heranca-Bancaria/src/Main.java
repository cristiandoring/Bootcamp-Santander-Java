import java.util.Locale;
import java.util.Scanner;

class ContaBancaria {
    protected int numero;
    protected String titular;
    protected double saldo;

    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void exibirInformacoes() {
        System.out.printf(Locale.US, "Conta Bancária:%n%s%n%d%nSaldo: R$ %.1f%n", titular, numero, saldo);
    }
}

class ContaPoupanca extends ContaBancaria {
    private double taxaJuros;

    public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros) {
        super(numero, titular, saldo);
        this.taxaJuros = taxaJuros;
    }

    @Override
    public void exibirInformacoes() {
        System.out.printf(Locale.US, "Conta Poupanca:%n%s%n%d%nSaldo: R$ %.1f%nTaxa de juros: %.1f%%%n", titular, numero, saldo, taxaJuros);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        
        String titular = scanner.nextLine();

        
        int numero = scanner.nextInt();

        
        double saldo = scanner.nextDouble();

        
        double taxaJuros = scanner.nextDouble();

        ContaPoupanca contaPoupanca = new ContaPoupanca(numero, titular, saldo, taxaJuros);
        contaPoupanca.exibirInformacoes();

        scanner.close();
    }
}
