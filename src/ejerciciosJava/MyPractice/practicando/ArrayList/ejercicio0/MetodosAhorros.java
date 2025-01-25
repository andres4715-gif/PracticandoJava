package ejerciciosJava.MyPractice.practicando.ArrayList.ejercicio0;

import java.util.Comparator;
import java.util.List;

public class MetodosAhorros {

    // Nombres de los meses
    static final String[] NOMBRES_MESES = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
    };

    public static AhorrosAnuales ahorrosAnuales(List<Double> ahorroMes) {
        double myTotalAhorrado = totalAhorrado(ahorroMes);
        double montoMayorAhorrado = valorMayorAhorro(ahorroMes);
        String mesMayorAhorro = mesMayorAhorro(ahorroMes);
        String mesMenorAhorro = mesMenorAhorro(ahorroMes);
        return new AhorrosAnuales(myTotalAhorrado, montoMayorAhorrado, mesMayorAhorro, mesMenorAhorro);
    }

    private static double totalAhorrado(List<Double> ahorroMes) {
        double myAhorroTotal = 0;
        for (Double ahorro : ahorroMes) {
            myAhorroTotal += ahorro;
        }
        return myAhorroTotal;
    }

    private static double valorMayorAhorro(List<Double> ahorroMes) {
        double max = ahorroMes.stream()
                .max(Comparator.comparing(Double::valueOf)).get();
        return max;
    }

    private static String mesMayorAhorro(List<Double> ahorroMes) {
        double max = ahorroMes.get(0); // Asumimos que el primer elemento es el máximo inicial
        int indiceMax = 0; // Guardamos el índice del máximo
        String mes;

        // Recorremos la lista desde el segundo elemento
        for (int i = 1; i < ahorroMes.size(); i++) {
            if (ahorroMes.get(i) > max) {
                max = ahorroMes.get(i); // Actualizamos el valor máximo
                indiceMax = i; // Actualizamos el índice del máximo
            }
        }
        mes = NOMBRES_MESES[indiceMax];
        return mes;
    }

    private static String mesMenorAhorro(List<Double> ahorroMes) {
        double min = ahorroMes.get(0); // Asumimos que el primer elemento es el minimo inicial
        int indiceMin = 0; // Guardamos el índice del minimo
        String mes;

        // Recorremos la lista desde el segundo elemento
        for (int i = 1; i < ahorroMes.size(); i++) {
            if (ahorroMes.get(i) < min) {
                min = ahorroMes.get(i);
                indiceMin = i;
            }
        }
        mes = NOMBRES_MESES[indiceMin];
        return mes;
    }
}
