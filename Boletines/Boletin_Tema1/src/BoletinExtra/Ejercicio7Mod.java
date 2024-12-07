package BoletinExtra;

import java.util.Scanner;

public class Ejercicio7Mod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el tamaño del cuadrado");
        int tamano = sc.nextInt();


        for (int i = 0; i < tamano; i++) { // Filas

            for (int j = 0; j < tamano; j++) { // Columnas

                if (j == 0 || j == tamano - 1) { // Imprime "*" en la primera columna y en la última
                    System.out.print("*");

                } else if (i == 0 || i == tamano - 1) { // Imprime "*" en la primera fila y en la última
                    System.out.print("*");

                } else {
                    System.out.print(" "); // Crea espacios en las demás posiciones

                }
            }
            System.out.println();
        }
    }
}
