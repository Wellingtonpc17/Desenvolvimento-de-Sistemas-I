package sistema_gestao_pessoal_hospitalar;

public class Main {
    public static void main(String[] args) {

        Medico medico1 = new Medico("Beatriz", "12345-6", 20000.00, "12985-6", "Cardiologista");
        medico1.exibir();

        Enfermeiro enfermeiro1 = new Enfermeiro("Debora", "23456-7", 19000.00, "32598-5");
        enfermeiro1.exibir();
    }
}
