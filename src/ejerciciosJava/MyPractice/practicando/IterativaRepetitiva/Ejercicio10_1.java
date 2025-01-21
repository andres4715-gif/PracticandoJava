package ejerciciosJava.MyPractice.practicando.IterativaRepetitiva;

public class Ejercicio10_1 {

    public static void main(String[] args) {
        // link: http://puntocomnoesunlenguaje.blogspot.com/p/ejercicios.html
        // link2: http://puntocomnoesunlenguaje.blogspot.com/2012/10/estructura-repetitiva-en-java-1.html

         /*
            Programa Java que lea dos números y muestre los números pares entre ellos
         */

        int A = 0, B = 10;

        for (int i = 0; i <= B; i++) {
            if (A < B && i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

