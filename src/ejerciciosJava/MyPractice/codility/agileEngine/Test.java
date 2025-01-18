package ejerciciosJava.MyPractice.codility.agileEngine;

public class Test {

    // Obtener el primer digito de un numero he imprimirlo en consola.
    public static void main(String[] args) {
        int numero = 34;
        System.out.println("El numero es: " + numero);
        String firstCharacter = String.valueOf((String.valueOf(numero).charAt(0))); // En este momento el dato es el string
        System.out.println("🚀 El dato en un: " + firstCharacter.getClass().getSimpleName());
        int finalNumber = Integer.parseInt(firstCharacter);
        System.out.println(finalNumber);
    }
}
