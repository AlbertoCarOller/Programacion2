package Boletin2;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorAnterior = Integer.MAX_VALUE;
        int resultado = 0;
        int temp = 0;
        int valorActual;

        System.out.println("Introduce un número romano");
        String numRom = sc.nextLine();

        for (int i = 0; i < numRom.length(); i++) {
            char letra = numRom.charAt(i);

            valorActual = switch (letra) {
                case 'M' -> 1000;
                case 'D' -> 500;
                case 'C' -> 100;
                case 'L' -> 50;
                case 'X' -> 10;
                case 'V' -> 5;
                case 'I' -> 1;
                default -> 0;
            };

            if (valorActual > valorAnterior) {
                resultado += valorActual - temp;
                temp = 0;

            } else if (valorActual == valorAnterior) {
                resultado += valorActual + temp;
                temp = 0;

            } else { // valorAnterior > valorActual
                resultado += temp;
                temp = valorActual;

            }
            valorAnterior = valorActual;
        }
        resultado += temp;

        System.out.println("El resultado es " + resultado);
    }
}
