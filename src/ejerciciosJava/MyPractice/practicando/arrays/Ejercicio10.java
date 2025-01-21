package ejerciciosJava.MyPractice.practicando.arrays;

import java.util.ArrayList;

public class Ejercicio10 {

    // rellenaremos el array con números aleatorios entre 0 y 9,
    // al final muestra por pantalla el valor de cada posición y la suma de todos los valores

    public static void main(String[] args) {

        ArrayList<Integer> myData = new ArrayList<Integer>();
        int suma = 0;

        for (int i = 0; i < 10; i++) {
            int aleatorio = (int) ((Math.random() * 10) + 1);
            myData.add(aleatorio);
            suma = suma + aleatorio;
        }
        System.out.println(myData);
        System.out.println("La suma de todos los numeros es: " + suma);
    }
}