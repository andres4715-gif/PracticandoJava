package ejerciciosJava.practicando.ExpresionesAlgoritmicas;

public class Ejercicio14 {

    public static void main(String[] args) {

        // Validra esta pagina:
        // https://puntocomnoesunlenguaje.blogspot.com/2018/10/ejercicios-sobre-expresiones.html

        // Comprobar si una variable A de tipo carácter no contiene una letra mayúscula

        char letra = '1';
        boolean checkLetra = letra < 'A' || letra > 'Z';
        System.out.println("El caracter es una letra en mayusculas?: "  + checkLetra);

    }
}
