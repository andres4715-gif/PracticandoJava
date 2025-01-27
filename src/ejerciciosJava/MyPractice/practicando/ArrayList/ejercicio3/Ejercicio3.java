package ejerciciosJava.MyPractice.practicando.ArrayList.ejercicio3;

import java.util.List;

public class Ejercicio3 {

    public static ListaDeNumeros metodosLista(List<Integer> finalData) {
       List<Integer> myFinalList = organizarLista(finalData);
        return new ListaDeNumeros(myFinalList);
    }

    private static List<Integer> organizarLista(List<Integer> myData) {
        int hi = myData.get(myData.size() - 1);
        myData.remove(myData.size() - 1);
        myData.add(0, hi);
        return myData;
    }
}
