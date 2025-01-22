package ejerciciosJava.MyPractice.practicando.ArrayList.ejercicio1;

public class EstadisticasAltura {
    private final double alturaMedia;
    private final int cantidadMasAltos;
    private final int cantidadMasBajos;

    public EstadisticasAltura(double alturaMedia, int cantidadMasAltos, int cantidadMasBajos) {
        this.alturaMedia = alturaMedia;
        this.cantidadMasAltos = cantidadMasAltos;
        this.cantidadMasBajos = cantidadMasBajos;
    }

    public double getAlturaMedia() {
        return alturaMedia;
    }

    public int getCantidadMasAltos() {
        return cantidadMasAltos;
    }

    public int getCantidadMasBajos() {
        return cantidadMasBajos;
    }
}
