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
        ArrayList<String> marca = new ArrayList<String>();
        obj.add(new Coche("Chevrolet", 234000));
        obj.add(new Coche("Mazda", 125000));
        obj.add(new Coche("Renault", 189000));
        obj.add(new Coche("Fiat", 345000));

        ArrayList<String> cochesConMenosKilometrajeDefinido = Ejercicio8.cochesConKilometrajeMenor(obj, 200000);
        ArrayList<String> cochesConMayorKilometrajeDefinido = Ejercicio8.cochesConKilometrajeMayor(obj, 200000);

        for (Coche coches : obj) {
            marca.add(coches.getMarca());
        }
        System.out.println("Las marcas de los coches son: " + marca);
        System.out.println("Los coches con Menor kilimetrage definido son: " + cochesConMenosKilometrajeDefinido);
        System.out.println("Los coches con Mayor kilimetrage definido son: " + cochesConMayorKilometrajeDefinido);
    }

    private static ArrayList<String> cochesConKilometrajeMenor(ArrayList<Coche> myCoche, double dataKilometraje) {
        ArrayList<String> determinadoKilometraje = new ArrayList<String>();

        for (Coche data : myCoche) {
            if (data.getKilometros() < dataKilometraje) {
                determinadoKilometraje.add(data.getMarca());
            }
        }
        return determinadoKilometraje;
    }

    private static ArrayList<String> cochesConKilometrajeMayor(ArrayList<Coche> myCoche, double dataKilometraje) {
        ArrayList<String> determinadoKilometraje = new ArrayList<String>();

        for (Coche data : myCoche) {
            if (data.getKilometros() > dataKilometraje) {
                determinadoKilometraje.add(data.getMarca());
            }
        }
        return determinadoKilometraje;
    }
}
