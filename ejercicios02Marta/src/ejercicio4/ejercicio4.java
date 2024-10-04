package ejercicio4;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        CalculadorSalario salarioSemanal = new CalculadorSalario();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las horas trabajadas en la semana: ");
        int horas = scanner.nextInt();

        double salario = salarioSemanal.calcularSalario(horas);
        System.out.println("El salario semanal es: " + salario + "€.");

        scanner.close();
    }
}
