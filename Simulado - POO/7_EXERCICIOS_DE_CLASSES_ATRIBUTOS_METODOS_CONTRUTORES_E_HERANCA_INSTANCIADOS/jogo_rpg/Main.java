package jogo_rpg;

public class Main {
    public static void main(String[] args) {
        Guerreiro g = new Guerreiro("Thorin", 10);
        Mago m = new Mago("Gandalf", 15, 100);
        Arqueiro a = new Arqueiro("Legolas", 12, "Longo");

        System.out.println("=== Personagens ===");
        g.exibir();
        g.atacar();

        System.out.println();

        m.exibir();
        m.atacar();

        System.out.println();

        a.exibir();
        a.atacar();
    }
}

