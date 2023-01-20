package ejerciciosJava.MyPractice.entrevistas.ejerciciosDePractica;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ejercicio1 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        int value = getValueFromArray(array);
        System.out.println(value);
    }

    public static int getValueFromArray(int[] array) {
        // int val2 = (int) Array.get(array,2);

        int val2 = array[2];

        return val2;



    }
}
