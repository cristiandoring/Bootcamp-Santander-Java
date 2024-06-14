import java.time.LocalDate;
import br.com.dio.desafio.dominio.Curso;   
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso de POO em Java");
        curso1.setCargaHoraria(8);  // Correção aqui

        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Curso de POO em Python");
        curso2.setCargaHoraria(12);  // Correção aqui

        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Curso mentorado por ex alunos do projeto");  // Correção aqui
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);
    }
}