package Collections.set.Pesquisa;

public class Tarefa {

    private String descricao;
    private boolean concluida;

    public Tarefa(String descricao, boolean concluida){
        this.descricao = descricao;
        this.concluida = concluida;
    }

    public String getDescricao(){
        return descricao;
    }

    public boolean getConcluida(){
        return concluida;
    }

    public void setConcluida(boolean concluida){
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        return "\n-> Descrição: " + descricao + " | Concluida? " + concluida;
    }
}
