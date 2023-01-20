package MyPractice.entrevistas.POO.ejercicio1.vehiculo;

import static MyPractice.entrevistas.POO.ejercicio1.vehiculo.Carro.imprimir;

public class Main extends Moto {

    public Main(int n1, int n2) {
        super(n1, n2);
    }

    public static void main(String[] args) {
        imprimir(6, 6);
        imprimir(7, 7);
        imprimir(5, 5);


        Moto moto1 = new Moto(5, 5);
        int hola = moto1.getN1();

        System.out.println(hola);
        System.out.println(moto1.imprimirMoto());
    }
}
