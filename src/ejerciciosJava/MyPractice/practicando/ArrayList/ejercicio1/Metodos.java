package ejerciciosJava.MyPractice.practicando.ArrayList.ejercicio1;

import java.util.List;

public class Metodos {

    public static EstadisticasAltura calcularEstadisticas(List<Double> alturas) {
        double alturaMedia = calcularAlturaMedia(alturas);
        int cantidadMasAltos = calcularCantidadAlumnosMasAltosDeLaMedia(alturas, alturaMedia);
        int cantidadMasBajos = calcularCantidadAlumnosMasBajosDeLaMedia(alturas, alturaMedia);

        return new EstadisticasAltura(alturaMedia, cantidadMasAltos, cantidadMasBajos);
    }

    private static double calcularAlturaMedia(List<Double> alturas) {
        double sumaAlturas = 0;
        for (Double altura : alturas) {
            sumaAlturas += altura;
        }
        return (sumaAlturas / alturas.size());
    }

    private static int calcularCantidadAlumnosMasAltosDeLaMedia(List<Double> alturas, double media) {
        int contador = 0;
        for (Double altura : alturas) {
            if (altura > media) {
                contador++;
            }
        }
        return contador;
    }

    private static int calcularCantidadAlumnosMasBajosDeLaMedia(List<Double> alturas, double media) {
        int contador = 0;
        for (Double altura : alturas) {
            if (altura < media) {
                contador++;
            }
        }
        return contador;
    }
}
