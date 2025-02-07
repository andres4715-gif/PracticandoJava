package ejerciciosJava.MyPractice.practicando.ArrayList.rotalElementosArray;

import java.util.List;

public class MetodosParaRotar {

    public static Models metodosLista(List<Integer> finalData) {
        List<Integer> myFinalList = organizarLista(finalData);

        return new Models(myFinalList); // Se envia lo que solicita el constructor
    }

    private static List<Integer> organizarLista(List<Integer> myData) {
        int num = myData.get(myData.size() - 1);
        myData.remove(myData.size() - 1);
        myData.add(0, num);
        return myData;
    }
}
