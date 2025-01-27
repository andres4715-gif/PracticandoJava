package ejerciciosJava.MyPractice.practicando.ArrayList.ejercicio4;

import java.util.ArrayList;
import java.util.List;

/*
  Programa Java para calcular el String de mayor longitud de todos los contenidos en un ArrayList de String.

  Metodo cadenaMasLarga():este metodo recibe como parámetro el ArrayList de Strings con todas las cadenas leídas
  anteriormente y devuelve el String de mayor longitud.
*/

public class Main {
    public static void main(String[] args) {

        List<String> myData = new ArrayList<String>();
        myData.add("t-shirt");
        myData.add("dress");
        myData.add("socket");
        myData.add("belt");

        Model model = Ejercicio4.ejercicio4Metodos(myData);
        System.out.println(model.getStringMasLargo());
    }
}
