import java.util.List;
import java.util.ArrayList;

// Interfaces
interface AparelhoTelefonico {
    void fazerChamada(String numero);
    void receberChamada();
    void enviarMensagem(String numero, String mensagem);
    String receberMensagem();
}

interface ReprodutorMusical {
    void tocarMusica();
    void pausarMusica();
    void ajustarVolume(int volume);
    List<String> listarMusicas();
}

interface NavegadorInternet {
    void abrirPagina(String url);
    void fecharPagina();
    void navegar(String url);
    void voltar();
}

// Classe iPhone que implementa as interfaces
public class iPhone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {
    private String modelo;
    private String numeroTelefone;
    private List<String> listaDeMusicas;
    private String paginaAberta;

    public iPhone(String modelo, String numeroTelefone) {
        this.modelo = modelo;
        this.numeroTelefone = numeroTelefone;
        this.listaDeMusicas = new ArrayList<>();
        this.paginaAberta = "";
    }

    // Métodos da interface AparelhoTelefonico
    @Override
    public void fazerChamada(String numero) {
        System.out.println("Chamando para " + numero);
    }

    @Override
    public void receberChamada() {
        System.out.println("Recebendo chamada...");
    }

    @Override
    public void enviarMensagem(String numero, String mensagem) {
        System.out.println("Enviando mensagem para " + numero + ": " + mensagem);
    }

    @Override
    public String receberMensagem() {
        return "Mensagem recebida";
    }

    // Métodos da interface ReprodutorMusical
    @Override
    public void tocarMusica() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando música...");
    }

    @Override
    public void ajustarVolume(int volume) {
        System.out.println("Ajustando volume para " + volume);
    }

    @Override
    public List<String> listarMusicas() {
        return listaDeMusicas;
    }

    // Métodos da interface NavegadorInternet
    @Override
    public void abrirPagina(String url) {
        System.out.println("Abrindo página: " + url);
        paginaAberta = url;
    }

    @Override
    public void fecharPagina() {
        System.out.println("Fechando página: " + paginaAberta);
        paginaAberta = "";
    }

    @Override
    public void navegar(String url) {
        System.out.println("Navegando para: " + url);
        paginaAberta = url;
    }

    @Override
    public void voltar() {
        System.out.println("Voltando para a página anterior");
    }

    // Método principal para testar
    public static void main(String[] args) {
        iPhone meuiPhone = new iPhone("iPhone 12", "123456789");

        meuiPhone.fazerChamada("987654321");
        meuiPhone.enviarMensagem("987654321", "Olá, tudo bem?");
        meuiPhone.tocarMusica();
        meuiPhone.abrirPagina("https://www.example.com");
    }
}
