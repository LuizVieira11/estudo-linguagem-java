package Collections.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> stringSet;

    public ConjuntoPalavrasUnicas(){
        this.stringSet = new HashSet<>();
    }

    public void adicionarPalavras(String palavra){
        stringSet.add(palavra);
    }

    public void removerPalavra(String palavra){
        if (!stringSet.isEmpty()) {
            stringSet.remove(palavra);
        }else{
            System.out.println("O conjunto está vazio");
        }
    }

    public boolean verificarPalavra(String palavra){
        return stringSet.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        if(!stringSet.isEmpty()) {
            System.out.println(stringSet);
        }else{
            System.out.println("O conjunto está vazio");
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
        conjuntoPalavrasUnicas.adicionarPalavras("Pudim");
        conjuntoPalavrasUnicas.adicionarPalavras("Massa");
        conjuntoPalavrasUnicas.adicionarPalavras("Marmota");
        conjuntoPalavrasUnicas.adicionarPalavras("Esteriótipo");
        conjuntoPalavrasUnicas.adicionarPalavras("Mermaid");

        System.out.println(conjuntoPalavrasUnicas.verificarPalavra("Pudim"));
        System.out.println(conjuntoPalavrasUnicas.verificarPalavra("Mormota"));

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("Massa");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

    }

}
