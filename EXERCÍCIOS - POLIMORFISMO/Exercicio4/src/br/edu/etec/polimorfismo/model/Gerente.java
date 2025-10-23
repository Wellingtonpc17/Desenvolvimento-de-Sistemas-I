package br.edu.etec.polimorfismo.model;

public class Gerente extends Funcionario {

    public double bonus;

    public Gerente(double bonus, String nome, double salarioBase) {
        super(nome, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public void calcularSalario() {
        double salario = salarioBase + bonus;
        System.out.println("Salario do Gerente " + nome + ": " + salario + " reais");
    }

}
