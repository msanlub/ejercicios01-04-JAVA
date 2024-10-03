package ejercicio7;

import java.util.Scanner;

/*Ejercicio 7
Escribe un programa que calcule el total de una factura a partir de la base imponible.
* */
public class ejercicio7 {
    public static void main(String[] args) {

        FacturaSinIva factura = new FacturaSinIva();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad total de la factura: ");
        double total = scanner.nextDouble();

        double facturaSinIva = factura.calcularFactura(total);

        System.out.println("La factura sin iva es: " + facturaSinIva);
        scanner.close();
    }
}

