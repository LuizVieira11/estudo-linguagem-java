package Códigos;

import java.util.Locale;
import java.util.Scanner;

public class AberturaConta {

    public static void main(String[] args) {
        // Lendo os dados de Entrada:
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha após a entrada do número da conta
        String nomeTitular = scanner.nextLine();
        double saldo = scanner.nextDouble();

        //TODO: Criar uma instância de "ContaBancaria" com os valores de Entrada.

        ContaBancaria novaConta = new ContaBancaria(numeroConta, nomeTitular, saldo);

        System.out.println("Informacoes:");
        System.out.println("Conta: " + novaConta.numero);
        System.out.println("Titular: " + novaConta.titular);
        System.out.println("Saldo: R$" + novaConta.saldo);
        //TODO: Imprimir as informações da conta usando o objeto criado no TODO acima.
    }
}

class ContaBancaria {
    int numero;
    String titular;
    double saldo;

    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

}
