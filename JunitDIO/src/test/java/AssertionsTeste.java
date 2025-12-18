import org.example.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/* Importação estática
import org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Assertions.assertEquals;
 */

import java.time.LocalDateTime;

public class AssertionsTeste {
    @Test
    void validarLancamento(){
        int[] primeiroLancamento = {10,20,30,40,50};
        int[] segundoLancamento = {10,5,2,3,10};

        //Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento);
        //Assertions.assertNotEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validarSeENulo(){
        Pessoa pessoa = null;
        Assertions.assertNull(pessoa);

        pessoa = new Pessoa("Wagner", LocalDateTime.now());
        Assertions.assertNotNull(pessoa);
    }

    @Test
    void validarNumeroTiposDiferentes(){
        double valor = 5.0;
        double outroValor = 5.0;

        Assertions.assertEquals(valor, outroValor);
    }
}
