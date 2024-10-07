package ejercicio2y3;

public class ConversorMonedas {

    static double cambio = 166.386;

    public static double eurosAPesetas(double euros) {
        return cambio * euros;
    }

    public static double pesetasAEuros(double pesetas) {
        return pesetas / cambio;
    }
}
