package BoletinExtra;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la altura del árbol de navidad");
        int altura = sc.nextInt();

        for (int i = 0; i < altura; i++) {

            for (int j = 0; j < altura - i - 1; j++) {

                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
