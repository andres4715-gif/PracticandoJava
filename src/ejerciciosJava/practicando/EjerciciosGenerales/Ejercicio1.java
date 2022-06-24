package ejerciciosJava.practicando.EjerciciosGenerales;

public class Ejercicio1 {

    public static void main(String[] args) {

        // http://puntocomnoesunlenguaje.blogspot.com/p/ejercicios.html
        // http://puntocomnoesunlenguaje.blogspot.com/2012/12/java-swap-de-variables.html

        // Mostrar la tabla de multiplicar de un número en Java

        int referencia = 7;
        System.out.println("Tabla del " + referencia);
        for(int i = 0; i <=10; i++) {
            System.out.println(referencia + " x " + i + " = " + (referencia * i));
        }
    }
}
