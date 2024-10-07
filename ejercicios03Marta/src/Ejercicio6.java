/**/

import java.util.ArrayList;
import java.util.List;

public class Ejercicio6 {
    public List<Integer> contarHaciaAtras() {
        List<Integer> numeros = new ArrayList<>();
        int i = 320;

        do {
            numeros.add(i); // Añadir el número a la lista
            i -= 20; // Restar 20
        } while (i >= 160);

        return numeros; // Retornar la lista de números
    }

    public static void main(String[] args) {
        Ejercicio6 ejercicio6 = new Ejercicio6();
        List<Integer> numeros = ejercicio6.contarHaciaAtras();

        // Mostrar los resultados
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }
}
