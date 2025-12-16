import org.example.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PessoaTest {
    @Test
    void CalcularIdadeCorretamente(){
        Pessoa pessoa = new Pessoa("Wagner", LocalDateTime.of(2005,5,15,15,0,0));
        Assertions.assertEquals(20, pessoa.getIdade());
    }

    @Test
    void SeEMaiorDeIdade(){
        Pessoa pessoa = new Pessoa("Wagner", LocalDateTime.of(2005,5,15,15,0,0));
        Assertions.assertTrue(pessoa.maiorDeIdade());
    }
}
