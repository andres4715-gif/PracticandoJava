package ejerciciosJava.MyPractice.practicando.ArrayList.ejercicio1;

import java.util.List;

public class Metodos {

    static double dataAltura = 0;
    static int contadorMasAltosDeLaMedia = 0;
    static int contadorMasBajosDeLaMedia = 0;

    protected static double alturaMedia(List<Double> alturas) {
        for (Double sumarAltura : alturas) {
            dataAltura += sumarAltura;
        }
        return (dataAltura / alturas.size());
    }

    protected static int calcularCantidadAlumnosMasAltosDeLaMedia(List<Double> alturas, double media) {
        for (Double sumarAltura : alturas) {
            if (sumarAltura > media) {
                contadorMasAltosDeLaMedia++;
            }
        }
        return contadorMasAltosDeLaMedia;
    }

    protected static int calcularCantidadAlumnosMasBajosDeLaMedia(List<Double> alturas, double media) {
        for (Double sumarAltura : alturas) {
            if (sumarAltura < media) {
                contadorMasBajosDeLaMedia++;
            }
        }
        return contadorMasBajosDeLaMedia;
    }
}
