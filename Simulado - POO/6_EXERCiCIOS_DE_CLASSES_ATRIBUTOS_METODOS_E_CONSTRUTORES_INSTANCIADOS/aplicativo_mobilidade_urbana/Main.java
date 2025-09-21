package aplicativo_mobilidade_urbana;

public class Main {
    public static void main(String[] args) {

        Corrida c1 = new Corrida(10.5, 5.0, 2.0);
        Corrida c2 = new Corrida(3.2, 4.0, 1.5);
        Corrida c3 = new Corrida(0, 6.0, 3.0); // corrida sem distância

        c1.exibir();
        c2.exibir();
        c3.exibir();
    }
}

