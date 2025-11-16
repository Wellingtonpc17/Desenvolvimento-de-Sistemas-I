package br.edu.etec.tratamentodeexcecao.test;

import br.edu.etec.tratamentodeexcecao.model.Calculadora;

public class TesteCalculadora {

    public static void main(String[] args) {

        // Teste com valores válidos
        System.out.println("--------Divisao--------");
        Calculadora c1 = new Calculadora(50, 25);
        c1.exibir();

        // Teste com divisão por zero
        System.out.println("--------Divisao--------");
        Calculadora c2 = new Calculadora(50, 0);
        c2.exibir();
    }
}

