package ejercicio5y6y9;

import java.util.Scanner;

/*Ejercicio 9
Escribe un programa que calcule el volumen de un cono según la fórmula */
public class ejercicio9 {
    public static void main(String[] args) {
        Areas areas = new Areas();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el radio del cono: ");
        double radio = scanner.nextDouble();
        System.out.println("Ingrese la altura del cono: ");
        double altura = scanner.nextDouble();

        double volumen = areas.volumenCono(radio, altura);
        System.out.println("El volumen del cono es: " + volumen);

        scanner.close();
    }
}
