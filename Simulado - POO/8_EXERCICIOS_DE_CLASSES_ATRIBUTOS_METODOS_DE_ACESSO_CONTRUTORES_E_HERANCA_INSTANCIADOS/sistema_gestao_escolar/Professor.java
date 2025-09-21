package sistema_gestao_escolar;

public class Professor extends Pessoa {

    private String materia;

    public Professor(String nome, String cpf, String materia) {
        super(nome, cpf);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void exibir() {
        super.exibir();
        System.out.println("Matéria: " + materia);
    }
}

