import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class LigarCandidatos{
    public static void main(String[] args) throws Exception {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        for (String candidato:candidatos){
            entrantoEmContanto(candidato);
        }
    }

    static void entrantoEmContanto(String candidato){
        int tentativasRealizadas = 0;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do{
            atendeu = atender();
            continuarTentando = !atendeu;
                
            if(continuarTentando){
                tentativasRealizadas++;

            }

            else{
                System.out.println("Contato realizado com sucesso.");
            }
        }while(continuarTentando && tentativasRealizadas <3);

        if(atendeu){
            System.out.println("Conseguimos contato com " + candidato + " na " + (tentativasRealizadas+1) + "ª tentativa");
        }
        else{
            System.out.println("Não conseguimos contato com " + candidato + " no número máximo de tentativas.");
        }

    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
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
