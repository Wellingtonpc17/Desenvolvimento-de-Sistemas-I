package sistema_biblioteca;

public class Main {
    public static void main(String[] args) {

        LivroFiccao ficcao = new LivroFiccao("O Hobbit", "J.R.R. Tolkien", "Fantasia");
        LivroNaoFiccao naoFiccao = new LivroNaoFiccao("Uma Breve História do Tempo", "Stephen Hawking", "Ciência");

        System.out.println("=== Livro de Ficção ===");
        ficcao.exibir();

        System.out.println("\n=== Livro de Não Ficção ===");
        naoFiccao.exibir();

        ficcao.setGenero("Aventura Fantástica");
        naoFiccao.setAssunto("Física Teórica");

        System.out.println("\n=== Dados Atualizados ===");
        ficcao.exibir();
        naoFiccao.exibir();
    }
}

