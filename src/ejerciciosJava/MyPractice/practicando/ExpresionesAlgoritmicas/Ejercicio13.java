package ejerciciosJava.MyPractice.practicando.ExpresionesAlgoritmicas;

public class Ejercicio13 {

    public static void main(String[] args) {

        // Validra esta pagina:
        // https://puntocomnoesunlenguaje.blogspot.com/2018/10/ejercicios-sobre-expresiones.html

        // Comprobar si una variable A de tipo carácter contiene una letra mayúscula o minúscula

        char letra = '1';
        boolean checkLetra = letra >= 'A' && letra <= 'Z' || letra >= 'a' && letra <= 'z';
        System.out.println("El caracter es mayuscula?: " + checkLetra);

    }
}
