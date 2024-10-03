package ejercicio12;

public class CalculadoraPrecio {

    final double IVAGENERAL = 1.21;
    final double IVAREDUCIDO = 1.1;
    final double IVASUPERREDUCIDO = 1.04;

    final double MENO5 = 5;
    final double CINCOPORC = 0.05;

    public double calcularIVA(String tipoIva, double precio) {
        switch (tipoIva){
            case "general" :
                return IVAGENERAL * precio;
            case "reducido" :
                return IVAREDUCIDO * precio;
            case "superreducido" :
                return IVASUPERREDUCIDO * precio;
            default:
                System.out.println("Tipo de IVA no válido");
                return -1;
        }
    }

    public double calcularPromo(String tipoPromo, double precio) {
        switch (tipoPromo){
            case "5porc" :
                return precio - (CINCOPORC * precio);
            case "meno5" :
                return precio - MENO5;
            case "mitad" :
                return precio / 2;
            default:
                System.out.println("No se aplica promoción.");
                return precio * 1;
        }
    }

}
