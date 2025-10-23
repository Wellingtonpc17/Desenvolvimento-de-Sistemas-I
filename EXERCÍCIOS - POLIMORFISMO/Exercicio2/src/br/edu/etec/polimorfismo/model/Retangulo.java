package br.edu.etec.polimorfismo.model;

public class Retangulo extends Forma {

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double largura;
    public double altura;

    @Override
    public void calcularArea() {
        double area = largura * altura;
        System.out.println("Area do Quadrado: " + area);
    }
}
