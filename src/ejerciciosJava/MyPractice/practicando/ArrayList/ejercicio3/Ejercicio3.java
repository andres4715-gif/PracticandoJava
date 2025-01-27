package ejerciciosJava.MyPractice.practicando.ArrayList.ejercicio3;

import java.util.List;

public class Ejercicio3 {

    protected static List<Integer> data(List<Integer> myData) {
        int hi = myData.get(myData.size() - 1);
        myData.remove(myData.size() - 1);
        myData.add(0, hi);
        System.out.println(myData);
        return myData;
    }
}
