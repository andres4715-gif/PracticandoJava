package ejerciciosJava.MyPractice.practicando.arrays;

import java.util.ArrayList;
import java.util.List;

public class NuevaListPartiendoDeUnaInicial {

    // crear un nuevo array partiendo de los datos de otro cumpliendo una condición

    public static void main(String[] args) {
        List myList = addingDataToTheArrayList(new ArrayList<>(List.of(11, 21, 31, 41, 51, 61, 71, 80, 90, 100)));
        System.out.println(myList);
    }

    public static ArrayList addingDataToTheArrayList(List<Integer> data) {
        ArrayList<Integer> adding = new ArrayList<Integer>();
        for (int myData : data) {
            if (myData > 50) {
                adding.add(myData);
            }
        }
        return adding;
    }
}
