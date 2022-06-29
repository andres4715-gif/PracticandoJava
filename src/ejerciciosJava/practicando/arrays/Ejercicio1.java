package ejerciciosJava.practicando.arrays;

public class Ejercicio1 {

    /*
     * Programa que lea por teclado 10 números enteros y los guarde en un array.
     * A continuación calcula y muestra la media de los valores positivos y la  de los valores negativos.
     */

    public static void main(String[] args) {
        Ejercicio1.sumaAndmedia(new int [] {1, 2, 3, 4, 5, -1, -2, -3, -4, -5});
    }

    public static void sumaAndmedia(int[] A) {
        double sumaPos = 0;
        double sumaNeg = 0;
        int pos = 0;
        int neg = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] >= 0) {
                sumaPos += A[i];
                pos++;
            } else {
                sumaNeg += A[i];
                neg++;
            }
        }

        System.out.println("Positivos son: " + sumaPos);
        System.out.println("Negativos son: " + sumaNeg);
        System.out.println("Cantidad positivos son: " + pos);
        System.out.println("Cantidad negativos son: " + neg);

        System.out.println("Media positivos es: " + (sumaPos / pos));
        System.out.println("media negativos es: " + (sumaNeg / neg));
    }
}
