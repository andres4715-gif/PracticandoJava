package ejerciciosJava.practicando.ExpresionesAlgoritmicas2;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Validra esta pagina:
        // https://puntocomnoesunlenguaje.blogspot.com/2021/01/ejercicios-sobre-expresiones-algoritmicas-Java-8.html

        // Dado un número N de cuatro cifras, comprobar si la primera cifra(la más a la izquierda) es impar.

        int N = 2234;
        boolean primerNumero = N/1000%2 != 0;
        System.out.println(primerNumero);
    }
}
