package ejercicio5;

/*Ejercicio 5
Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle while .*/

import java.util.ArrayList;
import java.util.List;

public class ContadorHaciaAtras {
    public List<Integer> numeros() {
        List<Integer> numeros = new ArrayList<>();

        for (int numero = 320; numero >= 160; numero -= 20) {
            numeros.add(numero);
        }

        return numeros;
    }
}
