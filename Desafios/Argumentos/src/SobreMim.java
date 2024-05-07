public class SobreMim {
    public static void main(String[] args) throws Exception{
        String nome = args[0]; // pega o 1º argumento digitado
        String sobrenome = args[1]; // pega o 2º argumento digitado
        int idade = Integer.valueOf(args[2]); // pega o 3º argumento digitado
        double altura = Double.valueOf(args[3]); // pega o 4º argumento digitado

        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + "cm");
    }
}
