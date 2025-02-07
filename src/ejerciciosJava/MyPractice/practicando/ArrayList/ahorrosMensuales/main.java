package ejerciciosJava.MyPractice.practicando.ArrayList.ahorrosMensuales;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {

        List<Double> ahorrosMensualeslist = new ArrayList<>();
        ahorrosMensualeslist.add(100000.0);  // Enero
        ahorrosMensualeslist.add(600000.0);  // Febrero
        ahorrosMensualeslist.add(200000.0);  // Marzo
        ahorrosMensualeslist.add(120000.0);  // Abril
        ahorrosMensualeslist.add(180000.0);  // Mayo
        ahorrosMensualeslist.add(900000.0);  // Junio
        ahorrosMensualeslist.add(300000.0);  // Julio
        ahorrosMensualeslist.add(80000.0);   // Agosto
        ahorrosMensualeslist.add(250000.0);  // Septiembre
        ahorrosMensualeslist.add(170000.0);  // Octubre
        ahorrosMensualeslist.add(800000.0);  // Noviembre
        ahorrosMensualeslist.add(140000.0);  // Diciembre

        AhorrosAnuales ahorros = MetodosAhorros.ahorrosAnuales(ahorrosMensualeslist);
        System.out.println("--- 🚀 Total ahorrado: " + ahorros.getTotalAhorrado());
        System.out.println("--- 🚀 Mayor valor ahorrado: " + ahorros.getValorMayorAhorro());
        System.out.println("--- 🚀 Mes Mayor valor ahorrado: " + ahorros.getMesMayorAhorro());
        System.out.println("--- 🚀 Mes Menor valor ahorrado: " + ahorros.getMesMenorAhorro());
        System.out.println("--- 🚀 Monto menor ahorro: " + ahorros.getMontoMenorAhorro());
        System.out.println("--- 🚀 Promedio ahorro: " + ahorros.getPromedioAhorro());
    }
}