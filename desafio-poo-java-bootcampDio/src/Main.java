import br.com.dio.desafio.dominio.Curso;   

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso de POO em Java");
        curso1.cargaHoraria(8);
        
        System.out.println(curso1);


        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Curso de POO em Python");
        curso2.cargaHoraria(12);


        System.out.println(curso2);



    }
}
