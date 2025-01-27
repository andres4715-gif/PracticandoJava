package ejerciciosJava.MyPractice.practicando.arrays.ejercicio4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MetodosEjercicio4 {

    public static Model metodosDel4(int[] myData) {
        List<Integer> numerosPares = data(myData);
        return new Model(numerosPares);
    }

    private static List<Integer> data(int[] myArray) {
        int sumando = 0;
        int contadorDeNumeros = 0;
        List<Integer> nuevaListaConNumerosPares = new ArrayList<>();

        List<Integer> list = Arrays.stream(myArray)
                .boxed()
                .collect(Collectors.toList());

        for (int numero : list) {
            if (numero % 2 == 0) {
                nuevaListaConNumerosPares.add(numero);
            }
        }

        for (int data : nuevaListaConNumerosPares) {
            sumando += data;
            contadorDeNumeros++;
        }

        System.out.println("la suma de los numeros pares es: " + sumando);
        System.out.println("La cantidad de numeros en le array de los pares es: " + contadorDeNumeros);
        return nuevaListaConNumerosPares;
    }
}
