package escola;

public class Aluno {
    private String nome;
    private int idade;
    private String sexo;

    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    public String getSexo() {
        return sexo;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int newIdade){
        this.idade = newIdade;
    }


}
