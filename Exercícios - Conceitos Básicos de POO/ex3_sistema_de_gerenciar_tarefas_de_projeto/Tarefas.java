package ex3_sistema_de_gerenciar_tarefas_de_projeto;

public class Tarefas {
    
    // Atributos
    String nome;
    String descricao;
    String prazodeconclusao;
    String status;
    
    // Métodos
    
    public void cadastrotarefas() {
        System.out.println(nome + " cadastrou uma nova tarefa");
    }
    
    public void statustarefa() {
        System.out.println("A tarefa esta " + status);
    }
}
