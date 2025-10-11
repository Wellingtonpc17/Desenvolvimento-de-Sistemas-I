package sistemaescolar;

public class Professor extends Funcionario {

    public Professor(String nome, String matricula) {
        super(nome, matricula);
    }

    public void ensinar() {
        System.out.println(nome + " está dando aula.");
    }
}

