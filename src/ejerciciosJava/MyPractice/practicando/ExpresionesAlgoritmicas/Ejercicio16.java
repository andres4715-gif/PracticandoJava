package ejerciciosJava.MyPractice.practicando.ExpresionesAlgoritmicas;

public class Ejercicio16 {

    public static void main(String[] args) {

        // Validra esta pagina:
        // https://puntocomnoesunlenguaje.blogspot.com/2018/10/ejercicios-sobre-expresiones.html

        // Comprobar si el contenido de la variable N termina en 0 ó en 7

        int numero = 7877;
        int ultimoValor = numero % 10;

        boolean checking = ultimoValor == 0 || ultimoValor == 7 ? true : false;
        System.out.println("this number finish on 0 or 7 ?: " + checking);
    }
}
