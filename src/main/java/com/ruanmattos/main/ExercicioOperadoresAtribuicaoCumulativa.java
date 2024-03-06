package com.ruanmattos.main;

/**
 * Classe principal do Exercício de Operadores de Atribuição Cumulativa 
 * 01. Incrementar um número em 5
 * 02. Multiplicar um número por 2
 *
 * @author Ruan Pereira Mattos
 */
public class ExercicioOperadoresAtribuicaoCumulativa {

    /**
     * Função padrão do java para iniciar o software
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int soma = 0;
        soma += 5;
        System.out.println("Soma: " + soma);
        int multiplicacao = 1;
        multiplicacao *= 2;
        System.out.println("Multiplicação: " + multiplicacao);
    }
}
