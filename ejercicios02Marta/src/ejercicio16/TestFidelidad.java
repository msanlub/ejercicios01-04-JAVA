package ejercicio16;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;


/*Ejercicio 16
Realiza un programa que nos diga si hay probabilidad de que nuestra pareja nos está siendo infiel. El programa irá haciendo preguntas que el usuario contestará con verdadero o falso. Cada
pregunta contestada como verdadero sumará 3 puntos. Las preguntas contestadas con falso no
suman puntos. Utili- za el fichero test_infidelidad.txt para obtener las preguntas y las conclusiones
del programa.
*/

public class TestFidelidad {
    int puntos = 0;

    public void realizarTest(String nombreArchivo) {
        // Obtener el archivo como recurso del paquete
        InputStream is = getClass().getResourceAsStream(nombreArchivo);

        if (is == null) {
            System.out.println("Error: No se encontró el archivo " + nombreArchivo);
            return;
        }

        // Leer el archivo y procesar las preguntas
        try (Scanner lectorArchivo = new Scanner(is)) {
            Scanner input = new Scanner(System.in);

            System.out.println("Test de Infidelidad\n");

            // Leer el archivo línea por línea
            while (lectorArchivo.hasNextLine()) {
                String linea = lectorArchivo.nextLine();

                // Verificar si hemos llegado a las conclusiones
                if (linea.startsWith("Si obtienes")) {
                    break; // Terminamos de leer las preguntas
                }

                // Mostrar la pregunta y pedir respuesta
                if (!linea.trim().isEmpty()) { // Ignorar líneas vacías
                    System.out.println(linea); // Mostrar la pregunta

                    // Obtener respuesta del usuario
                    System.out.println("Responde con 'verdadero' o 'falso':");
                    String respuesta = input.nextLine().toLowerCase();

                    // Validar respuesta y sumar puntos
                    if (respuesta.equals("verdadero")) {
                        this.puntos += 3;
                    }
                }
            }

            // Mostrar el resultado final
            System.out.println("\nHas obtenido un total de " + puntos + " puntos.");
            mostrarResultado(lectorArchivo); // Mostrar las conclusiones

        } catch (Exception e) {
            System.out.println("Error al procesar el archivo.");
            e.printStackTrace();
        }
    }
    private void mostrarResultado(Scanner lectorArchivo) {
        // Leer las conclusiones y mostrarlas según los puntos obtenidos
        while (lectorArchivo.hasNextLine()) {
            String conclusion = lectorArchivo.nextLine();
            System.out.println(conclusion);
        }

        if (puntos >= 0 && puntos <= 10) {
            System.out.println("¡Enhorabuena! parece que todo va bien.");
        } else if (puntos >= 11 && puntos <= 22) {
            System.out.println("Quizás deberías hablar más con tu pareja.");
        } else if (puntos > 23) {
            System.out.println("Hay muchas probabilidades de que tu pareja te esté siendo infiel.");
        }
    }
}

