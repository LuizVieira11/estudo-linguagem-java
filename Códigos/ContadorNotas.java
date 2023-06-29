import java.util.Scanner;

public class ContadorNotas {

    //Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário.
    //A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto.

    public static void main(String[] args) {
        double  valor;
        int nota100 = 0, nota50 = 0, nota20 = 0, nota10 = 0, nota5 = 0, nota2 = 0;
        int moeda1 = 0, moeda50 = 0, moeda25 = 0, moeda10 = 0, moeda5 = 0, moeda01 = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual o valor que será calculado? ");
        valor = scanner.nextDouble();

        int n = (int) (valor * 100);

        do {
            if (n - 10000 >= 0) {
                nota100++;
                n = n - 10000;
            } else if (n - 5000 >= 0) {
                nota50++;
                n = n - 5000;
            } else if (n - 2000 >= 0) {
                nota20++;
                n = n - 2000;
            } else if (n - 1000 >= 0) {
                nota10++;
                n = n - 1000;
            } else if (n - 500 >= 0) {
                nota5++;
                n = n - 500;
            } else if(n - 200 >= 0){
                nota2++;
                n = n - 200;
            }else if (n - 100 >= 0) {
                moeda1++;
                n = n - 100;
            } else if (n - 50 >= 0) {
                moeda50++;
                n = n - 50;
            } else if (n - 25 >= 0) {
                moeda25++;
                n = n - 25;
            } else if (n - 10 >= 0) {
                moeda10++;
                n = n - 10;
            } else if (n - 5 >= 0) {
                moeda5++;
                n = n - 5;
            } else if (n - 1 >= 0) {
                moeda01++;
                n = n - 1;
            }
        }while(n > 0);

        System.out.printf("%nNOTAS:%n%n");
        System.out.println(nota100 + " nota(s) de R$100,00");
        System.out.println(nota50 + " nota(s) de R$50,00");
        System.out.println(nota20 + " nota(s) de R$20,00");
        System.out.println(nota10 + " nota(s) de R$10,00");
        System.out.println(nota5 + " nota(s) de R$5,00");
        System.out.println(nota2 + " nota(s) de R$2,00");
        System.out.printf("%nMOEDAS:%n%n");
        System.out.println(moeda1 + " moeda(s) de R$1,00");
        System.out.println(moeda50 + " moeda(s) de R$0,50");
        System.out.println(moeda25 + " moeda(s) de R$0,25");
        System.out.println(moeda10 + " moeda(s) de R$0,10");
        System.out.println(moeda5 + " moeda(s) de R$0,05");
        System.out.println(moeda01 + " moeda(s) de R$0,01");

    }
}
