package ejerciciosJava.MyPractice.practicando.ExpresionesAlgoritmicas;

public class Ejercicio8 {

    public static void main(String[] args) {

        // Validra esta pagina:
        // https://puntocomnoesunlenguaje.blogspot.com/2018/10/ejercicios-sobre-expresiones.html

        // Comprobar si un número entero N es múltiplo de 2 y de 3

        int numeroImpar = 24;

        String hola = (numeroImpar % 3) == 0 && (numeroImpar % 2) == 0 ? "Es multiplo de 2 y 3" : "No es multiplo";
        System.out.println(hola);
    }
}
