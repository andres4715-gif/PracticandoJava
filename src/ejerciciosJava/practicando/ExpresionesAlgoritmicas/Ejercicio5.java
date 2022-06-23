package ejerciciosJava.practicando.ExpresionesAlgoritmicas;

public class Ejercicio5 {

    public static void main(String[] args) {

        // Validra esta pagina:
        // https://puntocomnoesunlenguaje.blogspot.com/2018/10/ejercicios-sobre-expresiones.html

        // La mitad de la última cifra de un número entero A

        int A = 348;
        int numero = A % 10;
        int mitadUltimoNumero = numero / 2;

        System.out.println("la mitad del ultimo numero del entero es: " + mitadUltimoNumero);
    }
}
