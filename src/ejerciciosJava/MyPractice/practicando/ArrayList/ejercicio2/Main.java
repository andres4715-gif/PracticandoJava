package ejerciciosJava.MyPractice.practicando.ArrayList.ejercicio2;

import java.util.List;

import static ejerciciosJava.MyPractice.practicando.ArrayList.ejercicio2.Ejercicio2.*;

/*
   Programa Java que lea una serie de valores numéricos enteros desde el teclado y los guarde en un ArrayList de tipo Integer.
   A continuación el programa mostrará por pantalla el número de valores que se han leído, su suma y su media.
   Por último se mostrarán todos los valores leídos, indicando cuántos de ellos son mayores que la media.

   http://puntocomnoesunlenguaje.blogspot.com/2016/02/ejercicios-resueltos-con-arraylist-en-java.html
*/

public class Main {
    public static void main(String[] args) {
        List<Integer> check = data();
        System.out.println(check);
        int checkAmount = amount(check);
        System.out.println(checkAmount);
        int sumando = sumaData(check);
        System.out.println("La suma de los numeros es: " + sumando);
        double media = media(check);
        System.out.println("La media de los numeros es: " + media);
        List<Integer> mayoresDeLaMedia = mayoresDelPromedio(check);
        System.out.println("Data mayor que la media: " + mayoresDeLaMedia);
        List<Integer> menoresDeLaMedia = menoresDelPromedio(check);
        System.out.println("Data menor que la media: " + menoresDeLaMedia);
    }
}
