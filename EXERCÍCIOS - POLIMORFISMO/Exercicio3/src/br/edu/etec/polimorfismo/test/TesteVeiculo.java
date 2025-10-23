package br.edu.etec.polimorfismo.test;

import br.edu.etec.polimorfismo.model.*;

public class TesteVeiculo {

    public static void main(String[] args) {

        Bicicleta b1 = new Bicicleta();
        b1.mover();

        Carro c1 = new Carro();
        c1.mover();
    }

}
