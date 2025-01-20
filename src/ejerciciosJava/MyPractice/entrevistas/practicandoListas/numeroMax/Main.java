package ejerciciosJava.MyPractice.entrevistas.practicandoListas.numeroMax;

import java.util.Comparator;
import java.util.List;

import static ejerciciosJava.MyPractice.entrevistas.practicandoListas.numeroMax.NumeroMax.myList;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = myList();

        int max = list.stream()
                .max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("El numero max de la lista es: " + max);
    }
}
