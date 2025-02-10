package ejerciciosJava;

import java.util.function.Function;

public class runMain {
    public static void main(String[] args) {
        Function<Integer, Integer> cuadrado = x -> x * x;
        System.out.println(cuadrado.apply(5));  // Salida: 25
    }
}