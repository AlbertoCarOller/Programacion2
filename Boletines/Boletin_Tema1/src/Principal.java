import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe tu nombre");
        String nombre = sc.nextLine();


        System.out.println("¿Cuál es tu edad");
        int edad = Integer.parseInt(sc.nextLine());

        System.out.println("Hola, tienes " + edad);
    }
}