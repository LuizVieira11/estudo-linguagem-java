package Códigos;

import java.util.Scanner;

public class SomaIntervalos {
    public static void main(String[] args) {
        int i, j;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Forneça dois valores inteiros para somar os números entre eles: ");
        i = scanner.nextInt();
        j = scanner.nextInt();

        if(i > 0 || j > 0){
            if(i < j){
                for( ; i <= j; i++){
                    if(i == j){
                        System.out.printf(i + " ");
                    }else {
                        System.out.printf(i + " + ");
                    }
                    sum += i;
                }
            }else if(j < i){
                for( ; j <= i; j++){
                    if(i == j){
                        System.out.printf(i + " ");
                    }else {
                        System.out.printf(i + " + ");
                    }
                    sum += j;

                }
            }
        }
        System.out.printf("= " + sum);
    }
    
}
