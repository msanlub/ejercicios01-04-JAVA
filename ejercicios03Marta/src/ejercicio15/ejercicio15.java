package ejercicio15;

import java.util.List;
import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Potencias potencias = new Potencias();

        System.out.print("Ingrese la base: ");
        double base = scanner.nextDouble();

        System.out.print("Ingrese el exponente: ");
        int exponente = scanner.nextInt();

        if (exponente < 1) {
            System.out.println("El exponente debe ser un entero positivo.");
            return;
        }

        List<Double> resultados = potencias.calcularPotencias(base, exponente);

        // Imprimir los resultados
        System.out.println("Las potencias de " + base + " son:");
        for (int i = 0; i < resultados.size(); i++) {
            System.out.println(base + " elevado a " + (i + 1) + " es: " + resultados.get(i));
        }

        scanner.close();
    }
}