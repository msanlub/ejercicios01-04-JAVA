

import ejercicio5.ContadorHaciaAtras;
import ejercicio15.Potencias;
import ejercicio19.Piramide;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ejercicio03Test {

    // Test Ejercicio 5
    @Test
    public void testEjercicio5() {
        List<Integer> esperados = Arrays.asList(320, 300, 280, 260, 240, 220, 200, 180, 160);
        ContadorHaciaAtras contador = new ContadorHaciaAtras();

        List<Integer> resultado = contador.numeros();
        assertEquals(esperados, resultado);
    }

    // Test Ejercicio 15
    @Test
    public void testEjercicio15() {
        List<Double> esperados = Arrays.asList(2.0, 4.0, 8.0, 16.0, 32.0);
        Potencias potencias = new Potencias();

        assertEquals(esperados, potencias.calcularPotencias(2, 5));
    }


    /*//Test ejercicio 19
    @Test
    public void testPintarPiramide() {
        Piramide piramide = new Piramide();


        String esperado =
                        "    *" +
                        "   ***" +
                        "  *****" +
                        " *******" +
                        "*********";

        assertEquals(esperado, piramide.pintarPiramide(5));
    }*/

}




