package ex6a_calculo_circuloo;

public class Main {

    public static void main(String[] args) {

        Circulo circulo1 = new Circulo();
        circulo1.raio = 5.0;

        circulo1.calcularArea();
        circulo1.calcularPerimetro();

        circulo1.exibirResultados();
    }
}
