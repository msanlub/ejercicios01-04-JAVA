package ejercicio5y6y9;

/*Ejercicio 5
Escribe un programa que calcule el área de un rectángulo.*/

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Areas area = new Areas();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de la base: ");
        double base = scanner.nextDouble();
        System.out.println("Ingrese el valor de la altura: ");
        double altura = scanner.nextDouble();

        double resultadoArea = area.areaRectangulo(base,altura);
        System.out.println("El resultado de la area es: " + resultadoArea);

        scanner.close();
    }
}
