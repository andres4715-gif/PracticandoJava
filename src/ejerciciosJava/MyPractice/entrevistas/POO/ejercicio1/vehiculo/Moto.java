package MyPractice.entrevistas.POO.ejercicio1.vehiculo;

public class Moto {

    private int n1;
    private int n2;

    public Moto(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int getN1() {
        return n1;
    }

    public int getN2() {
        return n2;
    }

    public int imprimirMoto() {
        int suma = this.n1 + this.n2;
        return suma;
    }
}
