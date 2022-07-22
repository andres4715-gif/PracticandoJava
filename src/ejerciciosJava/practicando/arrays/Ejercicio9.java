package ejerciciosJava.practicando.arrays;

public class Ejercicio9 {
    // Crea un array de 10 posiciones de números .
    // Muestra por consola el indice y el valor al que corresponde

    public static void main(String[] args) {

        int[] data = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        for (int i = 0; i < data.length; i++) {
            System.out.println((i + 1) + " = " + data[i]);
        }
    }
}
