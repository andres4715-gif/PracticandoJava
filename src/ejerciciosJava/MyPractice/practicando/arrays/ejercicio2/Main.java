package ejerciciosJava.MyPractice.practicando.arrays.ejercicio2;

/*
  Programa Java que lea 10 números enteros por teclado y los guarde en un array. Calcula y muestra la media de los números que estén en las posiciones pares del array.
  Considera la primera posición del array (posición 0) como par.
  http://puntocomnoesunlenguaje.blogspot.com/2012/07/arreglos-en-java-calcular-media.html
*/

public class Main {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        Model model = Ejercicio2.model(array);
        model.getTotalOperaciones();
    }
}
