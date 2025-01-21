package ejerciciosJava.MyPractice.practicando.IterativaRepetitiva;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        // link: http://puntocomnoesunlenguaje.blogspot.com/p/ejercicios.html
        // link2: http://puntocomnoesunlenguaje.blogspot.com/2012/10/estructura-repetitiva-en-java-1.html

         /*
            Programa Java que lea dos números y muestre los números pares entre ellos
         */

        int A, B;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Ingrese el primer numero: ");
            A = sc.nextInt();
            System.out.println("Ingrese el segundo numero: ");
            B = sc.nextInt();

            for (int i = A; i <= B; i++) {
                if (A < B && i % 2 == 0) {
                System.out.println(i);
                }
            }
        } while (A >= B);
    }
}
