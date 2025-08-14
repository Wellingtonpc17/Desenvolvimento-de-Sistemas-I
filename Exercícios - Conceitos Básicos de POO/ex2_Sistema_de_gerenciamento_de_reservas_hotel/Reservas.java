    package ex2_Sistema_de_gerenciamento_de_reservas_hotel;

    public class Reservas {

        //Atributos
        String nome;
        String datacheckin;
        int diasestadia;
        double diaria;
        double valortotal;

        //Métodos
        public void calcularestadia() {
            valortotal = diasestadia * diaria;
        }

        public void exibirinfo() {

            System.out.println("Nome: " + nome);
            System.out.println("Data do Checkin " + datacheckin);
            System.out.println("Valor da diaria: R$" + diaria);
            System.out.println("Dias de estadia: " + diasestadia);
            System.out.println("Valor total: R$" + valortotal);
            System.out.println("---------------------------------------");

        }

    }


