package Boletin2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numInver = 0;

        System.out.println("Introduce un número");
        int num = sc.nextInt();
        sc.close();
        int numOri = num;

        do {
            int resto = num % 10;
            numInver = numInver * 10 + resto;
            num = num / 10;

        } while (num != 0);

        if (numOri == numInver) {

            System.out.println("El número es capicúa");
        } else {
            System.out.println("No lo es");
        }
    }
}
