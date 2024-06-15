package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {
     private String nome;
     private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
     private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

     public void inscreverBootcamp(Bootcamp bootcamp){}

     public void progredir() {}
     public void calcularTotalXp() {}

     public String getNome() {
         return nome;
     }

     public Set<Conteudo> getConteudosConcluidos() {
         return conteudosConcluidos;
     }

     public Set<Conteudo> getConteudosInscritos() {
         return conteudosInscritos;
     }

     public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
         this.conteudosConcluidos = conteudosConcluidos;
     }

     public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
         this.conteudosInscritos = conteudosInscritos;
     }

     public void setNome(String nome) {
         this.nome = nome;
     }

     @Override
     public boolean equals(Object o){
        if(this==0) return true;
        
        if(o==null || getClass() != 0.getClass()) return false;
        
        Dev dev = (Dev) o;

        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos); 
     }

     @Override
     public int hashCode(){
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
     }


}
