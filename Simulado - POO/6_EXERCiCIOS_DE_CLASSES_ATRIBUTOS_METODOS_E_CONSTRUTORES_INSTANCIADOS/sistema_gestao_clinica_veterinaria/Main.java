package sistema_gestao_clinica_veterinaria;

public class Main {
    public static void main(String[] args) {

        Animal a1 = new Animal("Rex", 20.0, 0.5);
        Animal a2 = new Animal("Luna", 10.0, 0.3);
        Animal a3 = new Animal("Toby", 15.0, 0.0);

        a1.exibir();
        a2.exibir();
        a3.exibir();
    }
}

