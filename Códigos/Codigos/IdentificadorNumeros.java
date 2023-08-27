package Códigos;

import java.util.Scanner;

public class IdentificadorNumeros {
    public static void main(String[] args) {
        int[] nums = new int[5];
        int par = 0, impar = 0, pos = 0, neg = 0;
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            System.out.printf("Digite o " + (i + 1) + "° número inteiro: ");
            nums[i] = scanner.nextInt();
        }

        for(int i = 0; i < 5; i++){
            if(nums[i] % 2 == 0){
                par++;
            }else{
                impar++;
            }

            if(nums[i] >= 0){
                pos++;
            }else{
                neg++;
            }
        }

        System.out.printf("%n%n");
        System.out.println("Quantidades de números:");
        System.out.println("Ímpares: " + impar);
        System.out.println("Pares: " + par);
        System.out.println("Positivos: " + pos);
        System.out.println("Negativos: " + neg);

    }
}
