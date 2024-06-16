import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        String tipoTransacao = (tipo == 'D' || tipo == 'd') ? "Deposito" : "Saque";
        return tipoTransacao + " de " + valor;
    }
}