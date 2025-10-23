package br.edu.etec.polimorfismo.model;

public abstract class Funcionario {

    public String nome;
    public double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract void calcularSalario();

}
