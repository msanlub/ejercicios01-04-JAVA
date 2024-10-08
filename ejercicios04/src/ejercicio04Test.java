
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ejercicio04Test {

    // Test Ejercicio 2
    @Test
    public void testEjercicio2() {
        Ejercicio2 ejercicio2 = new Ejercicio2();
        String carta = ejercicio2.generarCarta();

        // Verificar que la carta no sea nula ni esté vacía
        assertNotNull(carta);
        assertFalse(carta.isEmpty());

        // Verificar que la carta tenga un formato correcto
        assertTrue(carta.matches("([2-9]|10|J|Q|K|A) de (Picas|Corazones|Diamantes|Tréboles)"));
    }


    // Test Ejercicio 14
    @Test
    public void testEjercicio14() {
        boolean[] mayorMenor = {true, false, true, false, true}; // Simula las respuestas del usuario
        Ejercicio14 ejercicio14 = new Ejercicio14();
        int[] intentos = ejercicio14.adivinarNumero(mayorMenor);

        // Verificar que haya exactamente 5 intentos
        assertEquals(5, intentos.length);

        // Verificar que todos los intentos estén dentro del rango de 0 a 100
        for (int intento : intentos) {
            assertTrue(intento >= 0 && intento <= 100);
        }
    }
}