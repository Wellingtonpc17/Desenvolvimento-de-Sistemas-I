package ex1_sistema_de_cadastro_de_clientes;

public class Cliente {

    //Atributos
    String nome;
    String email;
    String telefone;
    double totalcompras;

    //Métodos
    public void registrarcompras(double valor) {
        totalcompras += valor;
    }

    public void exibirinfo() {

        System.out.println("----Sistema de cadastro de clientes----");
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Telefone: " + totalcompras);
        System.out.println("---------------------------------------");

    }

}
