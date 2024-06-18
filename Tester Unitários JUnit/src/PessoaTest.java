import java.time.LocalDate;
import junit.jupiter.api.Assertions;
import junit.jupiter.api.Test;

public class PessoaTest {
    
    @Test
    void validarCalculoIdade(){
        Pessoa pessoa = new Pessoa ("Julia", LocalDate.of(2020,1,1));
        Assertions.assertEquals(2,pessoa.getIdade());
    }
}
