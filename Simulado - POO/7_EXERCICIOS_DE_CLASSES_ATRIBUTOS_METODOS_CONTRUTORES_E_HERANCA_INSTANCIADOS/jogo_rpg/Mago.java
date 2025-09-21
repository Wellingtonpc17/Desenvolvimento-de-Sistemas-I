package jogo_rpg;

public class Mago extends Personagem {
    public int mana;

    public Mago(String nome, int nivel, int mana) {
        super(nome, nivel);
        this.vida = 80;
        this.forca = 15;
        this.mana = mana;
    }

    @Override
    public void atacar() {
        System.out.println(nome + " lançou uma magia!");
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("Classe: Mago, Mana: " + mana);
    }
}

