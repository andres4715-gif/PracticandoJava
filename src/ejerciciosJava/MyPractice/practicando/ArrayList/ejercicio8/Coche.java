package ejerciciosJava.MyPractice.practicando.ArrayList.ejercicio8;

public class Coche {
    private int id;
    private String marca;
    private double kilometros;
    private int model;
    private String color;

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
