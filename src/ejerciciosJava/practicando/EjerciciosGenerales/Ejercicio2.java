package ejerciciosJava.practicando.EjerciciosGenerales;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        // http://puntocomnoesunlenguaje.blogspot.com/p/ejercicios.html
        // http://puntocomnoesunlenguaje.blogspot.com/2013/01/contar-numeros-acabados-en-2.html

        /*Programa que lea una serie de números por teclado hasta que se lea un número negativo.
        El programa indicará cuántos números acabados en 2 se han leído.*/


        int A;
        Scanner sc = new Scanner(System.in);

        int contador = 0;
        do {
            System.out.println("Ingrese un numero: ");
            A = sc.nextInt();

            if (A % 10 == 2) {
                contador++;
            }

        } while (A > 0);
        System.out.println("La cantidad de multiplos de 2 fueron: " + contador);
    }
}
