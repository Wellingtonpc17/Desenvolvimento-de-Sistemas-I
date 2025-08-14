package ex3_sistema_de_gerenciar_tarefas_de_projeto;

public class Main {

    public static void main(String[] args) {
        
        Tarefas tarefaum = new Tarefas();
        
        tarefaum.nome = "Guilherme";
        tarefaum.descricao = "Gerenciar banco de dados";
        tarefaum.prazodeconclusao = "7 dias";
        tarefaum.status = "Concluida";
        tarefaum.cadastrotarefas();  
        tarefaum.statustarefa();     
        
    }
}
