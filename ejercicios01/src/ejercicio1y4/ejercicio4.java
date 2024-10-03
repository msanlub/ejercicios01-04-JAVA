package ejercicio1y4;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca el primer numero: ");
        int numero1 = scanner.nextInt();

        System.out.println("Introduzca el segundo numero: ");
        int numero2 = scanner.nextInt();

        double resultadoSuma = calculadora.suma(numero1, numero2);
        double resultadoResta = calculadora.resta(numero1, numero2);
        double resultadoMultiplicacion = calculadora.multiplicacion(numero1, numero2);
        double resultadoDivision = calculadora.division(numero1, numero2);

        System.out.println("El resultado de la suma es: " + resultadoSuma);
        System.out.println("El resultado de la resta es: " + resultadoResta);
        System.out.println("El resultado de la multiplicacion es: " + resultadoMultiplicacion);
        System.out.println("El resultado de la division es: " + resultadoDivision);

        scanner.close();
    }
}
