package ejercicio19;

import java.util.Scanner;

public class ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Piramide piramide = new Piramide();

        System.out.println("Ingrese la altura de la piramide: ");
        int altura = scanner.nextInt();

        piramide.pintarPiramide(altura);

        scanner.close();
    }
}
