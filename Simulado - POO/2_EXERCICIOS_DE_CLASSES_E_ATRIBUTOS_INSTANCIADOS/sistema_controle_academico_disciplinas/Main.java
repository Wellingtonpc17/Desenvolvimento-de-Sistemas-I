package sistema_controle_academico_disciplinas;

public class Main {
    public static void main(String[] args) {

        Disciplina matematica = new Disciplina("Matematica", 80, "Wellington");
        matematica.exibir();

        Disciplina portugues = new Disciplina("Portugues", 100, "Matheus");
        portugues.exibir();

        Disciplina historia = new Disciplina("Historia", 60, "Jairo");
        historia.exibir();
    }
}
