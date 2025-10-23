package br.edu.etec.polimorfismo.model;

public class Circulo extends Forma {

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double raio;

    @Override
    public void calcularArea() {
        double area = 3.14 * raio * raio;
        System.out.println("Area do circulo: " + area);

    }

}
