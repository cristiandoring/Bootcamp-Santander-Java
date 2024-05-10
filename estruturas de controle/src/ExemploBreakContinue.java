public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int i=1; i<=5;i++){
            //interrompe o laço quando i é 3
            if(i == 3){
                break;
                

            }
            System.out.println("O número de saída é " + i);
        }

        for (int i=1; i<=5;i++){
            //ignora o laço quando i é 3
            if(i == 3){
                continue;
                

            }
            System.out.println("O número de saída é " + i);
        }

        
    }
}
