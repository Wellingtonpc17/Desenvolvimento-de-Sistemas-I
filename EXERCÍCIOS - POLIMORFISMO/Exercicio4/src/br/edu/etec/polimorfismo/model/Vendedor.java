package br.edu.etec.polimorfismo.model;

public class Vendedor extends Funcionario {

    public double comissao;

    public Vendedor(double comissao, String nome, double salarioBase) {
        super(nome, salarioBase);
        this.comissao = comissao;
    }

    @Override
    public void calcularSalario() {
        double salario = salarioBase + comissao;
        System.out.println("Salario do Vendedor " + nome + ": " + salario + " reais");
    }

}
