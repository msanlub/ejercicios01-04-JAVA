package ejercicio2y3;

public class ConversorMonedas {

    double cambio = 166.386;

    public double eurosAPesetas (double euros) {
        return cambio * euros;
    }

    public double pesetasAEuros (double pesetas) {
        return pesetas / cambio;
    }
}
