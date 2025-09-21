package sistema_controle_academico_disciplinas;

public class Disciplina {

    public String nome;

    public int cargaHoraria;

    public String professorResponsavel;

    public Disciplina(String nome, int cargaHoraria, String professorResponsavel) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.professorResponsavel = professorResponsavel;
    }

    public void exibir() {
        System.out.println("-----Disciplina-------");
        System.out.println("Nome: " + nome);
        System.out.println("Carga Hoararia: " + cargaHoraria);
        System.out.println("Professor Resposável: " + professorResponsavel);
    }

}
