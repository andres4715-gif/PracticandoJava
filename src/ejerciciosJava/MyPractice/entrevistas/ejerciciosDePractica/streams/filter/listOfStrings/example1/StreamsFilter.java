package ejerciciosJava.MyPractice.entrevistas.ejerciciosDePractica.streams.filter.listOfStrings.example1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilter extends Operations{
    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "John", "Mariam", "Alex", "Alexo", "Monica");
        System.out.println(myData(names, "m"));
    }
}
