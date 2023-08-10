package Collections.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private Map<String, Integer> contagemMap;

    public ContagemPalavras(){
        this.contagemMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        contagemMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        contagemMap.remove(palavra);
    }

    public void exibirContagem(){
        System.out.println(contagemMap);
    }

    public Map<String, Integer> encontrarPalavraMaisFrequente(){
        String palavraMaisFrequente = null;
        int maiorContagem = 0;
        if(!contagemMap.isEmpty()){
            for(Map.Entry<String, Integer> entry : contagemMap.entrySet()){
                if(entry.getValue() > maiorContagem){
                    palavraMaisFrequente = entry.getKey();
                    maiorContagem = entry.getValue();
                }
            }
        }else{
            throw new RuntimeException("Map vazio");
        }
        Map<String, Integer> palavraFreq = new HashMap<>();
        palavraFreq.put(palavraMaisFrequente, maiorContagem);
        return palavraFreq;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();
        contagemPalavras.adicionarPalavra("Palavra 1", 2);
        contagemPalavras.adicionarPalavra("Palavra 2", 8);
        contagemPalavras.adicionarPalavra("Palavra 3", 1);
        contagemPalavras.adicionarPalavra("Palavra 4", 6);
        contagemPalavras.exibirContagem();
        System.out.println("A palavra mais frequente é: " + contagemPalavras.encontrarPalavraMaisFrequente());
    }
}
