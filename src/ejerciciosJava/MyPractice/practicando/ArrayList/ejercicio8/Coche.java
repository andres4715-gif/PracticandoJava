package ejerciciosJava.MyPractice.practicando.ArrayList.ejercicio8;

public class Coche {
    private String marca;
    private double kilometros;
    private int model;

    public Coche(String marca, double kilometros, int model) {
        this.marca = marca;
        this.kilometros = kilometros;
        this.model = model;
    }

    public String getMarca() {
        return marca;
    }

    public String setMarca(String marca) {
        return marca;
    }

    public double getKilometros() {
        return kilometros;
    }

    public double setKilometros(double kilometros) {
        return kilometros;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }
}
