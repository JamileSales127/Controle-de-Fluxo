package org.example.controledefluxodesafio;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args){
        int parametro1;
        int parametro2;
        Scanner leitura = new Scanner(System.in);

        try {
            System.out.println("--------------------------");
            System.out.println("CONTROLE DE FLUXO");
            System.out.println("--------------------------");
            System.out.println("Digite um número:");
            parametro1 = leitura.nextInt();
            System.out.println("Digite outro número:");
            parametro2 = leitura.nextInt();

            ParametrosInvalidosException.checkParametros(parametro1, parametro2);
            incrementar(parametro1, parametro2);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    static void incrementar(int parametro1, int parametro2) throws ParametrosInvalidosException{
        while (parametro1 <= parametro2){
            System.out.println("Imprimindo o número " + parametro1);
            parametro1++;
        }
    }
}