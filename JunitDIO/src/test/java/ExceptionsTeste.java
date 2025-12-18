import org.example.Conta;
import org.example.TransferenciaEntreContas;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTeste {
    @Test
    void validarExcecao(){
        Conta contaOrigem = new Conta("123456", 0);
        Conta contaDestino = new Conta("456789",0);

        TransferenciaEntreContas transferencia = new TransferenciaEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class, () -> transferencia.transfere(contaOrigem, contaDestino, -1));
        //Assertions.assertDoesNotThrow(() -> transferencia.transfere(contaOrigem, contaDestino, -1));
    }
}
