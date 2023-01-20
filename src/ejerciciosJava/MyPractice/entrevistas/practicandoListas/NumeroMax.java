package ejerciciosJava.MyPractice.entrevistas.practicandoListas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class NumeroMax {

    public static void main(String[] args) {
        List<Integer> list = myList();
        int max = list.stream()
                .max(Comparator.comparing(Integer::valueOf)).get();

        System.out.println(max);
    }

    public static List<Integer> myList() {
        List<Integer> positivos = new ArrayList<Integer>();
        List<Integer> list = Arrays.asList(-5, -56, 1, 2, 3, 4);

        for(int data : list) {
            if(data > 0) {
                positivos.add(data);


            }
        }

        System.out.println(positivos);
        return positivos;
    }


}
