package ejerciciosJava.MyPractice.practicando.ArrayList.ejercicio0;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {

        List<Double> ahorrosMensuales = new ArrayList<>();
        ahorrosMensuales.add(100000.0);  // Enero
        ahorrosMensuales.add(600000.0);  // Febrero
        ahorrosMensuales.add(200000.0);  // Marzo
        ahorrosMensuales.add(120000.0);  // Abril
        ahorrosMensuales.add(180000.0);  // Mayo
        ahorrosMensuales.add(90000.0);   // Junio
        ahorrosMensuales.add(300000.0);  // Julio
        ahorrosMensuales.add(80000.0);   // Agosto
        ahorrosMensuales.add(250000.0);  // Septiembre
        ahorrosMensuales.add(170000.0);  // Octubre
        ahorrosMensuales.add(210000.0);  // Noviembre
        ahorrosMensuales.add(140000.0);  // Diciembre

        AhorrosAnuales ahorros = MetodosAhorros.ahorrosAnuales(ahorrosMensuales);
        System.out.println(ahorros.getTotalAhorrado());
    }
}