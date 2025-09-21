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

    public double calcularimc(){
        return this.peso / (this.altura * this.altura);
    }

    public void exibir(){
        System.out.println("-------Animal--------");
        System.out.println("Nome: " + nome);
        System.out.println("Peso: " + peso + " KG");
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Imc: " + calcularimc());
    }
}
