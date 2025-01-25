package ejerciciosJava.MyPractice.practicando.ArrayList.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {

    protected static List<Integer> data() {
        List<Integer> myDataList = new ArrayList<Integer>();
        myDataList.add(123);
        myDataList.add(12);
        myDataList.add(13);
        myDataList.add(100);

        return myDataList;
    }

    protected static int amount(List<Integer> data) {
        int checkAmount = data.size();
        return checkAmount;
    }

    protected static int sumaData(List<Integer> data) {
        int checkSuma = 0;
        for (int sumando : data) {
            checkSuma += sumando;
        }
        return checkSuma;
    }

    protected static double media(List<Integer> data) {
        double operation = 0;
        double media = 0;
        for (Integer sumando : data) {
            media += sumando;
            operation = media / data.size();
        }
        return operation;
    }

    protected static List<Integer> mayoresDelPromedio(List<Integer> data) {
        List<Integer> mayores = new ArrayList<Integer>();
        double operation = 0;
        for (int check : data) {
            if (check > operation) {
                mayores.add(check);
            }
        }
        return mayores;
    }

    protected static List<Integer> menoresDelPromedio(List<Integer> data) {
        List<Integer> menores = new ArrayList<Integer>();
        double operation = 0;
        for (int check : data) {
            if (check < operation) {
                menores.add(check);
            }
        }
        return menores;
    }
}
