package org.example.controledefluxodesafio;

public class ParametrosInvalidosException extends Exception {

    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }

    static void checkParametros(int parametro1, int parametro2) throws ParametrosInvalidosException {
        if (parametro1 > parametro2) {
            throw new ParametrosInvalidosException("ERROR: O primeiro número digitado deve ser menor que o segundo número digitado");
        }
    }
}