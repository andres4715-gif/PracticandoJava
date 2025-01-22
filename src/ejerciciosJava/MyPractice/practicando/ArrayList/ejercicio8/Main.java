package ejerciciosJava.MyPractice.practicando.ArrayList.ejercicio8;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Coche> obj = new ArrayList<Coche>();
        obj.add(new Coche("Chevrolet", 87888, 2000));
        obj.add(new Coche("Mazda", 125000, 2010));
        obj.add(new Coche("Renault", 189000, 2015));
        obj.add(new Coche("Fiat", 345000, 2017));
        obj.add(new Coche("Tesla", 78878, 2025));

        // Obtener una lista de las marcas de carros:
        ArrayList<String> marcaDeCoches = new ArrayList<String>();
        for (Coche coches : obj) {
            marcaDeCoches.add(coches.getMarca());
        }
        System.out.println("Las marcas de los coches son: " + marcaDeCoches);

        // Obtener una lista de modelos (años) de los carros:
        List<Integer> modelosCarros = new ArrayList<>();
        for(Coche model : obj) {
            modelosCarros.add(model.getModel());
        }
        System.out.println("Los modelos de los carros en stock son: " + modelosCarros);

        // Utilizando los metodos generados
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
