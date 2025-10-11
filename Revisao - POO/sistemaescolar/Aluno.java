package sistemaescolar;

public class Aluno extends Pessoa {
    private String ra;

    public Aluno(String nome, String ra) {
        super(nome);
        this.ra = ra;
    }

    public String getRa() {
        return ra;
    }

    public void estudar() {
        System.out.println(nome + " está estudando.");
    }
}

