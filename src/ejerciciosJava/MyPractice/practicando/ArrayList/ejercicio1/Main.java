package ejerciciosJava.MyPractice.practicando.ArrayList.ejercicio1;

/*
        Programa Java que pida por teclado las alturas de N alumnos de una clase y las guarde en un ArrayList de tipo Double.
        A continuación el programa calculará la altura media de todos los alumnos, cuantos alumnos
        hay más altos que la media y cuantos más bajos.
        http://puntocomnoesunlenguaje.blogspot.com/2016/02/ejemplo-de-arraylist-en-java.html
*/

import java.util.ArrayList;
import java.util.List;

public class Main extends Metodos{
    public static void main(String[] args) {
        List<Double> alturas = new ArrayList<>();
            alturas.add(174.7);
            alturas.add(173.5);
            alturas.add(176.3);
            alturas.add(172.3);

        double media = alturaMedia(alturas);

        int masAltos = calcularCantidadAlumnosMasAltosDeLaMedia(alturas, media);
        int masBajos = calcularCantidadAlumnosMasBajosDeLaMedia(alturas, media);

        System.out.println("La altura media de los " + media);
        System.out.println("La cantidad de alumnos mas altos de la media: " + masAltos);
        System.out.println("La cantidad de alumnos mas bajos de la media: " + masBajos);
    }
}
