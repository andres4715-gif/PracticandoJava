package ejerciciosJava.MyPractice.entrevistas.ejerciciosDePractica;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilter {
    public static void main(String[] args) {
        System.out.println(myData());
    }

    public static List<String> myData() {
        List<String> names = Arrays
                .asList("John", "John", "Mariam", "Alex", "Mohammado", "Mohammado", "Vincent", "Alex", "Alex");

        return names.stream()
                .filter(name -> name.contains("o"))
                .collect(Collectors.toList());
    }
}
