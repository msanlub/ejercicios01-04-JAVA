package ejercicio13;

public class CalculadoraNotas {

    public static double segundaNota(float primeraNota, float notaDeseada) {
        return (notaDeseada - (primeraNota * 0.4)) / 0.6;
    }
}
