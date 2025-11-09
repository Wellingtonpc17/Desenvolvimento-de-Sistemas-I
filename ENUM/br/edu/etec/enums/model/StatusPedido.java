package br.edu.etec.enums.model;

// Enum que representa os possíveis status de um pedido
public enum StatusPedido {
    NOVO,          // Pedido recém-criado
    PROCESSANDO,   // Pedido em andamento
    ENTREGUE,      // Pedido entregue ao cliente
    CANCELADO      // Pedido cancelado
}
