package ejerciciosJava.MyPractice.practicando.creandoListas;

import java.util.ArrayList;
import java.util.List;

public class ArrayToList {

    public static List<Integer> data = new ArrayList<>();

    public static List<Integer> arrayToList(int [] numbers) {
        for (int x : numbers) {
            data.add(x);
        }
        return data;
    }
}
