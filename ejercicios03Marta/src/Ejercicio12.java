import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Ejercicio 12
Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos anteriores,
por lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se
debe introducir por teclado*/

public class Ejercicio12 {
    public List<Integer> calcularFibonacci(int n) {
        List<Integer> fibonacci = new ArrayList<>();

        if (n <= 0) {
            return fibonacci;
        }

        int a = 0;
        int b = 1;

        for (int i = 1; i <= n; i++) {
            fibonacci.add(a);
            int siguiente = a + b;
            a = b;
            b = siguiente;
        }

        return fibonacci;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el número de términos de Fibonacci que deseas mostrar: ");
        int n = scanner.nextInt();

        Ejercicio12 ejercicio12 = new Ejercicio12();
        List<Integer> numeros = ejercicio12.calcularFibonacci(n);

        // Mostrar los resultados
        System.out.println("Los primeros " + n + " términos de la serie de Fibonacci son:");
        for (Integer numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();

        scanner.close();
    }
}
