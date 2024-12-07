package BoletinExtra;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el tamaño del cuadrado");
        int tamano = sc.nextInt();


        for (int i = 0; i < tamano; i++) {

            for (int j = 0; j < tamano; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
