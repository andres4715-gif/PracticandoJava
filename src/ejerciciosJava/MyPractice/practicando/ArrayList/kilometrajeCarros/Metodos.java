package ejerciciosJava.MyPractice.practicando.ArrayList.kilometrajeCarros;

import java.util.ArrayList;
import java.util.List;

public class Metodos {

    protected static List<String> cochesConKilometrajeMenor200000(List<Coche> coches, double kilometros) {
        List<String> determinadoKilometraje = new ArrayList<String>();

        for (Coche data : coches) {
            if (data.getKilometros() < kilometros) {
                determinadoKilometraje.add(data.getMarca());
            }
        }
        return determinadoKilometraje;
    }

    protected static List<String> cochesConKilometrajeMayor200000(List<Coche> myCoche, double dataKilometraje) {
        List<String> determinadoKilometraje = new ArrayList<String>();

        for (Coche data : myCoche) {
            if (data.getKilometros() > dataKilometraje) {
                determinadoKilometraje.add(data.getMarca());
            }
        }
        return determinadoKilometraje;
    }

    protected static void cochesModernos(List<Coche> myCoche, int year) {
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
    protected static List<Coche> cochesDisponibles(List<Coche> objeto) {
        List<Coche> disponibilidad = objeto.stream()
                .filter(coche -> coche.getModel() > 2015)
                .filter(Coche::getDisponibilidad)
                .toList();

        System.out.println("--- ✅ Disponibilidad");
        disponibilidad.forEach(coche -> System.out.println(
                "ID: " + coche.getId() +
                        ", Marca: " + coche.getMarca() +
                        ", Kilómetros: " + coche.getKilometros() +
                        ", Modelo: " + coche.getModel() +
                        ", Color: " + coche.getColor() +
                        ", Disponibilidad: " + coche.getDisponibilidad()
        ));
        return disponibilidad;
    }
}
