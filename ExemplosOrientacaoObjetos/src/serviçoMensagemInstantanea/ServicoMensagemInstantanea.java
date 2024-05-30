package serviçoMensagemInstantanea;

public class ServicoMensagemInstantanea {
    public void enviarMensagem(){
        System.out.println("Enviando Mensagem");
    }

    public void receberMensagem(){
        System.out.println("Recebendo Mensagem");
    }

    //tornando os métodos privados para que os computadores dos usuarios não vejam eles
    //logo, para eles aparecerá apenas as opções de enviar e receber mensagens
    
    private void validarConectadoInternet(){
        System.out.println("Validando se está conectado a internet");
    }

    private void salvarHistoricoMensagem(){
        System.out.println("Salvando o histórico da mensagem");
    }
}
