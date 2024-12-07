package BoletinExtra;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce los grados celsisus");
        int celsius = sc.nextInt();

        float fahren = (celsius * 9f / 5) + 32;

        System.out.println("Son " + fahren);
    }
}
