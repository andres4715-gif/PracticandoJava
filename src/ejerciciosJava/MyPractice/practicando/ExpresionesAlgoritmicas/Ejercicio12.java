package ejerciciosJava.MyPractice.practicando.ExpresionesAlgoritmicas;

public class Ejercicio12 {

    public static void main(String[] args) {

        // Validra esta pagina:
        // https://puntocomnoesunlenguaje.blogspot.com/2018/10/ejercicios-sobre-expresiones.html

        // Comprobar si una variable A de tipo carácter contiene una letra mayúscula

        char letra = 'A';
        boolean checkLetra = letra >= 'A' && letra <= 'Z';
        System.out.println("El caracter es mayuscula?: "  + checkLetra);

    }
}
