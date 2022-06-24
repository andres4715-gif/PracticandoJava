package ejerciciosJava.practicando.EstructuraCondicional;

import java.io.IOException;

public class Ejercicio2 {
    public static void main(String[] args) throws IOException {

        // http://puntocomnoesunlenguaje.blogspot.com/2012/07/java-ejercicios-basicos-condicional-1.html
        // Programa que lea un número entero y muestre si el número es múltiplo de 10.

        /*
             Scanner sc = new Scanner(System.in);
             N = sc.nextInt();
        */

        int numero = 10;
        boolean check = numero % 10 == 0;
        boolean b = check ? true : false;
        System.out.println(b);
    }
}
