package ejerciciosJava.MyPractice.practicando.example1;

import java.util.List;
import java.util.stream.Collectors;

public class Operations {

    public static List<String> myData(List<String> data, String word) {
        return data.stream()
                .filter(name -> name.contains(word))
                .collect(Collectors.toList());
    }
}
