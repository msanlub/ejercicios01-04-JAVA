/*Ejercicio 4
Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle for .*/

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    public List<Integer> contarHaciaAtras() {
        List<Integer> numeros = new ArrayList<>();

        // Bucle for que cuenta hacia atrás de 20 en 20 desde 320 hasta 160
        for (int i = 320; i >= 160; i -= 20) {
            numeros.add(i); // Añadir el número a la lista
        }

        return numeros; // Retornar la lista de números
    }

    public static void main(String[] args) {
        Ejercicio4 ejercicio4 = new Ejercicio4();
        List<Integer> numeros = ejercicio4.contarHaciaAtras();

        // Mostrar los resultados
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }
}
