import java.util.ArrayList;
import java.util.List;

public class EjerciciosBucles {
    public static List<Integer> ejercicio5() {
        var numero = 320;
        var lista = new ArrayList<Integer>();
        while (numero > 159) {
            lista.add(numero);
            numero-=20;
        }
        return lista;
    }

    public static List<Double> ejercicio15(int numero, int numero1) {
        var lista = new ArrayList<Double>();
        for (int i = 1; i < numero1+1; i++) {
            var total = 1;
            for (int j = 1; j <= i; j++) {
                total *= numero;
            }
            System.out.println(total);
            lista.add((double) total);
        }
        return lista;
    }



    public static List<String> ejercicio19(int numero, char caracter) {
        var triangulo = new ArrayList<String>();
        for (int i = 1; i <= numero; i++) {
            StringBuilder linea = new StringBuilder();
            int espacios = numero - i;
            for (int j = 0; j < espacios; j++) {
                linea.append(" ");
            }

            for (int k = 0; k < (2 * i - 1); k++) {
                linea.append(caracter);
            }

            triangulo.add(linea.toString());
        }

        return triangulo;

    }

    public static void main(String[] args) {
        ejercicio19(3, 'a');
    }

}
