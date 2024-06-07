import java.util.function.Supplier;
public class SupplierExample {
   public static void main(String[] args) {
    Supplier<String> saudacao = () -> "Olá, seja bem-vindo!";

    List<String> listaSaudacoes = Stream.generate(saudacao)

        .limit(maxSize:5)
        .toList();

        listaSaudacoes.forEach(s -> System.out.println(s));

   } 
}
