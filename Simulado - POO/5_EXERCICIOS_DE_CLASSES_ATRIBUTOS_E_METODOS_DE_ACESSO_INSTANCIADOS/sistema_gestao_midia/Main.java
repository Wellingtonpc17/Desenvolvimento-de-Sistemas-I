package sistema_gestao_midia;

public class Main {
    public static void main(String[] args) {

        Reporter reporter = new Reporter("Beatriz", "12345-6", 5000.00, "Jornais", 10);
        reporter.exibir();

        Cameraman cameraman = new Cameraman("Milena", "23456-7", 4000.00, "Sony A6400", 2);
        cameraman.exibir();

        Editor editor = new Editor("Marcos", "34567-8", 6000.00, "Adobe Premiere Pro");
        editor.exibir();
    }
}
