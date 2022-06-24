package ejerciciosJava.practicando.IterativaRepetitiva;

public class Ejercicio1 {

    public static void main(String[] args) {
        // link: http://puntocomnoesunlenguaje.blogspot.com/p/ejercicios.html
        // link2: http://puntocomnoesunlenguaje.blogspot.com/2012/10/estructura-repetitiva-en-java-1.html

        /*
            Se trata de mostrar los números desde el 1 hasta el 100 utilizando las
            instrucciones repetitivas while, do while y for.
         */

        // for
/*        for(int i = 0; i <= 100 ; i++) {
            System.out.println(i);
        }*/

        // do while
/*        int numero = 0;
        do {
            System.out.println(numero);
            numero++;
        } while (numero <= 100);*/

        // while
        int num = 0;

        while (num <= 100) {
            System.out.println(num);
            num++;
        }
    }
}
