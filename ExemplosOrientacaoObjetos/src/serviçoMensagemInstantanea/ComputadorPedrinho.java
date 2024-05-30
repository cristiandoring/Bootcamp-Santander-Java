package serviçoMensagemInstantanea;

public class ComputadorPedrinho {
    public static void main(String[] args) {

        System.out.println("MSN");

        MSN msn = new MSN();

        msn.enviarMensagem();
        msn.receberMensagem();

        System.out.println("Facebook");

        Facebook fbc = new Facebook();

        fbc.enviarMensagem();
        fbc.receberMensagem();

        System.out.println("Telegram");

        Telegram tlg = new Telegram();

        tlg.enviarMensagem();
        tlg.receberMensagem();
    }
}
