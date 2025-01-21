package ejerciciosJava.MyPractice.practicando.arrays;

import java.util.ArrayList;

public class Ejercicio7 {

    // crear un nuevo array partiendo de los datos de otro cumpliendo una condición

    public static void main(String[] args) {
        ArrayList myList = addingDataToTheArrayList(new int[]{11, 21, 31, 41, 51, 61, 71, 80, 90, 100});
        System.out.println(myList);
    }

    public static ArrayList addingDataToTheArrayList(int[] myData) {
        ArrayList<Integer> adding = new ArrayList<Integer>();
        for (int i = 0; i < myData.length; i++) {
            if (myData[i] > 50) {
                adding.add(myData[i]);
            }
        }
        return adding;
    }
}
