package ejerciciosJava.MyPractice.practicando.ArrayList.ejercicio8;

/*
            En esta entrada vamos a escribir un programa Java que crea un ArrayList de Objetos de tipo Coche.
            El programa pide por teclado los datos de los coches y los guarda en el array.
            A continuación utilizará el ArrayList para mostrar por pantalla lo siguiente:
            Todos los coches introducidos.
            Todos los coches de una marca determinada.
            Todos los coches con menos de un número determinado de Kilómetros.
            El coche con mayor número de Kilómetros.

            http://puntocomnoesunlenguaje.blogspot.com/2013/02/arraylist-de-objetos-en-java.html
*/

import java.util.ArrayList;

public class Ejercicio8 {

    public static void main(String[] args) {
        ArrayList<Coche> obj = new ArrayList<Coche>();
        obj.add(new Coche("Chevrolet", 87888));
        obj.add(new Coche("Mazda", 125000));
        obj.add(new Coche("Renault", 189000));
        obj.add(new Coche("Fiat", 345000));
        obj.add(new Coche("Tesla", 78878));

        ArrayList<String> marcaDeCoches = new ArrayList<String>();
        for (Coche coches : obj) {
            marcaDeCoches.add(coches.getMarca());
        }
        System.out.println("Las marcas de los coches son: " + marcaDeCoches);

        ArrayList<String> cochesConMenosKilometrajeDefinido = cochesConKilometrajeMenor200000(obj, 200000);
        ArrayList<String> cochesConMayorKilometrajeDefinido = cochesConKilometrajeMayor200000(obj, 200000);

        System.out.println("Los coches con Menor kilimetrage definido son: " + cochesConMenosKilometrajeDefinido);
        System.out.println("Los coches con Mayor kilimetrage definido son: " + cochesConMayorKilometrajeDefinido);
    }

    public static ArrayList<String> cochesConKilometrajeMenor200000(ArrayList<Coche> myCoche, double dataKilometraje) {
        ArrayList<String> determinadoKilometraje = new ArrayList<String>();

        for (Coche data : myCoche) {
            if (data.getKilometros() < dataKilometraje) {
                determinadoKilometraje.add(data.getMarca());
            }
        }
        return determinadoKilometraje;
    }

    public static ArrayList<String> cochesConKilometrajeMayor200000(ArrayList<Coche> myCoche, double dataKilometraje) {
        ArrayList<String> determinadoKilometraje = new ArrayList<String>();

        for (Coche data : myCoche) {
            if (data.getKilometros() > dataKilometraje) {
                determinadoKilometraje.add(data.getMarca());
            }
        }
        return determinadoKilometraje;
    }
}
