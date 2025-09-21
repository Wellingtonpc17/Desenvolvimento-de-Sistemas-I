package sistema_gestao_escolar;

public class Aluno extends Pessoa {

    public String matricula;
    public Double[] notas;
    public int quantidadeNotas;

    public Aluno(String nome, String cpf, String matricula) {
        super(nome, cpf);
        this.matricula = matricula;
        this.notas = new Double[100];
        this.quantidadeNotas = 0;
    }

    public void adicionarNota(double nota) {
        if (quantidadeNotas < 100) {
            notas[quantidadeNotas] = nota;
            quantidadeNotas++;
        }
    }

    public double calcularMedia() {
        if (quantidadeNotas == 0) return 0;
        double soma = 0;
        for (int i = 0; i < quantidadeNotas; i++) {
            soma += notas[i];
        }
        return soma / quantidadeNotas;
    }

    public void exibir() {
        super.exibir();
        System.out.println("Matrícula: " + matricula);
        System.out.print("Notas: ");
        for (int i = 0; i < quantidadeNotas; i++) {
            System.out.print(notas[i] + " ");
        }
        System.out.println("\nMédia: " + calcularMedia());
    }
}


