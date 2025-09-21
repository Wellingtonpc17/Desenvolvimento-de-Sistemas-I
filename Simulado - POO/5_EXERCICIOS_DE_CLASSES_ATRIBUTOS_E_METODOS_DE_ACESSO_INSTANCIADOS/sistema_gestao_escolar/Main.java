package sistema_gestao_escolar;

public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Wellington", "123456789-10", "01/01/2000", "12345-6", "2A");
        aluno1.exibir();

        Professor professor1 = new Professor("Matheus", "234567891-23", "02/02/2001", "23456-7", 5000.00);
        professor1.exibir();
    }
}
