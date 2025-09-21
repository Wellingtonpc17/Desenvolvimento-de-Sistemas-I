package sistema_gestao_salas_cinema;

public class SalaDeCinema {

    public int numero;

    public int capacidade;

    public String tipoTecnologia;

    public SalaDeCinema(int numero, int capacidade, String tipoTecnologia) {
        this.numero = numero;
        this.capacidade = capacidade;
        this.tipoTecnologia = tipoTecnologia;
    }

    public void exibir() {
        System.out.println("------- Sala de Cinema ---------");
        System.out.println("Numero da Sala: " + numero);
        System.out.println("Capacidade de publico: " + capacidade);
        System.out.println("Tecnologia de exibicao: " + tipoTecnologia);
    }
}
