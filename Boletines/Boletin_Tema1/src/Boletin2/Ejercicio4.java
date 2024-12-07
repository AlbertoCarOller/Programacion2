package Boletin2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora;
        int min;
        int seg;
        int sumaHora;
        int sumaMin;
        int sumaSeg;
        int horasIni = 0;

        do {
            System.out.println("Introduce una hora base");
            hora = sc.nextInt();

        } while (hora < 0 || hora > 23);

        do {
            System.out.println("Introduce unos minutos");
            min = sc.nextInt();

        } while (min < 0 || min > 59);

        do {
            System.out.println("Introduce unos segundos");
            seg = sc.nextInt();

        } while (seg < 0 || seg > 59);

        System.out.println("¿Cuántas horas quieres sumar?");
        sumaHora = sc.nextInt();

        System.out.println("¿Cuántos minutos quieres sumar?");
        sumaMin = sc.nextInt();

        System.out.println("¿Cuántos segundos quieres sumar?");
        sumaSeg = sc.nextInt();

        sc.close();

        int totalHora = hora + sumaHora;
        int totalMin = min + sumaMin;
        int totalSeg = seg + sumaSeg;

        if (totalSeg > 59) {

            totalMin += totalSeg / 60;
            totalSeg = totalSeg % 60;
        }

        if (totalMin > 59) {

            totalHora += totalMin / 60;
            totalMin = totalMin % 60;
        }

        if (totalHora > 23) {
            horasIni = totalHora / 24;
            totalHora = totalHora % 24;

        }

        System.out.printf("%02d:%02d:%02d del día %d", totalHora, totalMin, totalSeg, horasIni);
    }

}
