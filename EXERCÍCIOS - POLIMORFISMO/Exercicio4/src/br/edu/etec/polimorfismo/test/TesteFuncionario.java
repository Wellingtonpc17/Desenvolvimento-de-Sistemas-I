package br.edu.etec.polimorfismo.test;

import br.edu.etec.polimorfismo.model.*;

public class TesteFuncionario {

    public static void main(String[] args) {

        Gerente gerente = new Gerente(1000, "Wellington", 5000);
        gerente.calcularSalario();

        Vendedor vendedor = new Vendedor(500, "Maria", 2000);
        vendedor.calcularSalario();

    }
}
