package sistema_biblioteca;

public class LivroFiccao extends Livro {

    private String genero;

    public LivroFiccao(String titulo, String autor, String genero) {
        super(titulo, autor);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void exibir() {
        super.exibir();
        System.out.println("Gênero: " + genero);
    }
}

