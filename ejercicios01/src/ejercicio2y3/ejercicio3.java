package ejercicio2y3;

/*Ejercicio 3
 Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere convertir debe ser introducida por teclado.*/

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        ConversorMonedas conversor = new ConversorMonedas();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese pesetas: ");
        double pesetas = scanner.nextDouble();

        double resultado = conversor.pesetasAEuros(pesetas);

        System.out.println("El resultado es: " + resultado + "€.");

        scanner.close();
    }
}
