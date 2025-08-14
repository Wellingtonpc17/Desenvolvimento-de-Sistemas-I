package ex6b_calculo_retanguloo;

public class Retangulo {

    double largura;
    double altura;
    double area;
    double perimetro;

    public void calcularArea() {
        area = largura * altura;
    }

    public void calcularPerimetro() {
        perimetro = 2 * (largura + altura);
    }

    public void exibirResultados() {
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
    }
}
