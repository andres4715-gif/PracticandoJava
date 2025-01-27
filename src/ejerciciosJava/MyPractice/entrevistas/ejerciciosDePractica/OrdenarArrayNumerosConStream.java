package ejerciciosJava.MyPractice.entrevistas.ejerciciosDePractica;

import java.util.Arrays;
import java.util.List;

public class OrdenarArrayNumerosConStream {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 5, 3, 7, 9, 898);

        // Organizar con el stream de forma ASC
        List<Integer> newListNumberAsc = numbers.stream()
                .sorted()
                .toList();
        System.out.println(newListNumberAsc);

        // Organizar con el stream de forma DESC
        List<Integer> newListNumberDesc =
                numbers.stream()
                        .sorted((a, b) -> b - a)
                        .toList();
        System.out.println(newListNumberDesc);

    }
}
