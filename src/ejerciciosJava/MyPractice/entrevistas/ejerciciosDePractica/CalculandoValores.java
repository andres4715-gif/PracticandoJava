package ejerciciosJava.MyPractice.entrevistas.ejerciciosDePractica;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CalculandoValores {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,3,5,7,9);

        long sumatoriaChicos =  0;
        long sumatoriaGrandes = 0;

        Collections.sort(numbers);

        for(int i = 0; i < numbers.size()-1 ; i++) {
            sumatoriaChicos += numbers.get(i);
        }

        for(int i = numbers.size() - 1; i > 0; i--) {
            sumatoriaGrandes += numbers.get(i);
        }

        System.out.println(sumatoriaChicos + " " + sumatoriaGrandes);
    }
}
