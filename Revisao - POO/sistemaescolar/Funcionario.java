package sistemaescolar;

public class Funcionario extends Pessoa {
    protected String matricula;

    public Funcionario(String nome, String matricula) {
        super(nome);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }
}

