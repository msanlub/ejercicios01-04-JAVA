/*Ejercicio 1
Escribe un programa que pida por teclado un día de la semana y que diga qué asignatura toca a
primera hora ese día.*/

import java.util.Arrays;
import java.util.Scanner;

class EjerciciosSwitch {

    public static String pedirDia() {
        Scanner sc = new Scanner(System.in);
        String dia = sc.nextLine();
        if (Arrays.asList("lunes", "martes", "miércoles", "jueves", "viernes").contains(dia)) {
            return dia;
        } else {
            return "null";
        }
    }

    public static String asignaturaPorDia(String dia) {
        switch (dia) {
            case "lunes":
                return "Matemáticas";
            case "martes":
                return "Lengua";
            case "miércoles":
                return "Inglés";
            case "jueves":
                return "Ciencias";
            case "viernes":
                return "Historia";
        }
        return "Día no válido";
    }


    public static String nombreDiaSemana(int numero) {
        switch (numero) {
            case 1:
                return "Lunes";
            case 2:
                return "Martes";
            case 3:
                return "Miércoles";
            case 4:
                return "Jueves";
            case 5:
                return "Viernes";
            case 6:
                return "Sábado";
            case 7:
                return "Domingo";
        }
        return "Número no válido";
    }

    //Ejercicio 15
    //Escribe un programa que pinte una pirámide rellena con un carácter introdu- cido por teclado que
    //podrá ser una letra, un número o un símbolo como *, +, -, $, &, etc. El programa debe permitir
    //al usuario mediante un menú elegir si el vértice de la pirámide está apuntando hacia arriba, hacia
    //abajo, hacia la izquierda o hacia la derecha. 36Sentencia condicional ( if y switch )

    public static String dibujarPiramide(char caracter, String orientacion, int filas) {
        StringBuilder piramide = new StringBuilder();
        switch (orientacion) {
            case "arriba":
                for (int i = 1; i <= filas; i++) {
                    for (int j = filas; j > i; j--) {
                        piramide.append(" ");
                    }
                    for (int k = 1; k <= (2 * i - 1); k++) {
                        piramide.append(caracter);
                    }
                    for (int j = filas; j > i; j--) {
                        piramide.append(" ");
                    }
                    piramide.append("\n");
                }
                return piramide.toString();
            case "abajo":
                for (int i = filas; i >= 1; i--) {
                    for (int j = filas; j > i; j--) {
                        piramide.append(" ");
                    }
                    for (int j = 1; j <= (2 * i - 1); j++) {
                        piramide.append(caracter);
                    }
                    for (int j = filas; j > i; j--) {
                        piramide.append(" ");
                    }
                    piramide.append("\n");
                }
            case "derecha":
                for (int i = 1; i <= filas; i++) {
                    for (int j = 1; j <= i; j++) {
                        piramide.append(caracter+" ");
                    }
                    piramide.append("\n");
                }

                // Parte inferior de la figura
                for (int i = filas - 1; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        piramide.append(caracter+ " ");
                    }
                    piramide.append("\n");
                }
                return piramide.toString();
            case "izquierda":
                for (int i = 1; i <= filas; i++) {
                    for (int j = 1; j <= filas - i; j++) {
                        piramide.append("   ");
                    }
                    for (int k = 1; k <= i; k++) {
                        piramide.append(caracter+"  ");
                    }
                    piramide.append("\n");
                }
                for (int i = filas - 1; i >= 1; i--) {
                    for (int j = 1; j <= filas - i; j++) {
                        piramide.append("   ");
                    }
                    for (int k = 1; k <= i; k++) {
                        piramide.append(caracter+"  ");
                    }
                    piramide.append("\n");
            }
                return piramide.toString();
        }
        return piramide.toString();
    }
    public static void main(String[] args) {
        //System.out.println(dibujarPiramide('a', "arriba", 3));
        System.out.println(dibujarPiramide('a', "izquierda", 3));
        //dibujarPiramide('s', "derecha", 3);
    }

}