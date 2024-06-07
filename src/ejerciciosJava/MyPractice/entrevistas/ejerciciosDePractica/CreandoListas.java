package ejerciciosJava.MyPractice.entrevistas.ejerciciosDePractica;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CreandoListas {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> data = new ArrayList<>();
        for(int myData : numbers) {
            data.add(myData);
        }

        List<Integer> result = data.stream()
                .filter(x -> x > 4)
                .map(x -> x + 100)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
