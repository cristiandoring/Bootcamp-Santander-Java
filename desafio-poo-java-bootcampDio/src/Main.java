import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso de POO em Java");
        curso1.setCargaHoraria(8);  // Correção aqui

        //System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Curso de POO em Python");
        curso2.setCargaHoraria(12);  // Correção aqui

        //System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Curso mentorado por ex alunos do projeto");  // Correção aqui
        mentoria.setData(LocalDate.now());

        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();

         bootcamp.setNome("Bootcamp Java");
         bootcamp.setDescricao("Descrição do Bootcamp Java");
         bootcamp.getConteudos().add(curso1);
         bootcamp.getConteudos().add(curso2);
         bootcamp.getConteudos().add(mentoria);

        Dev devCristian = new Dev();
        devCristian.setNome("Cristian");
        devCristian.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devCristian.getConteudosInscritos());
        
        //avançou no curso e concluiu
        devCristian.progredir();
        devCristian.progredir();
        devCristian.progredir();

        //aparece vazio porque ja foi concluido
        System.out.println("Conteúdos Inscritos" + devCristian.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos" + devCristian.getConteudosConcluidos());
        System.out.println("XP = " + devCristian.calcularTotalXp());
       
    
        System.out.println("");
        System.out.println("");


        Dev devJoao = new Dev();
         devJoao.setNome("João");
         devJoao.inscreverBootcamp(bootcamp);
         System.out.println("Conteúdos Inscritos" + devJoao.getConteudosInscritos());
         devJoao.progredir();
         System.out.println("Conteúdos Inscritos" + devJoao.getConteudosInscritos());
         System.out.println("Conteúdos Concluidos" + devJoao.getConteudosConcluidos());
         System.out.println("XP = " + devJoao.calcularTotalXp());
         

    }
}
