package ejerciciosJava.MyPractice.practicando.EjerciciosGenerales;

import java.util.ArrayList;

public class Ejercicio4 {

    /*
            Escribe un programa en JAVA que obtenga la suma e imprima los términos de la siguiente serie:
            2, 5, 7, 10, 12, 15, 17, . . ., 1 800

            https://programacionparajava.blogspot.com/p/primeros-programas-en-java-para-novatos.html
    */

    static int numero = 0;
    static int sumadorX2 = 2;
    static int sumadorX3 = 3;
    static ArrayList<Integer> lista1 = new ArrayList<Integer>();

    public static void main(String[] args) {
        ArrayList<Integer> print = Ejercicio4.data();
        System.out.println(print);
    }

    private static ArrayList<Integer> data() {
        int aumentandoX2;
        int aumentandoX3;

        do {
            aumentandoX2 = numero += sumadorX2;
            aumentandoX3 = numero += sumadorX3;

            lista1.add(aumentandoX2);
            lista1.add(aumentandoX3);
        } while (numero < 1800);
        return lista1;
    }
}
