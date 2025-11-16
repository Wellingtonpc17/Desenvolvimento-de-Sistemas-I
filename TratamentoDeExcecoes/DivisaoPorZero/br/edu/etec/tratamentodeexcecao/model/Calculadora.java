package br.edu.etec.tratamentodeexcecao.model;

public class Calculadora {

    private int resultado; // armazena o resultado da divisão

    // Construtor recebe numerador e denominador
    public Calculadora(int numerador, int denominador) {

        try {
            // Lança exceção manualmente se o denominador for zero
            if (denominador == 0) {
                throw new ArithmeticException("Divisao por zero.");
            }

            // Realiza a divisão normalmente
            this.resultado = numerador / denominador;

        } catch (ArithmeticException e) {
            // Mostra mensagem de erro da operação
            System.out.println("Erro: " + e.getMessage());
            this.resultado = 0; // valor padrão em caso de erro

        } finally {
            // Executado sempre, com ou sem erro (somente para demonstrar o uso)
        }
    }

    // Mostra o resultado
    public void exibir() {
        System.out.println("Resultado: " + resultado);
    }
}
