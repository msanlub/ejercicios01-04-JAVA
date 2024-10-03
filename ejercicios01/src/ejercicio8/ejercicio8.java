package ejercicio8;

/*Ejercicio 8
Escribe un programa que calcule el salario semanal de un empleado en base a las horas trabajadas,
a razón de 12 euros la hora.
*/

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        SalarioSemanal salarioSemanal = new SalarioSemanal();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las horas trabajadas en la semana: ");
        int horas = scanner.nextInt();

        double salario = salarioSemanal.calcularSalario(horas);
        System.out.println("El salario semanal es: " + salario + "€.");

        scanner.close();
    }
}
