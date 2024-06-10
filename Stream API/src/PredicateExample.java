import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "python", "javascript", "kotlin", "c");

        Predicate<String> maisdeCincoCaracteres = palavra -> palavra.length()>5;

        palavras.stream()
            .filter(maisdeCincoCaracteres)
            .forEach(System.out::println);
    }
}
