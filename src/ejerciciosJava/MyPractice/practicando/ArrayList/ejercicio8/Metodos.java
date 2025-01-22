package ejerciciosJava.MyPractice.practicando.ArrayList.ejercicio8;

import java.util.ArrayList;
import java.util.List;

public class Metodos {

    public static ArrayList<String> cochesConKilometrajeMenor200000(List<Coche> myCoche, double dataKilometraje) {
        ArrayList<String> determinadoKilometraje = new ArrayList<String>();

        for (Coche data : myCoche) {
            if (data.getKilometros() < dataKilometraje) {
                determinadoKilometraje.add(data.getMarca());
            }
        }
        return determinadoKilometraje;
    }

    public static ArrayList<String> cochesConKilometrajeMayor200000(List<Coche> myCoche, double dataKilometraje) {
        ArrayList<String> determinadoKilometraje = new ArrayList<String>();

        for (Coche data : myCoche) {
            if (data.getKilometros() > dataKilometraje) {
                determinadoKilometraje.add(data.getMarca());
            }
        }
        return determinadoKilometraje;
    }

    public static void cochesModernos(List<Coche> myCoche, int year) {
        List<Coche> filterCar = myCoche.stream()
                .filter(coche -> coche.getModel() > year)
                .toList();

        System.out.println("--- ✅ Coches Modernos");
        // Imprimir los resultados
        filterCar.forEach(coche -> System.out.println(
                "ID: " + coche.getId() +
                        ", Marca: " + coche.getMarca() +
                        ", Kilómetros: " + coche.getKilometros() +
                        ", Modelo: " + coche.getModel() +
                        ", Color: " + coche.getColor()
        ));
    }

    // Validar los coches disponibles con modelo mayor al 2015
    public static List<Coche> cochesDisponibles(List<Coche> obj) {
        List<Coche> disponibilidad = obj.stream()
                .filter(coche -> coche.getModel() > 2015)
                .filter(Coche::getDisponibilidad)
                .toList();

        System.out.println("--- ✅ Disponibilidad");
        disponibilidad.forEach(coche -> System.out.println(
                "ID: " + coche.getId() +
                        ", Marca: " + coche.getMarca() +
                        ", Kilómetros: " + coche.getKilometros() +
                        ", Modelo: " + coche.getModel() +
                        ", Color: " + coche.getColor()
        ));
        return disponibilidad;
    }
}
