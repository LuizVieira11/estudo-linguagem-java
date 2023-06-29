import java.util.Scanner;

public class Soma2Inteiros {
    public static void main(String[] args) {
        int a, b, x;
        Scanner scanner = new Scanner(System.in);
        
        System.out.printf("Insira valor inteiro (A): ");
        a = scanner.nextInt();

        System.out.printf("Insira o segundo valor inteiro (B): ");
        b = scanner.nextInt();

        x = a + b;

        System.out.printf("%n%nOs dois valores somados são: %d", x);

    }    
}
