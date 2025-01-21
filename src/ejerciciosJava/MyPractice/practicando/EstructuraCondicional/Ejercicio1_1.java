package ejerciciosJava.MyPractice.practicando.EstructuraCondicional;

import java.io.IOException;

public class Ejercicio1_1 {
    public static void main(String[] args) throws IOException {

        // http://puntocomnoesunlenguaje.blogspot.com/2012/07/java-ejercicios-basicos-condicional-1.html
        // Programa que lea un carácter por teclado y compruebe si es una letra mayúscula

        /*
             Scanner sc = new Scanner(System.in);
             N = sc.nextInt();
        */

        char letra;
        letra = (char) System.in.read();
        System.out.println(letra);

        boolean check = Character.isUpperCase(letra) ? true : false;
        System.out.println(check);
    }
}
