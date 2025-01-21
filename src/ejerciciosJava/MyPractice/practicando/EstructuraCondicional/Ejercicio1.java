package ejerciciosJava.MyPractice.practicando.EstructuraCondicional;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        // http://puntocomnoesunlenguaje.blogspot.com/2012/07/java-ejercicios-basicos-condicional-1.html
        // Programa Java que lea un número entero por teclado y calcule si es par o impar.

        /*
             Scanner sc = new Scanner(System.in);
             N = sc.nextInt();
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int numero = sc.nextInt();

        boolean check = numero % 2 == 0;
        System.out.println(check);
    }
}
