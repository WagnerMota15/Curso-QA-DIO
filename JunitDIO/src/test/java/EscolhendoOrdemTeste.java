import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//@TestMethodOrder(MethodOrderer.MethodName.class)
public class EscolhendoOrdemTeste {

    @Order(4)
    @Test
    void validaFluxoA(){

    }

    @Order(3)
    @Test
    void validaFluxoB(){

    }

    @Order(1)
    @Test
    void validaFluxoC(){

    }

    @Order(2)
    @Test
    void validaFluxoD(){

    }
}
