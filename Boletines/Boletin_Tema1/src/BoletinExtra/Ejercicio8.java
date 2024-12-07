package BoletinExtra;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura;

        System.out.println("Introduce el ancho del rectángulo");
        int ancho = sc.nextInt();

        System.out.println("Introduce la altura del rectángulo");
        altura = sc.nextInt();


        for (int i = 0; i < altura; i++) { // Filas

            for (int j = 0; j < ancho; j++) { // Columnas

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
