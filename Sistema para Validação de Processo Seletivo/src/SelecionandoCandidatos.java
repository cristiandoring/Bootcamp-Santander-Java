import java.util.concurrent.ThreadLocalRandom;

public class SelecionandoCandidatos{
    public static void main(String[] args) throws Exception {
        selecaoCandidatos();
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRÍCIO", "MIRELA", "DANIELA", "JORDANA" };

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados<5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);

            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;

            }

            candidatoAtual++;
        }
    
    }

    //retorna um valor aleatório entre 1800 e 2200 atribuindo ao método valorPretendido
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

}
