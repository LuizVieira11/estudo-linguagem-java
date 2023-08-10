package Collections.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> dicionarioMap;

    public Dicionario(){
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if(!dicionarioMap.isEmpty()){
            dicionarioMap.remove(palavra);
        }else{
            throw new RuntimeException("Map vazio");
        }
    }

    public void exibirPalavras(){
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra){
        if(!dicionarioMap.isEmpty()){
            return dicionarioMap.get(palavra);
        }else{
            throw new RuntimeException("Map vazio");
        }
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Rap", "Estilo Musical");
        dicionario.adicionarPalavra("Panqueca", "Comida feita com farinha");
        dicionario.adicionarPalavra("Teclado", "Aquilo que usa pra digitar no computador ou instrumento musical");
        dicionario.adicionarPalavra("Notebook", "Computador Portátil");

        dicionario.exibirPalavras();

        dicionario.removerPalavra("Panqueca");
        dicionario.exibirPalavras();

        System.out.println("Definição: " + dicionario.pesquisarPorPalavra("Teclado"));
    }

}
