import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

import ejercicio2.Saludo;
import ejercicio4.CalculadorSalario;
import ejercicio18.PrimeraCifra;


public class ejercicio02Test {

    // Ejercicio 2
    @ParameterizedTest
    @CsvSource({
            "6, Buenos días",
            "12, Buenos días",
            "13, Buenas tardes",
            "20, Buenas tardes",
            "21, Buenas noches",
            "5, Buenas noches",
            "24, Buenas noches",  // Considerando 24 como fuera de rango
            "-1, Buenas noches"   // Considerando hora negativa como fuera de rango
    })
    void testSaludo(int hora, String expectedSaludo) {
        Saludo saludo = new Saludo();
        assertEquals(expectedSaludo, saludo.saludo(hora));
    }

    //Ejercicio 4
    @ParameterizedTest
    @CsvSource({
            "35, 420",  // 35 horas a 12€/hora
            "40, 480",  // 40 horas a 12€/hora
            "45, 560"   // 40 horas a 12€/hora + 5 horas extra a 16€/hora
    })
    void testCalcularSalarioSemanal(int horas, int expectedSalario) {
        CalculadorSalario calculador = new CalculadorSalario();
        assertEquals(expectedSalario, calculador.calcularSalario(horas));
    }

    //ejercicio 18
    @ParameterizedTest
    @CsvSource({
            "12345, 1",  // La primera cifra de 12345 es 1
            "67890, 6",  // La primera cifra de 67890 es 6
            "9, 9",      // La primera cifra de 9 es 9
            "4567, 4",   // La primera cifra de 4567 es 4
            "10000, 1"   // La primera cifra de 10000 es 1
    })
    void testObtenerPrimeraCifra(String numero, int expectedPrimeraCifra) {
        PrimeraCifra primeraCifra = new PrimeraCifra();
        assertEquals(expectedPrimeraCifra, primeraCifra.calcularPrimeraCifra(numero));
    }
}




