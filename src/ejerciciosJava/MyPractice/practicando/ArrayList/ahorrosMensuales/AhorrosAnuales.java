package ejerciciosJava.MyPractice.practicando.ArrayList.ahorrosMensuales;

public class AhorrosAnuales {

    private final double totalAhorrado;
    private final double valorMayorAhorro;
    private final String mesMayorAhorro;
    private final String mesMenorAhorro;
    private final double montoMenorAhorro;
    private final double promedioAhorro;

    public AhorrosAnuales(double totalAhorrado, double valorMayorAhorro, String mesMayorAhorro, String mesMenorAhorro, double montoMenorAhorro, double promedioAhorro) {
        this.totalAhorrado = totalAhorrado;
        this.valorMayorAhorro = valorMayorAhorro;
        this.mesMayorAhorro = mesMayorAhorro;
        this.mesMenorAhorro = mesMenorAhorro;
        this.montoMenorAhorro = montoMenorAhorro;
        this.promedioAhorro = promedioAhorro;
    }

    public double getTotalAhorrado() {
        return totalAhorrado;
    }

    public double getValorMayorAhorro() {
        return valorMayorAhorro;
    }

    public String getMesMayorAhorro() {
        return mesMayorAhorro;
    }

    public String getMesMenorAhorro() {
        return mesMenorAhorro;
    }

    public double getMontoMenorAhorro() {
        return montoMenorAhorro;
    }

    public double getPromedioAhorro() {
        return promedioAhorro;
    }
}
