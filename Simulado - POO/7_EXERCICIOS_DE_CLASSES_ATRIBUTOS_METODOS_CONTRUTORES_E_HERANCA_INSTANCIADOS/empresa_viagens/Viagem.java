package empresa_viagens;

public class Viagem {

    public String destino;
    public Transporte transporte;

    public Viagem(String destino, Transporte transporte) {
        this.destino = destino;
        this.transporte = transporte;
    }

    public void exibir() {
        System.out.println("Destino: " + destino);
        System.out.println("Informações do transporte:");
        transporte.exibir();
    }
}

