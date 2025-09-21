package jogo_rpg;

public class Personagem {
    public String nome;
    public int nivel;
    public int vida;
    public int forca;

    public Personagem(String nome, int nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    public void atacar() {
        System.out.println(nome + " atacou!");
    }

    public void exibir() {
        System.out.println("Nome: " + nome + ", Nível: " + nivel + ", Vida: " + vida + ", Força: " + forca);
    }
}

