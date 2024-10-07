/*Ejercicio 14
Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El programa intentará
adivinar el número que estás pensando - un número entre 0 y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el programa debe preguntar si el número que estás pensando es
mayor o menor que el que te acaba de decir.
*/

public class Ejercicio14 {
    public int[] adivinarNumero(boolean[] mayorMenor) {
        int[] intentos = new int[5]; // Array para almacenar los intentos
        int min = 0; // Límite inferior
        int max = 100; // Límite superior
        int intentoActual;

        for (int i = 0; i < 5; i++) {
            // Adivinar el número promediando el rango actual
            intentoActual = (min + max) / 2;
            intentos[i] = intentoActual;

            // Verificar si el número es mayor o menor, basado en la entrada mayorMenor
            if (mayorMenor[i]) {
                // Si el número es mayor, ajustamos el límite inferior
                min = intentoActual + 1;
            } else {
                // Si el número es menor, ajustamos el límite superior
                max = intentoActual - 1;
            }
        }

        return intentos; // Retornar la lista de intentos
    }

    public static void main(String[] args) {
        // Este sería el punto de partida para probar manualmente
        // El array `mayorMenor` simula las respuestas del usuario
        boolean[] mayorMenor = {true, false, true, false, true};

        Ejercicio14 ejercicio14 = new Ejercicio14();
        int[] intentos = ejercicio14.adivinarNumero(mayorMenor);

        // Mostrar los intentos realizados
        System.out.println("Intentos realizados:");
        for (int intento : intentos) {
            System.out.println(intento);
        }
    }
}
