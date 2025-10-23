package br.edu.etec.polimorfismo.test;

import br.edu.etec.polimorfismo.model.*;

public class TesteForma {

    public static void main(String[] args) {

        Circulo c1 = new Circulo(10);
        c1.calcularArea();

        Retangulo r1 = new Retangulo(5, 10);
        r1.calcularArea();

    }

}
