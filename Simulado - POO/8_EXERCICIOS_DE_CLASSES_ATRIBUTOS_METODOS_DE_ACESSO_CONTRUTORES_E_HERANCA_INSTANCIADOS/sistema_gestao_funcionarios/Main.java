package sistema_gestao_funcionarios;

public class Main {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Ana Souza", 8000.0, 2000.0);
        Desenvolvedor dev = new Desenvolvedor("Carlos Lima", 6000.0, "Java");

        System.out.println("=== Gerente ===");
        gerente.exibir();

        System.out.println("\n=== Desenvolvedor ===");
        dev.exibir();

        dev.setLinguagem("Python");
        gerente.setBonusAnual(2500.0);

        System.out.println("\n=== Dados Atualizados ===");
        dev.exibir();
        gerente.exibir();
    }
}

