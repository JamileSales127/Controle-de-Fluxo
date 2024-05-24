package org.example.controledefluxodesafio;

public class ParametrosInvalidosException extends Exception {
    static String parametroInvalido(int num1, int num2) throws ParametrosInvalidosException{
        if (num1 < num2)
            throw new ParametrosInvalidosException();

            return "O segundo parâmetro deve ser maior que o primeiro";

    }
}