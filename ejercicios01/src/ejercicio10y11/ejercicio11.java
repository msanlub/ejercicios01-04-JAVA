package ejercicio10y11;
/*Ejercicio 11
Realiza un conversor de Kb a Mb */

import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        ConversorBytes conversorKb = new ConversorBytes();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de Kb: ");
        double kilobytes = scanner.nextDouble();

        double megabytes = conversorKb.kilobytesAMegabytes(kilobytes);
        System.out.println("El valor en megabytes es: " + megabytes);

        scanner.close();
    }
}
