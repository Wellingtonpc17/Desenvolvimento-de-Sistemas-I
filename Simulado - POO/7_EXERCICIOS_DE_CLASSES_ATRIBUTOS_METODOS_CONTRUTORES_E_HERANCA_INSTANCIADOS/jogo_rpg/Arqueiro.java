package jogo_rpg;

public class Arqueiro extends Personagem {
    public String tipoDeArco;

    public Arqueiro(String nome, int nivel, String tipoDeArco) {
        super(nome, nivel);
        this.vida = 100;
        this.forca = 20;
        this.tipoDeArco = tipoDeArco;
    }

    @Override
    public void atacar() {
        System.out.println(nome + " atirou uma flecha com o arco " + tipoDeArco + "!");
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("Classe: Arqueiro, Tipo de Arco: " + tipoDeArco);
    }
}

