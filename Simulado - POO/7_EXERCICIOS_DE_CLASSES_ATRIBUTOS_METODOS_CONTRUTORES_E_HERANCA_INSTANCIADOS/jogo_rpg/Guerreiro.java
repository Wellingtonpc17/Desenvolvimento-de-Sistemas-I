package jogo_rpg;

public class Guerreiro extends Personagem {

    public Guerreiro(String nome, int nivel) {
        super(nome, nivel);
        this.vida = 150;
        this.forca = 30;
    }

    @Override
    public void atacar() {
        System.out.println(nome + " atacou com espada!");
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("Classe: Guerreiro");
    }
}

