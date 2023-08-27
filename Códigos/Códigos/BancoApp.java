package Códigos;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class BancoApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        scanner.useLocale(Locale.US);

        double valorInicial = scanner.nextDouble();
        double taxaJuros = scanner.nextDouble();
        int periodo = scanner.nextInt();

        for(int i = 0; i < periodo; i++){
            double valorDosJuros = valorInicial * taxaJuros;
            valorInicial += valorDosJuros;
        }

        double valorFinal = valorInicial;

        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));

    }

}

/*                          Descrição
Imagine que você está desenvolvendo um aplicativo para um banco que deseja calcular
os juros compostos de um investimento. Seu objetivo é criar uma função que receba três
parâmetros: o valor inicial do investimento, a taxa de juros anual e o período de tempo
em anos. A função deve calcular e retornar o valor final do investimento após o período
determinado, levando em consideração os juros compostos.
 */