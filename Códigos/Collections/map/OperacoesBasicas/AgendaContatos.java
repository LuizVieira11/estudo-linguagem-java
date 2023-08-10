package Collections.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos(){
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer numero){
        agendaContatoMap.put(nome, numero);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }else{
            throw new RuntimeException("Map vazio");
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);

        }else{
            throw new RuntimeException("Map vazio");
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Luiz", 123456);
        agendaContatos.adicionarContato("Mario", 55673);
        agendaContatos.adicionarContato("Lima", 99123);
        agendaContatos.adicionarContato("Lima Cruz", 237423);
        agendaContatos.adicionarContato("Laura", 33333);
        agendaContatos.adicionarContato("Monica", 3364578);
        agendaContatos.adicionarContato("Luiz Vieira", 123456);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Luiz");
        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Mario"));


    }

}
