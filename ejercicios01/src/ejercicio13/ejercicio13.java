package ejercicio13;

/*Ejercicio 13
Realiza un programa que calcule la nota que hace falta sacar en el segundo examen de la asignatura
Programación para obtener la media deseada. Hay que tener en cuenta que la nota del primer
examen cuenta el 40% y la del segundo examen un 60%.*/

import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        CalculadoraNotas calculadora =  new CalculadoraNotas();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la nota del primer examen: ");
        float primeraNota = scanner.nextFloat();
        System.out.println("¿Qué nota quieres sacar en el trimestre? ");
        float notaDeseada = scanner.nextFloat();

        double segundaNota = calculadora.segundaNota(primeraNota, notaDeseada);

        System.out.printf("Para tener un %.2f en el trimestre necesitas sacar un %.2f en el segundo examen.%n", notaDeseada, segundaNota);

        scanner.close();
    }
}
