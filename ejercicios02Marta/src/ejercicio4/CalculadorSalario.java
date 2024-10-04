package ejercicio4;

/*Ejercicio 4
Vamos a ampliar uno de los ejercicios de la relación anterior para considerar las horas extras.
Escribe un programa que calcule el salario semanal de un trabajador teniendo en cuenta que las
horas ordinarias (40 primeras horas de trabajo) se pagan a 12 euros la hora. A partir de la hora 41,
se pagan a 16 euros la hora
*/

public class CalculadorSalario {

    final int precioHora = 12;
    final int precioHoraExtra = 16;
    int horasSemana = 40;

    public int calcularSalario(int horas) {
        if (horas >= 41) {
            int horaExtra = horas - horasSemana;
            int precioExtra = horaExtra * precioHoraExtra;
            int precioHoraNormal = horasSemana * precioHora;
            return precioExtra + precioHoraNormal;
        } else {
            return horas * precioHora;
        }
    }
}
