package ejercicio15;

/*Ejercicio 15
Escribe un programa que dados dos números, uno real (base) y un entero positivo (exponente),
saque por pantalla todas las potencias con base el numero dado y exponentes entre uno y el expo-
nente introducido. No se deben utilizar funciones de exponenciación. Por ejemplo, si introducimos
el 2 y el 5, se deberán mostrar 2 1 , 2 2 , 2 3 , 2 4 y 2 5 .
*/

import java.util.ArrayList;
import java.util.List;

public class Potencias {

    public List<Double> calcularPotencias(double base, int exponente) {
        List<Double> resultados = new ArrayList<>();
        double resultado = 1;

        for (int i = 1; i <= exponente; i++) {
            resultado *= base;
            resultados.add(resultado); // Agregar el resultado a la lista
        }

        return resultados; // Devolver la lista de resultados
    }
}
