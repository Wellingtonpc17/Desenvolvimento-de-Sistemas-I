package br.edu.etec.enums.test;

import br.edu.etec.enums.model.*;

public class TesteStatusPedido {

    public static void main(String[] args) {

        // Criando pedidos com diferentes status
        StatusPedido pedido1 = StatusPedido.NOVO;
        StatusPedido pedido2 = StatusPedido.PROCESSANDO;
        StatusPedido pedido3 = StatusPedido.ENTREGUE;
        StatusPedido pedido4 = StatusPedido.CANCELADO;

        // Imprimindo os status dos pedidos no console
        System.out.println("Pedido 1: " + pedido1);
        System.out.println("Pedido 2: " + pedido2);
        System.out.println("Pedido 3: " + pedido3);
        System.out.println("Pedido 4: " + pedido4);

    }
}
