package sistema_gestao_salas_cinema;

public class Main {
    public static void main(String[] args) {

        SalaDeCinema sala1 = new SalaDeCinema(1, 50, "2D");
        sala1.exibir();

        SalaDeCinema sala2 = new SalaDeCinema(2, 40, "3D");
        sala2.exibir();

        SalaDeCinema sala3 = new SalaDeCinema(3, 30, "IMAX");
        sala3.exibir();
    }
}
