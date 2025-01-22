package ejerciciosJava.MyPractice.practicando.ArrayList.ejercicio8;

import java.util.ArrayList;
import java.util.List;

public class Main extends Metodos {

    public static void main(String[] args) {
        List<Coche> obj = new ArrayList<Coche>();
        obj.add(new Coche(895, "Renault", 189000, 2015, "Verde", true));
        obj.add(new Coche(101, "Chevrolet", 87888, 2000, "Blanco", false));
        obj.add(new Coche(340, "Mazda", 125000, 1980, "Gris", true));
        obj.add(new Coche(567, "Fiat", 345000, 1985, "Morado", false));
        obj.add(new Coche(898, "Tesla", 78878, 2025, "Negro", true));
        obj.add(new Coche(941, "BMW", 78889, 2025, "Gris special", true));

        // Obtener una lista de las marcas de carros:
        ArrayList<String> marcaDeCoches = new ArrayList<String>();
        for (Coche myCoche : obj) {
            marcaDeCoches.add(myCoche.getMarca());
        }
        System.out.println("Las marcas de los coches son: " + marcaDeCoches);

        // Obtener una lista de modelos (años) de los carros:
        List<Integer> modelosCarros = new ArrayList<>();
        for (Coche model : obj) {
            modelosCarros.add(model.getModel());
        }
        System.out.println("Los modelos de los carros en stock son: " + modelosCarros);

        // Obtener todos los colores de los coches:
        List<String> colores = new ArrayList<>();
        for (Coche color : obj) {
            colores.add(color.getColor());
        }
        System.out.println("La lista de colores de los carros disponibles es: " + colores);

        // Utilizando los metodos generados
        List<String> cochesConMenosKilometrajeDefinido = cochesConKilometrajeMenor200000(obj, 200000);
        List<String> cochesConMayorKilometrajeDefinido = cochesConKilometrajeMayor200000(obj, 200000);

        System.out.println("Los coches con Menor kilimetrage definido son: " + cochesConMenosKilometrajeDefinido);
        System.out.println("Los coches con Mayor kilimetrage definido son: " + cochesConMayorKilometrajeDefinido);

        // Obteniendo los coches modernos con un año definido como año de carros modernos.
        cochesModernos(obj, 2000);

        // Validar los coches disponibles con modelo mayor al 2015
        cochesDisponibles(obj);
    }
}
