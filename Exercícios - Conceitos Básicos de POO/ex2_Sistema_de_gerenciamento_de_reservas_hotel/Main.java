package ex2_Sistema_de_gerenciamento_de_reservas_hotel;

public class Main {

    public static void main(String[] args) {

        Reservas reservaum = new Reservas();

        System.out.println("-----Sistema de cadastro de clientes-----");
        System.out.println("-----------------------------------------");

        System.out.println("Hospede 1");
        reservaum.nome = "Jairo";
        reservaum.datacheckin = "25/10/2014";
        reservaum.diasestadia = 7;
        reservaum.diaria = 385.35;
        reservaum.calcularestadia();
        reservaum.exibirinfo();

        Reservas reservadois = new Reservas();

        System.out.println("Hospede 2");
        reservaum.nome = "Lucas";
        reservaum.datacheckin = "25/10/2015";
        reservaum.diasestadia = 7;
        reservaum.diaria = 500.35;
        reservaum.calcularestadia();
        reservaum.exibirinfo();

    }
}
