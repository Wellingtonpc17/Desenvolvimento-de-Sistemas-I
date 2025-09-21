package sistema_prontuario_pacientes;

public class Paciente {

    public String nome;

    public int idade;

    public String historicoDeConsultas;

    public Paciente(String nome, int idade, String historicoDeConsultas) {
        this.nome = nome;
        this.idade = idade;
        this.historicoDeConsultas = historicoDeConsultas;
    }

    public void exibir() {
        System.out.println("-------Paciente--------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Historico de Consultas: " + historicoDeConsultas);
    }
}
