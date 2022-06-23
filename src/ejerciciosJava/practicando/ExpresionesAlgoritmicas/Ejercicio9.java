package ejerciciosJava.practicando.ExpresionesAlgoritmicas;

public class Ejercicio9 {

    public static void main(String[] args) {

        // Validra esta pagina:
        // https://puntocomnoesunlenguaje.blogspot.com/2018/10/ejercicios-sobre-expresiones.html

        // Comprobar si la última cifra de un número entero N es par

        int numeroEntero = 23456;
        int ultimoNumero = numeroEntero % 10;
        boolean check = ultimoNumero % 2 == 0;

        boolean b = check ? true : false;
        System.out.println("El numero " + ultimoNumero + " es par?: " + b);
    }
}
