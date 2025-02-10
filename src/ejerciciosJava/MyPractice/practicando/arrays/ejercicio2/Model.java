package ejerciciosJava.MyPractice.practicando.arrays.ejercicio2;

public class Model {
    private final int sumaPares;
    private final int sumaImpares;
    private final int madiapares;
    private final int mediaImpares;

    public Model(int sumaPares, int sumaImpares, int madiapares, int mediaImpares) {
        this.sumaPares = sumaPares;
        this.sumaImpares =  sumaImpares;
        this.madiapares = madiapares;
        this.mediaImpares = mediaImpares;
    }

    public int getSumaPares() {
        return sumaPares;
    }

    public int getSumaImpares() {
        return sumaImpares;
    }

    public int getMediaPares() {
        return madiapares;
    }

    public int getMediaImpares() {
        return mediaImpares;
    }
}
