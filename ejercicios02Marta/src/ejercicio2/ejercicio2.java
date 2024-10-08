package ejercicio2;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Saludo saludo = new Saludo();

        System.out.println("Indica una hora: ");
        int hora = Integer.parseInt(scanner.nextLine());

        String salida = saludo.saludo(hora);
        System.out.println(salida);

        scanner.close();
    }
}
