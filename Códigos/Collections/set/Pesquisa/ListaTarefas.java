package Collections.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> tarefaSet;

    public ListaTarefas(){
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(Tarefa tarefa){
        tarefaSet.add(tarefa);
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;
        if(!tarefaSet.isEmpty()){
            for(Tarefa t : tarefaSet){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaParaRemover = t;
                    break;
                }
            }
        }else{
            throw new RuntimeException("Conjunto vazio");
        }
        tarefaSet.remove(tarefaParaRemover);
    }

    public void exibirTarefas(){
        System.out.println(tarefaSet);
    }

    public int contarTarefas(){
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if(!tarefaSet.isEmpty()){
            for(Tarefa t : tarefaSet){
                if(t.getConcluida()){
                    tarefasConcluidas.add(t);
                }
            }
        }else{
            throw new RuntimeException("Conjunto vazio");
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if(!tarefaSet.isEmpty()){
            for(Tarefa t : tarefaSet){
                if(!t.getConcluida()){
                    tarefasPendentes.add(t);
                }
            }
        }else{
            throw new RuntimeException("Conjunto vazio");
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        if(!tarefaSet.isEmpty()){
            for(Tarefa t : tarefaSet){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    if(!t.getConcluida()) {
                        t.setConcluida(true);
                    }else{
                        throw new RuntimeException("Tarefa já concluída");
                    }
                }
            }
        }else{
            throw new RuntimeException("Conjunto vazio");
        }
    }

    public void marcarTarefaPendente(String descricao){
        Tarefa tarefaPendente = null;
        if(!tarefaSet.isEmpty()){
            for(Tarefa t : tarefaSet){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    if(t.getConcluida()) {
                        tarefaPendente = t;
                        break;
                    }else{
                        throw new RuntimeException("Tarefa já pendente");
                    }
                }
            }

            if(tarefaPendente != null){
                tarefaPendente.setConcluida(false);
                System.out.println("Tarefa " + tarefaPendente.getDescricao() + " marcada como pendente! Concluida? " + tarefaPendente.getConcluida());
            }else{
                System.out.println("Tarefa não encontrada na lista");
            }
        }else{
            throw new RuntimeException("Conjunto vazio");
        }
    }

    public void limparListaTarefas(){
        tarefaSet.clear();
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefa = new ListaTarefas();

        listaTarefa.adicionarTarefa(new Tarefa("Tarefa 1", false));
        listaTarefa.adicionarTarefa(new Tarefa("Tarefa 2", false));
        listaTarefa.adicionarTarefa(new Tarefa("Tarefa 3", true));
        listaTarefa.adicionarTarefa(new Tarefa("Tarefa 4", false));
        listaTarefa.adicionarTarefa(new Tarefa("Tarefa 5", false));

        listaTarefa.exibirTarefas();
        System.out.println("\n" + listaTarefa.obterTarefasConcluidas());
        System.out.println("\n" + listaTarefa.obterTarefasPendentes());

        listaTarefa.marcarTarefaConcluida("Tarefa 1");
        listaTarefa.marcarTarefaPendente("Tarefa 3");
        listaTarefa.removerTarefa("tarefa 5");

        listaTarefa.exibirTarefas();

        listaTarefa.limparListaTarefas();

        listaTarefa.exibirTarefas();
    }

}
