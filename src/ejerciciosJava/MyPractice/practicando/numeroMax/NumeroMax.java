package ejerciciosJava.MyPractice.practicando.numeroMax;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumeroMax {

    public static List<Integer> myList() {
        List<Integer> data = Arrays.asList(-4, -6, 1, 3, 4, 5, 6, 7, 898);
        List<Integer> positivos = new ArrayList<>();
        for (int key : data) {
            if (key > 0) {
                positivos.add(key);
            }
        }
        return positivos;
    }
}
