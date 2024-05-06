public class DeclarandoMetodos {
    public static void main(String[] args) throws Exception {//metodo principal
        System.out.println("Declarando métodos");

        //atribui valores as variáveis
        int numero1 = 2;
        int numero2 = 5;

        int soma = somar(numero1, numero2); //declara o retorno (valor da soma na variavel)
        System.out.println(soma); //mostra o valor da variavel soma

    }

    public static int somar(int numero1, int numero2){//metodo para somar dois numeros
            System.out.print("A soma dos números é de ");
            return(numero1 + numero2);//retorna a soma dos parâmetros
    }

}
