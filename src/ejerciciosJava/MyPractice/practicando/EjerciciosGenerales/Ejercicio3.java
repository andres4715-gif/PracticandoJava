package ejerciciosJava.MyPractice.practicando.EjerciciosGenerales;

public class Ejercicio3 {

    /*      Escribe un programa en JAVA tal que dado como datos 270 números enteros (introducidos por teclado), obtenga
            la suma de los números impares y el promedio de los números pares.

            https://programacionparajava.blogspot.com/p/primeros-programas-en-java-para-novatos.html
    */
    public static void main(String[] args) {

        int suma = 0;
        int sumaEnteros = 0;
        int contador = 0;

        int[] data = {10, 20, 30, 40, 11, 13};

        for (int num : data) {
            if (num % 2 > 0) {
                suma = suma + num;
            }
            if (num % 2 == 0) {
                sumaEnteros += num;
                contador++;
            }
        }
        System.out.println("La suma de los numeros impares es: " + suma);
        System.out.println("la media de los positivos es: " + (sumaEnteros / contador));
    }
}
