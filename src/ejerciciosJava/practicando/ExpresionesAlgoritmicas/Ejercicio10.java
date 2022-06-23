package ejerciciosJava.practicando.ExpresionesAlgoritmicas;

public class Ejercicio10 {

    public static void main(String[] args) {

        // Validra esta pagina:
        // https://puntocomnoesunlenguaje.blogspot.com/2018/10/ejercicios-sobre-expresiones.html

        // Comprobar si la primera cifra de un número entero N de 3 cifras es impar

        int numero = 416;
        boolean primerNumero = numero/100%2 != 0;
        System.out.println("La primeera cifra del numero " + numero + " es impar?:" + primerNumero);

        // Comprobar si la primera cifra de un número entero N de 4 cifras es par

        int numero2 = 4164;
        boolean checkPrimerNumero = numero/1000%2 == 0;
        System.out.println("La primeera cifra del numero " + numero2 + " es par?:" + checkPrimerNumero);
    }
}
