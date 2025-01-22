package ejerciciosJava.MyPractice.practicando.ArrayList.ejercicio8;

import java.util.ArrayList;
import java.util.List;

public class Metodos {

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

    public static void cochesModernos(ArrayList<Coche> myCoche, int year) {
        List<Coche> filterCar = myCoche.stream()
                .filter(coche -> coche.getModel() > year)
                .toList();

        System.out.println("===========================================");
        // Imprimir los resultados
        filterCar.forEach(coche -> System.out.println(
                "ID: " + coche.getId() +
                        ", Marca: " + coche.getMarca() +
                        ", Kilómetros: " + coche.getKilometros() +
                        ", Modelo: " + coche.getModel() +
                        ", Color: " + coche.getColor()
        ));
    }
}
