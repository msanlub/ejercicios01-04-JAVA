/*Ejercicio 14
Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El programa intentará
adivinar el número que estás pensando - un número entre 0 y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el programa debe preguntar si el número que estás pensando es
mayor o menor que el que te acaba de decir.
*/

public class Ejercicio14 {
    public int[] adivinarNumero(boolean[] mayorMenor) {
        int[] intentos = new int[5];
        int min = 0;
        int max = 100;
        int intentoActual;

        for (int i = 0; i < 5; i++) {
            intentoActual = (min + max) / 2;
            intentos[i] = intentoActual;

            if (mayorMenor[i]) {
                min = intentoActual + 1;
            } else {
                max = intentoActual - 1;
            }
        }

        return intentos;
    }

    public static void main(String[] args) {

        boolean[] mayorMenor = {true, false, true, false, true};

        Ejercicio14 ejercicio14 = new Ejercicio14();
        int[] intentos = ejercicio14.adivinarNumero(mayorMenor);

        System.out.println("Intentos realizados:");
        for (int intento : intentos) {
            System.out.println(intento);
        }
    }
}
