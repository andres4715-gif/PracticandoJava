package ejerciciosJava.MyPractice.practicando.creandoListas;

import java.util.List;
import java.util.stream.Collectors;

public class CreandoListas {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        List<Integer> myFinalData = ArrayToList.arrayToList(numbers);
        List<Integer> newData = myFinalData.stream()
                .filter(x -> x > 4)
                .map(x -> x + 200)
                .collect(Collectors.toList());
        System.out.println(newData);
    }
}
