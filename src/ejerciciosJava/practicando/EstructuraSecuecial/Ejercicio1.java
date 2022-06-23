package ejerciciosJava.practicando.EstructuraSecuecial;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        // link: http://puntocomnoesunlenguaje.blogspot.com/2012/06/java-ejercicios-basicos-resueltos-1.html
        // Programa Java que lea dos números enteros por teclado y los muestre por pantalla.

        /*
            Scanner sc = new Scanner(System.in);
            n1 = sc.nextInt();
        */

        int numero1, numero2;
        System.out.println("Ingresa un numero:");
        Scanner sc = new Scanner(System.in);
        numero1 = sc.nextInt();
        System.out.println("Ingresa otro numero:");
        numero2 = sc.nextInt();
        System.out.println("El primer numero ingresado fue: " + numero1);
        System.out.println("El segundo numero ingresado fue: " + numero2);
    }
}
