package Códigos;

import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class AnaliseAcionistas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String dataInicial = scanner.nextLine();
        String dataFinal = scanner.nextLine();

        List<String> analises = new ArrayList<>();
        SistemaAcionistas sistemaAcionistas = new SistemaAcionistas();

        try {
            analises = sistemaAcionistas.obterAnalisesDesempenho(dataInicial, dataFinal);
        }catch(ParseException ex){
            System.out.println(ex.getMessage());
        }

        for (String analise : analises) {
            System.out.println(analise);
        }

    }

}

class SistemaAcionistas {
    public List<String> obterAnalisesDesempenho(String dataInicialStr, String dataFinalStr) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date dataInicial = df.parse(dataInicialStr);
        Date dataFinal = df.parse(dataFinalStr);

        // Simula uma base da dados em uma lista de análises:
        List<Analise> analises = new ArrayList<>();
        analises.add(new Analise(df.parse("01/01/2023"), "Analise de Desempenho Financeiro"));
        analises.add(new Analise(df.parse("15/02/2023"), "Analise de Riscos e Exposicoes"));
        analises.add(new Analise(df.parse("31/03/2023"), "Analises Corporativas"));
        analises.add(new Analise(df.parse("01/04/2023"), "Analise de Politicas e Regulamentacoes"));
        analises.add(new Analise(df.parse("15/05/2023"), "Analise de Ativos"));
        analises.add(new Analise(df.parse("30/06/2023"), "Analise de Inovacao e Tecnologia"));

        //TODO: Implemente o filtro das análises dentro do período especificado. Dica: Crie uma lista para
        // armazenar as análises filtradas e use um loop for para filtrar as análises.

        List<Analise> analisesFiltradas = analises;
        analisesFiltradas.removeIf(a -> a.data.before(dataInicial) || a.data.after(dataFinal));

        List<String> frasesFiltradas = new ArrayList<>();
        for(Analise a : analisesFiltradas){
            frasesFiltradas.add(a.descricao);
        }

        // TODO: Retorne a lista de análises filtradas.
        return frasesFiltradas;
    }

    class Analise {
        Date data;
        String descricao;

        public Analise(Date data, String descricao) {
            this.data = data;
            this.descricao = descricao;
        }
    }
}