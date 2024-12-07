package Boletin2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numInver = 0;

        System.out.println("Introduce el número a invertir");
        int num = sc.nextInt();
        sc.close();

        do {
            int resto = num % 10;
            numInver = numInver * 10 + resto;
            num = num / 10;

        } while (num != 0);

        System.out.println("El número invertido es " + numInver);
    }
}
