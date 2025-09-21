package sistema_prontuario_pacientes;

public class Main {
    public static void main(String[] args) {

        Paciente paciente1 = new Paciente("Wellington", 26, "Consulta inicial");
        paciente1.exibir();

        Paciente paciente2 = new Paciente("Matheus", 19, "Retorno");
        paciente2.exibir();

        Paciente paciente3 = new Paciente("Jairo", 20, "Consulta");
        paciente3.exibir();

    }
}
