package ejercicio1y4;

/*Ejercicio 1
Realiza un programa que pida dos números y que luego muestre el resultado de su multiplicación.*/

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.print("Introduce el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int numero2 = scanner.nextInt();

        double resultado = calculadora.multiplicacion(numero1, numero2);

        System.out.println("El resultado es: " + resultado);

        scanner.close();
    }
}


