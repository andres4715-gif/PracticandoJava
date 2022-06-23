package ejerciciosJava.practicando.ExpresionesAlgoritmicas;

public class Ejercicio21 {

    public static void main(String[] args) {

        // Validra esta pagina:
        // https://puntocomnoesunlenguaje.blogspot.com/2018/10/ejercicios-sobre-expresiones.html

        // Sumar el dígito más a la derecha de N al propio valor de N.

        int numero =  45, sumando = numero % 10, total = numero + sumando;
        System.out.println("El numero mas el ultimo numero da un valor de: " + total);
    }
}
