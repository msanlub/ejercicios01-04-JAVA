package ejercicio19;


/*Ejercicio 19
Realiza un programa que pinte una pirámide por pantalla. La altura se debe pedir por teclado. El
carácter con el que se pinta la pirámide también se debe pedir por teclado.
*/

public class Piramide {

    public String pintarPiramide(int altura) {
        for (int i = 1; i <= altura; i++) {
            // Imprimir espacios
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }
            // Imprimir asteriscos
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Nueva línea después de cada fila
            System.out.println();
        }
        return "";
    }
}
