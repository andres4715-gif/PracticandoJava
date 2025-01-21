package ejerciciosJava.MyPractice.practicando.ExpresionesAlgoritmicas;

public class Ejercicio25 {

    public static void main(String[] args) {

        // Validra esta pagina:
        // https://puntocomnoesunlenguaje.blogspot.com/2018/10/ejercicios-sobre-expresiones.html

        // Quitarle a un número entero N de 5 cifras su primera cifra.

        int numero = 12345;
        int nuevoNumero = numero % 10000;
        System.out.println(nuevoNumero);
    }
}
