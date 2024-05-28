package pessoa;

public class SistemaCadastro {
    public static void main(String[] args) {
        
        Pessoa marcos = new Pessoa("036.723.650-88","Marcos");

        //define o endereço de marcos
        marcos.setEndereco("RUA DAS MARIAS");

        System.out.println("Nome: " + marcos.getNome() + "\nCPF:" + marcos.getCpf());

    }
}
