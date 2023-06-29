import java.util.Scanner;

public class ConversorTemperatura{
    public static void main(String[] args) {
//        Faça um programa que receba como entrada um valor que represente uma
//        temperatura em graus Celcius e imprima esse valor convertido em
//        Kelvin e Fahrenheit:

//        K = C + 273.15
//        F = C * 1.8 + 32
        
        double tempCelcius, tempKelvin, tempFarenheit;
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite uma temperatura em graus Celcius: ");
        tempCelcius = scanner.nextDouble();

        tempKelvin = tempCelcius + 273.15;
        tempFarenheit = tempCelcius * 1.8 + 32;

        System.out.printf("%n%nA temperatura convertida é:%n%n");
        System.out.println("Em Kelvin: " + tempKelvin);
        System.out.println("Em Farenheit: " + tempFarenheit);
    }
}