import org.example.GerenciadorDeConexaoBD;
import org.example.Pessoa;
import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

// Aprendendo o Before/After All

public class ConsultarDadosPessoaTest {
    @BeforeAll
    static void configuraConexao(){
        GerenciadorDeConexaoBD.iniciarConexao();
    }

    @BeforeEach
    void insereDadosParaTeste(){
        GerenciadorDeConexaoBD.insereDados(new Pessoa("Wagner", LocalDateTime.of(2005,5,15,11,20)));
    }

    @AfterEach
    void removeDadosDoTest(){
        GerenciadorDeConexaoBD.removeDados(new Pessoa("Wagner", LocalDateTime.of(2005,5,15,11,20)));
    }

    @Test
    void validarDadosDeRetorno(){
        Assertions.assertTrue(true);
    }

    @Test
    void validarDadosDeRetorno2(){
        Assertions.assertNull(null);
    }

    @AfterAll
    static void configurarConexao(){
        GerenciadorDeConexaoBD.encerrouConexao();
    }
}
