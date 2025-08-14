package ex6a_calculo_circuloo;

public class Circulo {

    double raio;
    
    
    // Cálculos
    double area;
    double perimetro;

    public void calcularArea() {
        area = 3.14 * raio * raio;
    }

    public void calcularPerimetro() {
        perimetro = 2 * 3.14 * raio;
    }

    public void exibirResultados() {
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
    }
}
