package ejerciciosJava.MyPractice.practicando.ArrayList;

/*
        Programa Java que pida por teclado las alturas de N alumnos de una clase y las guarde en un ArrayList de tipo Double.
        A continuación el programa calculará la altura media de todos los alumnos, cuantos alumnos
        hay más altos que la media y cuantos más bajos.

        http://puntocomnoesunlenguaje.blogspot.com/2016/02/ejemplo-de-arraylist-en-java.html
*/

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {

    static double dataAltura = 0;
    static int contadorMasAltosDeLaMedia = 0;
    static int contadorMasBajosDeLaMedia = 0;

    public static void main(String[] args) {
        ArrayList<Double> data = (ArrayList<Double>) myList();
        double media = alturaMedia(data);
        System.out.println("La altura media de los " + media);
        int masAltos = Ejercicio1.calcularCantidadAlumnosMasAltosDeLaMedia(data, media);
        System.out.println("La cantidad de alumnos mas altos de la media: " + masAltos);
        int masBajos = Ejercicio1.calcularCantidadAlumnosMasBajosDeLaMedia(data, media);
        System.out.println("La cantidad de alumnos mas bajos de la media: " + masBajos);
    }

    private static List<Double> myList() {
        List<Double> alturas = new ArrayList<>();
        alturas.add(174.7);
        alturas.add(173.5);
        alturas.add(176.3);
        alturas.add(172.3);
        return alturas;
    }

    private static double alturaMedia(ArrayList<Double> alturas) {
        for (Double sumarAltura : alturas) {
            dataAltura += sumarAltura;
        }
        return (dataAltura / alturas.size());
    }

    private static int calcularCantidadAlumnosMasAltosDeLaMedia(ArrayList<Double> alturas, double media) {
        for (Double sumarAltura : alturas) {
            if (sumarAltura > media) {
                contadorMasAltosDeLaMedia++;
            }
        }
        return contadorMasAltosDeLaMedia;
    }

    private static int calcularCantidadAlumnosMasBajosDeLaMedia(ArrayList<Double> alturas, double media) {
        for (Double sumarAltura : alturas) {
            if (sumarAltura < media) {
                contadorMasBajosDeLaMedia++;
            }
        }
        return contadorMasBajosDeLaMedia;
    }
}
