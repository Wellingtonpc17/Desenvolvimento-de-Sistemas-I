package ex1_sistema_de_cadastro_de_clientes;

public class Main {

    public static void main(String[] args) {
        
        
        Cliente clienteum = new Cliente();
        clienteum.nome = "Matheus";
        clienteum.email = "matheuscolasso@gmail.com";
        clienteum.telefone = "+55 (11) 98556-3569";
        clienteum.totalcompras = 156.63;
        clienteum.exibirinfo();
        
        Cliente clientedois = new Cliente();
        clientedois.nome = "Wellington";
        clientedois.email = "wellingtoncavalcanti@gmail.com";
        clientedois.telefone = "+55 (11) 965832-9835";
        clientedois.totalcompras = 209.96;
        clientedois.exibirinfo();
        
        
    }

}
