import java.util.Scanner;

abstract class Cofre {
    protected String tipo;
    protected String metodoAbertura;

    public Cofre(String tipo, String metodoAbertura) {
        this.tipo = tipo;
        this.metodoAbertura = metodoAbertura;
    }

    public abstract void exibirInformacoes();
}

class CofreDigital extends Cofre {
    private int senha;

    public CofreDigital(int senha) {
        super("Cofre Digital", "Senha");
        this.senha = senha;
    }

    public boolean abrir(int tentativaSenha) {
        return tentativaSenha == senha;
    }

    @Override
    public void exibirInformacoes() {
        System.out.printf("Tipo: %s%nMetodo de abertura: %s%n", tipo, metodoAbertura);
    }
}

class CofreFisico extends Cofre {

    public CofreFisico() {
        super("Cofre Fisico", "Chave");
    }

    @Override
    public void exibirInformacoes() {
        System.out.printf("Tipo: %s%nMetodo de abertura: %s%n", tipo, metodoAbertura);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String tipoCofre = scanner.nextLine();

        if (tipoCofre.equalsIgnoreCase("digital")) {
            
            int senha = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha pendente após nextInt

            
            int confirmacaoSenha = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha pendente após nextInt

            if (senha == confirmacaoSenha) {
                CofreDigital cofreDigital = new CofreDigital(senha);
                cofreDigital.exibirInformacoes();

                System.out.println("Cofre aberto!");
            } else {
                CofreDigital cofreDigital = new CofreDigital(senha);
                cofreDigital.exibirInformacoes();

                System.out.println("Senha incorreta!");
            }
        } else if (tipoCofre.equalsIgnoreCase("fisico")) {
            CofreFisico cofreFisico = new CofreFisico();
            cofreFisico.exibirInformacoes();
        } else {
            System.out.println("Tipo de cofre inválido.");
        }

        scanner.close();
    }
}
