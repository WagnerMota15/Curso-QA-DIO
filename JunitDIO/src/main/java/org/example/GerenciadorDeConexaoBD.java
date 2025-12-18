package org.example;

import java.util.logging.Logger;

public class GerenciadorDeConexaoBD {
    private static final Logger LOGGER  = Logger.getLogger(GerenciadorDeConexaoBD.class.getName());

    public static void iniciarConexao(){
        LOGGER.info("Iniciou conexão");
    }

    public static void encerrouConexao(){
        LOGGER.info("Encerrou conexão");
    }

    public static void insereDados(Pessoa pessoa){
        LOGGER.info("Inseriu dados");
    }

    public static void removeDados(Pessoa pessoa){
        LOGGER.info("Removeu dados");
    }
}
