package BoletinExtra;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numDec;
        int resto;
        String numBin = ""; // Declaramos el String donde guardaremos el número binario

        do { // Pedimos un número decimal el cuál tendrá que ser mayor a 0
            System.out.println("Introduce un número decimal");
            numDec = sc.nextInt();

        } while (numDec <= 0);


        do { // Obtenemos el resto del número original entre 2 constantemente mientras que el número sea mayor a 0
            resto = numDec % 2;
            numBin += resto;
            numDec = numDec / 2;

        } while (numDec > 0);

        StringBuilder sb = new StringBuilder(numBin); // Ordenamos el String de forma reversa
        String numBinInver = sb.reverse().toString();

        System.out.println("El resultado es " + numBinInver);

    }
}
