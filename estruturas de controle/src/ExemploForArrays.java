public class ExemploForArrays { 
    public static void main(String[] args) {
        String alunos[] = {"FELIPE", "CAIQUE", "JÚLIA", "MARIA"};

        for (int i=0;i<alunos.length;i++){
            System.out.println("O aluno do índice " + i + " é " + alunos[i]);
        }

        //a variavel aluno vai recebendo o valor de cada índice do array alunos e mostra um por vez
        for(String aluno : alunos){
            System.out.println("Nome do aluno é " + aluno);
        }
    }
    
}
