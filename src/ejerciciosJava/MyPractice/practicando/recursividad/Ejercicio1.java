package ejerciciosJava.MyPractice.practicando.recursividad;

public class Ejercicio1 {

    public static void main(String[] args) {
        hola(1);
    }

    public static void hola(int contador) {
        if (contador <= 5) {
            System.out.print(contador + " ");
            hola(contador + 1);
        }
    }
}
