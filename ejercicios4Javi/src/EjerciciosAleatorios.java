import java.util.ArrayList;
import java.util.Random;

public class EjerciciosAleatorios {
    public static ArrayList<Integer> ejercicio1() {
        var numeros = new ArrayList<Integer>();
        Random aleatorio = new Random();
        for (int i = 0; i < 3; i++) {
            var numero = aleatorio.nextInt(6)+1;
            numeros.add(numero);
        }
        return numeros;
    }

    public static void main(String[] args) {
        System.out.println(ejercicio1());
    }

    public String ejercicio15() {
        String[] notas = {"do", "re", "mi", "fa", "sol", "la", "si"};
        Random aleatorio = new Random();
        int longitudMelodia = 4 * (aleatorio.nextInt(7) + 1);
        var melodia = "";
        var primeraNota = "";
        for (int i = 0; i < longitudMelodia; i++){

            if (i == longitudMelodia - 1){
                melodia += primeraNota+" ";
            }
            else {
            String nota = notas[aleatorio.nextInt(notas.length)];
            melodia += nota + " ";
                if (i == 0) {
                    primeraNota = nota; // Guardar la primera nota
                }
            if ((i + 1) % 4 == 0 && i != longitudMelodia - 1) {
                melodia += "| ";
            }
            }
    }
        melodia += " ||";
        return melodia;
}

}
