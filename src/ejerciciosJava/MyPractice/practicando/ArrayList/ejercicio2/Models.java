package ejerciciosJava.MyPractice.practicando.ArrayList.ejercicio2;

import java.util.List;

public class Models {
    private final List<Integer> data;
    private final int amount;
    private final int sumaData;
    private final double media;
    private final List<Integer> mayoresDelPromedio;
    private final List<Integer> menoresDelPromedio;


    public Models(List<Integer> data, int amount, int sumaData, double media, List<Integer> mayoresDelPromedio, List<Integer> menoresDelPromedio) {
        this.data = data;
        this.amount = amount;
        this.sumaData = sumaData;
        this.media = media;
        this.mayoresDelPromedio = mayoresDelPromedio;
        this.menoresDelPromedio = menoresDelPromedio;
    }

    public List<Integer> getData() {
        return data;
    }

    public int getAmount() {
        return amount;
    }

    public int getSumaData() {
        return sumaData;
    }

    public double getMedia() {
        return media;
    }

    public List<Integer> getMayoresDelPromedio() {
        return mayoresDelPromedio;
    }

    public List<Integer> getMenoresDelPromedio() {
        return menoresDelPromedio;
    }
}
