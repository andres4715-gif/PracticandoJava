package ejerciciosJava.MyPractice.practicando.IterativaRepetitiva;

public class Ejercicio2 {

    public static void main(String[] args) {
        // link: http://puntocomnoesunlenguaje.blogspot.com/p/ejercicios.html
        // link2: http://puntocomnoesunlenguaje.blogspot.com/2012/10/estructura-repetitiva-en-java-1.html

        /*
            Se trata de mostrar los números desde el 1 hasta el 100 utilizando las
            instrucciones repetitivas while, do while y for.
         */

        // do while
        int numero = 0;
        do {
            System.out.println(numero);
            numero++;
        } while (numero <= 100);
    }
}
