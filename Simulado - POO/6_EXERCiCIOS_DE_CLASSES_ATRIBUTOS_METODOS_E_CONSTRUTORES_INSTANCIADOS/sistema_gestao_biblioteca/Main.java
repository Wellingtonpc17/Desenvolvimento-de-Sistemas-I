package sistema_gestao_biblioteca;

public class Main {
    public static void main(String[] args) {

        Usuario u1 = new Usuario("Maria", "professor");
        Usuario u2 = new Usuario("João", "aluno");
        Usuario u3 = new Usuario("Carlos", "visitante");
        Usuario u4 = new Usuario("Ana", "outro");

        u1.exibir();
        u2.exibir();
        u3.exibir();
        u4.exibir();
    }
}

