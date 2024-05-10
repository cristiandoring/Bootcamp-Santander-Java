public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25;
        double valor_solicitado = 17;

        if(valor_solicitado < saldo){
            saldo = saldo - valor_solicitado;
        }

        System.out.println("Saldo = " + saldo);
    }
}
