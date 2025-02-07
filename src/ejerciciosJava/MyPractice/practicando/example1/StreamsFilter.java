package ejerciciosJava.MyPractice.practicando.example1;

import java.util.Arrays;
import java.util.List;

public class StreamsFilter extends Operations{
    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "John", "Mariam", "Alex", "Alexo", "Monica");
        System.out.println(myData(names, "M"));
    }
}
