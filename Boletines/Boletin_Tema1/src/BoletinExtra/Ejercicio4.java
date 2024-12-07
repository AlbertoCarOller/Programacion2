package BoletinExtra;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caras;

        do {
            System.out.println("Introduce el número de caras de un dado");
            caras = sc.nextInt();

        } while (caras <= 0);

        int resultado = tirarDado(caras);

        System.out.println("El dado ha dado " + resultado);

    }

    public static int tirarDado(int caras) {

        int dado = (int) (Math.random() * caras) + 1;
        return dado;
    }
}
