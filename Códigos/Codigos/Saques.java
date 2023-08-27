package Códigos;

import java.util.Scanner;

public class Saques {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int saldoTotal = scanner.nextInt();
        int valorSaque = scanner.nextInt();

        if(saldoTotal < valorSaque){
            System.out.println("Saldo insuficiente. Saque nao realizado!");
        }else{
            saldoTotal = saldoTotal - valorSaque;
            System.out.println("Saque realizado com sucesso! Novo saldo: " + saldoTotal);
        }

    }

}

/*                          Descrição
Uma nova feature para um sistema bancário foi analisada pela equipe de desenvolvimento
e será uma das tarefas a serem trabalhadas durante a sprint, como desenvolvedor da empresa
você recebeu os requisitos para a nova implementação que consiste em uma solução algorítmica
que permita aos clientes realizarem saques em caixas eletrônicos. No entanto, existem algumas
regras a serem seguidas para garantir que um saque possa ser realizado com sucesso.
 */