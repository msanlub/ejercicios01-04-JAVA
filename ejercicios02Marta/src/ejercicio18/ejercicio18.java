package ejercicio18;

import java.util.Scanner;

public class ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrimeraCifra primeraCifra = new PrimeraCifra();

        System.out.println("Ingrese un numero de 1 a 5 cifras: ");
        String numero = scanner.nextLine();

        if (numero.matches("\\d{1,5}")) {
            int resultado = primeraCifra.calcularPrimeraCifra(numero);
            System.out.println("La primera cifra es: " + resultado);
        } else {
            System.out.println("Error: El número debe tener entre 1 y 5 cifras y ser un valor numérico.");
        }

    }
}
