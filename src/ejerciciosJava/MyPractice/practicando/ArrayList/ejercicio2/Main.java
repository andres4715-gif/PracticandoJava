package ejerciciosJava.MyPractice.practicando.ArrayList.ejercicio2;

import java.util.ArrayList;
import java.util.List;

import static ejerciciosJava.MyPractice.practicando.ArrayList.ejercicio2.Ejercicio2.*;

/*
   Programa Java que lea una serie de valores numéricos enteros desde el teclado y los guarde en un ArrayList de tipo Integer.
   A continuación el programa mostrará por pantalla el número de valores que se han leído, su suma y su media.
   Por último se mostrarán todos los valores leídos, indicando cuántos de ellos son mayores que la media.

   http://puntocomnoesunlenguaje.blogspot.com/2016/02/ejercicios-resueltos-con-arraylist-en-java.html
*/

public class Main {
    public static void main(String[] args) {
        List<Integer> myDataList = new ArrayList<Integer>();
        myDataList.add(123);
        myDataList.add(12);
        myDataList.add(13);
        myDataList.add(100);

        Models models = Ejercicio2.calculandoDatos(myDataList);
        System.out.println(models.getData());
        System.out.println(models.getAmount());
        System.out.println("La suma de los numeros es: " + models.getSumaData());
        System.out.println("La media de los numeros es: " + models.getMedia());
        System.out.println("Data mayor que la media: " + models.getMayoresDelPromedio());
        System.out.println("Data menor que la media: " + models.getMenoresDelPromedio());
    }
}
