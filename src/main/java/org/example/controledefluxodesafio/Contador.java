package org.example.controledefluxodesafio;

import java.util.Scanner;

public class Contador {
    int parametro1;
    int parametro2;
//O sistema deverá receber dois parâmetros via terminal que representarão dois números inteiros,
// com estes dois números você deverá obter a quantidade de interações (for) e realizar a impressão no
// console (System.out.print) dos números incrementados, exemplo:
//
//Se você passar os números 12 e 30, logo teremos uma interação (for) com 18 ocorrências para imprimir os números, exemplo:
// "Imprimindo o número 1", "Imprimindo o número 2" e assim por diante.
//Se o primeiro parâmetro for MAIOR que o segundo parâmetro, você deverá lançar a exceção customizada chamada de
// ParametrosInvalidosException com a segunda mensagem: "O segundo parâmetro deve ser maior que o primeiro"
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println();
        System.out.println("Controle de fluxo");
    }

    static void incrementar(int parametro1, int parametro2){
       while (parametro1 <= parametro2){

       }
    }
}