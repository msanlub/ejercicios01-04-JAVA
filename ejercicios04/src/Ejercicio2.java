/*Ejercicio 2
Realiza un programa que muestre al azar el nombre de una carta de la baraja francesa. Esta baraja
está dividida en cuatro palos: picas, corazones, diamantes y tréboles. Cada palo está formado por
13 cartas, de las cuales 9 cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que
sería el 1). Para convertir un número en una cadena de caracteres podemos usar String.valueOf(n).
*/

import java.util.Random;

public class Ejercicio2 {
    public String generarCarta() {

        String[] palos = {"Picas", "Corazones", "Diamantes", "Tréboles"};

        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        Random random = new Random();

        String valor = valores[random.nextInt(valores.length)];
        String palo = palos[random.nextInt(palos.length)];

        return valor + " de " + palo;
    }

    public static void main(String[] args) {
        Ejercicio2 ejercicio2 = new Ejercicio2();
        String carta = ejercicio2.generarCarta();

        System.out.println("Carta generada: " + carta);
    }
}
