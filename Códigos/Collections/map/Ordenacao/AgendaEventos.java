package Collections.map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Evento> agendaMap;

    public AgendaEventos(){
        this.agendaMap = new HashMap<>();
    }

    public void addEvento(LocalDate data, String nome, String atracao){
        agendaMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agendaMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agendaMap);
        LocalDate dataAtual = LocalDate.now();
        if(!agendaMap.isEmpty()){
            for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
                if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                    System.out.println("O próximo evento " + entry.getValue() + " acontecerá dia " + entry.getKey());
                    break;
                }
            }
        }else{
            throw new RuntimeException("Não há eventos");
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.addEvento(LocalDate.of(2023, Month.AUGUST, 11), "Evento 1" , "Atração 1");
        agendaEventos.addEvento(LocalDate.of(2023, Month.AUGUST, 10), "Evento 7" , "Atração 1");
        agendaEventos.addEvento(LocalDate.of(2023, 8, 13), "Evento 2" , "Atração 2");
        agendaEventos.addEvento(LocalDate.of(2023, 12, 8), "Evento 3" , "Atração 3");
        agendaEventos.addEvento(LocalDate.of(2023, 7, 31), "Evento 4" , "Atração 4");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }

}
