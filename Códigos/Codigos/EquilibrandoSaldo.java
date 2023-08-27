package Códigos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EquilibrandoSaldo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("##.0");

        double saldoAtual = scanner.nextDouble();
        double valorDeposito = scanner.nextDouble();
        double valorRetirada = scanner.nextDouble();

        saldoAtual = (saldoAtual + valorDeposito) - valorRetirada;

        System.out.println("Saldo atualizado na conta: " + decimalFormat.format(saldoAtual));

    }

}
/*          Enunciado do Desafio
    Para esse desafio, considere que você foi contratado por uma empresa bancária para auxiliar nas implementações e melhorias do sistema empresarial.
    Em uma análise inicial, foi identificado pela equipe financeira a necessidade de desenvolver uma solução que permita ao cliente equilibrar seu saldo bancário.
    Dessa forma, o programa deve solicitar uma entrada que representa o saldo atual do funcionário, e após, seja informado o valor
    de duas transações, sendo elas: um depósito e um saque. O programa deve atualizar o saldo com base nas transações e exibir o saldo final.

    Informação: As transações de depósito e retirada devem ser tratadas como valores positivos e negativos, respectivamente,
    para garantir que o cálculo do saldo final seja realizado corretamente. */