package sistema_gestao_clinica_veterinaria;

public class Animal {

    public String nome;
    public double peso;
    public double altura;

    public Animal(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC() {
        if (altura <= 0) {
            return 0; // Evita divisão por zero
        }
        return peso / (altura * altura);
    }

    public void exibir() {
        double imc = calcularIMC();
        System.out.println(nome + " - IMC: " + imc);
    }
}

