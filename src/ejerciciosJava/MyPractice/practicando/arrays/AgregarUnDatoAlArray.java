package ejerciciosJava.MyPractice.practicando.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AgregarUnDatoAlArray {

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4};

        nums = myData(nums, 5);    // suma 5 a `nums[]`
        System.out.println(Arrays.toString(nums));
    }

    private static Integer[] myData(Integer[] arr, int element) {
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        list.add(element);

        return list.toArray(new Integer[0]);
    }
}
