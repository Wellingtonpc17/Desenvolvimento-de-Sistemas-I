package sistema_biblioteca;

public class LivroNaoFiccao extends Livro {

    private String assunto;

    public LivroNaoFiccao(String titulo, String autor, String assunto) {
        super(titulo, autor);
        this.assunto = assunto;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public void exibir() {
        super.exibir();
        System.out.println("Assunto: " + assunto);
    }
}

