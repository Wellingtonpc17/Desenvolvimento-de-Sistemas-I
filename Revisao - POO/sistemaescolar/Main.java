package sistemaescolar;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Carlos");
        Usuario u1 = new Usuario("Maria", "maria123");
        Funcionario f1 = new Funcionario("João", "F001");
        Professor prof1 = new Professor("Ana", "P002");
        Aluno a1 = new Aluno("Lucas", "A1234");

        p1.falar();
        u1.logar();
        f1.falar();
        prof1.ensinar();
        a1.estudar();
    }
}

