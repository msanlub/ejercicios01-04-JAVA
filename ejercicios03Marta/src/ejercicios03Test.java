
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ejercicio03Test {

    // Test Ejercicio 4
    @Test
    public void testEjercicio4() {
        Ejercicio4 ejercicio4 = new Ejercicio4();
        List<Integer> esperados = Arrays.asList(320, 300, 280, 260, 240, 220, 200, 180, 160);
        assertEquals(esperados, ejercicio4.contarHaciaAtras());
    }

    // Test Ejercicio 6
    @Test
    public void testEjercicio6() {
        Ejercicio6 ejercicio6 = new Ejercicio6();
        List<Integer> esperados = Arrays.asList(320, 300, 280, 260, 240, 220, 200, 180, 160);
        assertEquals(esperados, ejercicio6.contarHaciaAtras());
    }

    // Test Ejercicio 12
    @Test
    public void testEjercicio12() {
        Ejercicio12 ejercicio12 = new Ejercicio12();
        List<Integer> esperados = Arrays.asList(0, 1, 1, 2, 3, 5);
        assertEquals(esperados, ejercicio12.calcularFibonacci(6));
    }

}




