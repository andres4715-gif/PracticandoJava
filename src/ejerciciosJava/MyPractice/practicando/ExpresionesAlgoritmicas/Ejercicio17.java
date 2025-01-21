package ejerciciosJava.MyPractice.practicando.ExpresionesAlgoritmicas;

public class Ejercicio17 {

    public static void main(String[] args) {

        // Validra esta pagina:
        // https://puntocomnoesunlenguaje.blogspot.com/2018/10/ejercicios-sobre-expresiones.html

        // Comprobar si el contenido de la variable precio es igual o mayor que 10€ y menor que 50€

        int precio = 10;
        boolean checking = precio >= 10 && precio < 50 ? true : false;
        System.out.println("el precio es mayor o igual a 10 y menor que 50?: " + checking);
    }
}
