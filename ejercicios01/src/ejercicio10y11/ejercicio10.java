package ejercicio10y11;

/*Ejercicio 10
Realiza un conversor de Mb a Kb.*/

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {

        ConversorBytes conversor = new ConversorBytes();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de Mb: ");
        double megabytes = scanner.nextDouble();

        double kilobytes = conversor.megabytesAKilobytes(megabytes);
        System.out.println("El valor en kilobytes es: " + kilobytes);

        scanner.close();
    }
}
