package BoletinExtra;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una altura para el triángulo");
        int altura = sc.nextInt();

        for (int i = 0; i < altura; i++) {

            for (int j = 0; j <= i; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
