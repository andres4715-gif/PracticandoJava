package ejerciciosJava.MyPractice.practicando.arrays;

public class Ejercicio2 extends Data {

    /*
        Programa Java que lea 10 números enteros por teclado y los guarde en un array. Calcula y muestra la media de los números que estén en las posiciones pares del array.
        Considera la primera posición del array (posición 0) como par.
        // http://puntocomnoesunlenguaje.blogspot.com/2012/07/arreglos-en-java-calcular-media.html

     */
    public static void main(String[] args) {

        int sumaPares = 0, sumaImpares = 0, contPares = 0, contImpares = 0;
        int mediaPares, mediaImpares;

        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int num : array) {
            if (num % 2 == 0) {
                sumaPares += num;
                contPares++;
            } else {
                sumaImpares += num;
                contImpares++;
            }
        }
        mediaPares = (sumaPares / contPares);
        mediaImpares = (sumaImpares / contImpares);
        System.out.println("La media de los pares es: " + mediaPares);
        System.out.println("La media de los impares es: " + mediaImpares);
    }
}

