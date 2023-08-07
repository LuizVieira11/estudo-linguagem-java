package Collections;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> numerosList;

    public SomaNumeros(){
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numerosList.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        if(!numerosList.isEmpty()){
            for(int i : numerosList){
                soma += i;
            }
        }else{
            throw new RuntimeException("Lista vazia");
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maiorNum = 0;
        if(!numerosList.isEmpty()){
            for(int i : numerosList){
                if(i > maiorNum){
                    maiorNum += i;
                }
            }
        }else{
            throw new RuntimeException("Lista vazia");
        }
        return maiorNum;
    }

    public int encontrarMenorNumero(){
        int menorNum = 0;
        if(!numerosList.isEmpty()){
            for(int i : numerosList){
                if(i < menorNum){
                    menorNum += i;
                }
            }
        }else{
            throw new RuntimeException("Lista vazia");
        }
        return menorNum;
    }

    public void exibirNumeros(){
        System.out.println(numerosList);
    }

    public static void main(String[] args) {

        SomaNumeros numeros = new SomaNumeros();

        numeros.adicionarNumero(6);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(-9);
        numeros.adicionarNumero(-2);

        numeros.exibirNumeros();
        System.out.println(numeros.calcularSoma());
        System.out.println(numeros.encontrarMaiorNumero());
        System.out.println(numeros.encontrarMenorNumero());

    }

}
