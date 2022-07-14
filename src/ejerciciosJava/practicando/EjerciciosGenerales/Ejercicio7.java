package ejerciciosJava.practicando.EjerciciosGenerales;

public class Ejercicio7 {

    /*
         PROGRAMA QUE IMPRIMA LAS 10 TABLAS DE MULTIPLICAR
    */

    public static void main(String[] args) {
        int multiplicador = 1;

        do {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + " X " + multiplicador + " = " + (i * multiplicador));
            }
            System.out.println("\n");
            multiplicador++;
        } while (multiplicador <= 10);
    }
}
