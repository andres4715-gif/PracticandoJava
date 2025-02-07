package ejerciciosJava.MyPractice.practicando.ArrayList.alturaAlumnos;

/*
 Programa Java que pida por teclado las alturas de N alumnos de una clase y las guarde en un
 ArrayList de tipo Double.
 A continuación el programa calculará la altura media de todos los alumnos, cuantos alumnos
 hay más altos que la media y cuantos más bajos.
 http://puntocomnoesunlenguaje.blogspot.com/2016/02/ejemplo-de-arraylist-en-java.html
*/

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Double> alturas = new ArrayList<>();
        alturas.add(174.7);
        alturas.add(176.5);
        alturas.add(176.3);
        alturas.add(178.9);

        EstadisticasAltura estadisticas = Metodos.calcularEstadisticas(alturas);

        System.out.println("La altura media de los " + estadisticas.getAlturaMedia());
        System.out.println("La cantidad de alumnos mas altos de la media: " + estadisticas.getCantidadMasAltos());
        System.out.println("La cantidad de alumnos mas bajos de la media: " + estadisticas.getCantidadMasBajos());
    }
}
