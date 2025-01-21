package ejerciciosJava.MyPractice.practicando.ExpresionesAlgoritmicas;

public class Ejercicio7 {

    public static void main(String[] args) {

        // Validra esta pagina:
        // https://puntocomnoesunlenguaje.blogspot.com/2018/10/ejercicios-sobre-expresiones.html

        // La suma de la última cifra de los números enteros N y M

        int N = 123;
        int M = 456;

        int ultimoN = N % 10;
        int ultimoM = M % 10;

        int total = (ultimoN + ultimoM);
        System.out.println(total);
    }
}
