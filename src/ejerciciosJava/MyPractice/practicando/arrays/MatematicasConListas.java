package ejerciciosJava.MyPractice.practicando.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatematicasConListas {

    /*
        Programa Java que guarda en un array 13 números enteros que se leen por teclado. A continuación se recorre el array
        y calcula cuántos números son positivos, cuántos negativos y cuántos ceros.

        http://puntocomnoesunlenguaje.blogspot.com/2013/01/java-ejercicios-arrays-resueltos.html
    */
    public static void main(String[] args) {
        List<Integer>data = new ArrayList<>(List.of(10, 20, 30, 40, 80, -10, -20, -30, -40, -90, -78, 0, 0, 0));

        int cantidadNumerosPositivos = 0;
        int cantidadNumerosNegativos = 0;
        int cantidadDeCeros = 0;

        List<Integer> listaNumerosEnterosPositivos = new ArrayList<Integer>();
        List<Integer> listaNumerosEnterosNegativos = new ArrayList<Integer>();

        for (int num : data) {
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
