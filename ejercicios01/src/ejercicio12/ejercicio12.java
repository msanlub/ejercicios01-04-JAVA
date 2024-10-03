package ejercicio12;

/*
* Ejercicio 12
Escribe un programa que calcule el precio final de un producto según su base imponible (precio antes de impuestos), el tipo de IVA aplicado (general, reducido o superreducido) y el código
promocional. Los tipos de IVA general, reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códi- gos promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
respectivamente que no se aplica promoción, el precio se reduce a la mitad, se descuentan 5 euros
o se descuenta el 5%. El ejercicio se da por bueno si se muestran los valores correctos, aunque los
números no estén tabulados.
Ejemplo:
Introduzca la base imponible: 25
Introduzca el tipo de IVA (general, reducido o superreducido): reducido
Introduzca el código promocional (nopro, mitad, meno5 o 5porc): mitad
Base imponible
25.00
IVA (10\%)
2.50
Precio con IVA
27.50
Cód. promo. (mitad): -13.75
TOTAL
13.75
*/

import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        CalculadoraPrecio precioFinal = new CalculadoraPrecio();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca la base imponible del producto: ");
        double precio = scanner.nextDouble();
        System.out.println("Introduzca el tipo de IVA: ");
        String tipoIva = scanner.next();
        System.out.println("Introduzca el codigo promocional: ");
        String codigoPromocional = scanner.next();

        double calculoIva = precioFinal.calcularIVA(tipoIva,precio);
        double calculopromocion = precioFinal.calcularPromo(codigoPromocional,precio);

        System.out.printf("Base imponible: %.2f%n", precio);
        System.out.printf("IVA: %.2f%n", calculoIva - precio);
        System.out.printf("Precio con IVA: %.2f%n", calculoIva);
        System.out.printf("Descuento: %.2f%n", calculopromocion);
        System.out.printf("Precio final: %.2f%n", calculopromocion);
    }
}
