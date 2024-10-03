package ejercicio2y3;
/*Ejercicio 2
Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere convertir debe ser
introducida por teclado.
*/

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        ConversorMonedas conversor = new ConversorMonedas();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese euros: ");
        double euros = scanner.nextDouble();

        double resultado = conversor.eurosAPesetas(euros);

        System.out.println("El resultado es: " + resultado + " ptas.");

        scanner.close();
    }
}
