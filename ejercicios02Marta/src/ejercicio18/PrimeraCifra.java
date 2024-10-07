package ejercicio18;

/*Ejercicio 18
Escribe un programa que diga cuál es la primera cifra de un número entero introducido por
teclado. Se permiten números de hasta 5 cifras.*/

public class PrimeraCifra {

    public int calcularPrimeraCifra(String numero) {
       char primerCaracter = numero.charAt(0);
        int primerNumero = Integer.parseInt(String.valueOf(primerCaracter));
       return primerNumero;
    }
}
