package ejerciciosJava.MyPractice.practicando.ArrayList.ejercicio8;

public class Coche {
    private final int id;
    private final String marca;
    private final double kilometros;
    private final int model;
    private final String color;

    public Coche(int id, String marca, double kilometros, int model, String color) {
        this.marca = marca;
        this.kilometros = kilometros;
        this.model = model;
        this.color = color;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public double getKilometros() {
        return kilometros;
    }

    public int getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }
}
