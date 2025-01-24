package ejerciciosJava.MyPractice.practicando.ArrayList.ejercicio0;

import java.util.List;

public class MetodosAhorros {

    // TODO hacer esto con un enum
    // Nombres de los meses
    final String[] NOMBRES_MESES = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
    };

    public static AhorrosAnuales ahorrosAnuales(List<Double> ahorroMes) {
        double myTotalAhorrado = totalAhorrado(ahorroMes);
        return new AhorrosAnuales(myTotalAhorrado);
    }

    private static double totalAhorrado(List<Double> ahorroMes) {
        double myAhorroTotal = 0;
        for (Double ahorro : ahorroMes) {
            myAhorroTotal += ahorro;
        }
        return myAhorroTotal;
    }
}
