package MyPractice.practicing;

import static MyPractice.practicing.NearToZero.findClosestToZero;

public class Prediktive {

    public static void main(String[] args) {
        int[] temperature = {7, -10, 13, 8, 4, -7, -12, -3, 3, -9 ,-6, -1, -6, 7};

        int numberClosestZero = findClosestToZero(temperature);
        System.out.println(Math.abs(numberClosestZero));
    }
}

    // hacer un codigo en java con lo siguiente, de un array de numeros positivos y negativos llamado myArray encontrar el numero mas cercano a cero pero si hay dos numeros iguales con signo positivo y negativo debo tomar el positivo ademas si el array esta vacio el array debe devolver un cero

