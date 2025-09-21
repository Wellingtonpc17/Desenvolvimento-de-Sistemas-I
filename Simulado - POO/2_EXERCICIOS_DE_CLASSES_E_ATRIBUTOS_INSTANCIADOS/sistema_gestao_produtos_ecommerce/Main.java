package sistema_gestao_produtos_ecommerce;

public class Main {
    public static void main(String[] args) {

        Produto smartphone = new Produto("Iphone 17", 7999.0, 15);
        smartphone.exibir();

        Produto televisao = new Produto("Smart TV 50 polegadas", 2299.0, 20);
        televisao.exibir();
    }
}
