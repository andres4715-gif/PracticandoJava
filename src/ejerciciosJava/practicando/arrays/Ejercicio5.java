package ejerciciosJava.practicando.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio5 {

    /*
        Programa Java que guarda en un array 13 números enteros que se leen por teclado. A continuación se recorre el array
        y calcula cuántos números son positivos, cuántos negativos y cuántos ceros.

        http://puntocomnoesunlenguaje.blogspot.com/2013/01/java-ejercicios-arrays-resueltos.html
    */

    static int cantidadNumerosPositivos = 0;
    static int cantidadNumerosNegativos = 0;
    static int cantidadDeCeros = 0;

    public static void main(String[] args) {
        ArrayList<Integer> listaNumerosEnterosPositivos = new ArrayList<Integer>();
        ArrayList<Integer> listaNumerosEnterosNegativos = new ArrayList<Integer>();
        int[] data = {10, 20, 30, 40, 80, -10, -20, -30, -40, -90, 0, 0, 0};
        List<Integer> list = Arrays.stream(data)
                .boxed()
                .collect(Collectors.toList());
        for (int num : list) {
            if (num == 0) {
                cantidadDeCeros++;
            }
            if (num % 2 == 0 && num > 0) {
                listaNumerosEnterosPositivos.add(num);
                cantidadNumerosPositivos++;
            } else {
                if ((num < 0)) {
                    listaNumerosEnterosNegativos.add(num);
                    cantidadNumerosNegativos++;
                }
            }
        }
        System.out.println("positivos: " + cantidadNumerosPositivos);
        System.out.println("Negativos: " + cantidadNumerosNegativos);
        System.out.println("ceros: " + cantidadDeCeros);
    }
}
