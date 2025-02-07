package ejerciciosJava.MyPractice.practicando.ArrayList.stringMayorLongitud;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Metodos {

    public static Model ejercicio4Metodos(List<String> myData) {
        List<String> finalData = validatingData(myData);
        return new Model(finalData);
    }

    private static List<String> validatingData(List<String> myData) {
        List<Integer> amountData = new ArrayList<Integer>();
        List<String> ifEquals = new ArrayList<String>();

        for (String getData : myData) {
            amountData.add(getData.length());

            Integer maxValue = amountData
                    .stream()
                    .max(Comparator.naturalOrder())
                    .get();

            if (getData.length() == maxValue) {
                ifEquals.add(getData);
            }
        }
        return ifEquals;
    }
}
