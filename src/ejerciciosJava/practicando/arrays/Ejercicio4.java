package ejerciciosJava.practicando.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
        desde un array con 10 numeros crear un array nuevo con los numeros pares
 */
public class Ejercicio4 {

    public static void main(String[] args) {

        int sumando = 0;
        int contadorDeNumeros = 0;
        ArrayList<Integer> nuevoArrayConNumerosPares = data(new int[]{10, 20, 30, 40, 50, 41, 43, 57, 89, 97});
        System.out.println(nuevoArrayConNumerosPares);
        for (int data : nuevoArrayConNumerosPares) {
            sumando += data;
            contadorDeNumeros++;
        }

        System.out.println("la suma de los numeros pares es: " + sumando);
        System.out.println("La cantidad de numeros en le array de los pares es: " + contadorDeNumeros);
    }

    private static ArrayList<Integer> data(int[] myArray) {
        ArrayList<Integer> nuevaListaConNumerosPares = new ArrayList<>();
        List<Integer> list = Arrays.stream(myArray).boxed().collect(Collectors.toList());

        for (int numero : list) {
            if (numero % 2 == 0) {
                nuevaListaConNumerosPares.add(numero);
            }
        }
        return nuevaListaConNumerosPares;
    }
}
