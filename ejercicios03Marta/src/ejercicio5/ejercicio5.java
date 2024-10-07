package ejercicio5;

import java.util.List;

public class ejercicio5 {
    public static void main(String[] args) {
        ContadorHaciaAtras contador = new ContadorHaciaAtras();
        List<Integer> numerosImprimidos = contador.numeros();

        for (int numero : numerosImprimidos) {
            System.out.println(numero);
        }
    }
}
