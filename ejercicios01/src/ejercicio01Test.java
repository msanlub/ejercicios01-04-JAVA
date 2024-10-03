import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import ejercicio1y4.Calculadora;
import ejercicio2y3.ConversorMonedas;
import ejercicio5y6y9.Areas;
import ejercicio7.FacturaSinIva;
import ejercicio8.SalarioSemanal;
import ejercicio10y11.ConversorBytes;
import ejercicio13.CalculadoraNotas;


public class ejercicio01Test {

    @Test
    public void testMultiplicar() {
        assertEquals(20, Calculadora.multiplicacion(4, 5), 0.001);
    }

    @Test
    public void testEurosAPesetas() {
        assertEquals(16638.6, ConversorMonedas.eurosAPesetas(100), 0.1);
    }

    @Test
    public void testPesetasAEuros() {
        assertEquals(60.10, ConversorMonedas.pesetasAEuros(10000), 0.01);
    }

    @Test
    public void testCalculadoraSuma() {
        double resultado = Calculadora.suma(10, 5);
        assertEquals(15, resultado, 0.001);
    }

    @Test
    public void testCalculadoraResta() {
        double resultado = Calculadora.resta(10, 5);
        assertEquals(5, resultado, 0.001);
    }
    @Test
    public void testCalculadoraMultiplicacion() {
        double resultado = Calculadora.multiplicacion(10, 5);
        assertEquals(50, resultado, 0.001);
    }

    @Test
    public void testCalculadoraDivision() {
        double resultado = Calculadora.division(10, 5);
        assertEquals(2, resultado, 0.001);
    }

    @Test
    public void testAreaRectangulo() {
        assertEquals(20, Areas.areaRectangulo(4, 5), 0.001);
    }

    @Test
    public void testAreaTriangulo() {
        assertEquals(10, Areas.areaTriangulo(4, 5), 0.001);
    }

    @Test
    public void testCalcularTotalFactura() {
        assertEquals(79, FacturaSinIva.calcularFactura(100), 0.001);
    }

    @Test
    public void testCalcularSalarioSemanal() {
        assertEquals(480, SalarioSemanal.calcularSalario(40), 0.001);
    }

    @Test
    public void testVolumenCono() {
        assertEquals(20.944, Areas.volumenCono(2, 5), 0.001);
    }

    @Test
    public void testMbAKb() {
        assertEquals(1024, ConversorBytes.megabytesAKilobytes(1), 0.001);
    }

    @Test
    public void testKbAMb() {
        assertEquals(1, ConversorBytes.kilobytesAMegabytes(1024), 0.001);
    }

    @Test
    public void testCalcularNotaNecesaria() {
        assertEquals(9.5, CalculadoraNotas.segundaNota(7, 8.5F), 0.01);
    }
}
