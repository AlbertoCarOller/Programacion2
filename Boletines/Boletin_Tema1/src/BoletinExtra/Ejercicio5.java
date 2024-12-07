package BoletinExtra;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce grados a Fahrenheit");
        int fahren = sc.nextInt();

        float celsius = (5f / 9) * (fahren - 32);

        System.out.println("Son " + celsius);
    }
}
