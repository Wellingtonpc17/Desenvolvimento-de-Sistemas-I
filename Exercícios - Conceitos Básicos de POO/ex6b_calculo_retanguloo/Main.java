package ex6b_calculo_retanguloo;

public class Main {

    public static void main(String[] args) {
        
        Retangulo retangulo1 = new Retangulo();
        retangulo1.largura = 4.0;
        retangulo1.altura = 6.0;

        retangulo1.calcularArea();
        retangulo1.calcularPerimetro();
        
        retangulo1.exibirResultados();
    }
}
