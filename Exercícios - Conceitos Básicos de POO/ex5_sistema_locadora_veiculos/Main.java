package ex5_sistema_locadora_veiculos;

public class Main {

    public static void main(String[] args) {
        
        Veiculo veiculo1 = new Veiculo();
        veiculo1.modelo = "Fusca";
        veiculo1.valordiaria = 100.00;  
        veiculo1.dias = 5; 
        
        veiculo1.calculardiaria();  
        veiculo1.exibirValorTotal(); 
    }
}
