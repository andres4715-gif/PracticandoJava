package ejerciciosJava.MyPractice.practicando.ArrayList;

/*
        Programa Java para calcular el String de mayor longitud de todos los contenidos en un ArrayList de String.

        Metodo cadenaMasLarga():este metodo recibe como parámetro el ArrayList de Strings con todas las cadenas leídas
        anteriormente y devuelve el String de mayor longitud.
*/

import java.util.ArrayList;
import java.util.Comparator;

public class Ejercicio4 {

    public static void main(String[] args) {
        ArrayList<String> longerString = validatingData();
        System.out.println("The longer string is: " + longerString);
    }

    private static ArrayList<String> data() {
        ArrayList<String> myData = new ArrayList<String>();
        myData.add("t-shirt");
        myData.add("dress");
        myData.add("socket");
        myData.add("belt");
        return myData;
    }

    private static ArrayList<String> validatingData() {
        ArrayList<Integer> amountData = new ArrayList<Integer>();
        ArrayList<String> ifEquals = new ArrayList<String>();
        ArrayList<String> gettingData = data();

        for (String getData : gettingData) {
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
