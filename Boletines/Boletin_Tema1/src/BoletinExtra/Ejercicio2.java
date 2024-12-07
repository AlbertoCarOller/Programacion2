package BoletinExtra;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resto;
        int i = 0;
        int suma = 0;

        System.out.println("Introduce un número binario");
        int numBin = sc.nextInt();

        do {
            resto = numBin % 10;
            suma += resto * (int) Math.pow(2, i);
            numBin = numBin / 10;
            i++;

        } while (numBin > 0);

        System.out.println("El resultado es " + suma);
    }
}