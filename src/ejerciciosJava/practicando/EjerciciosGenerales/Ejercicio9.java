package ejerciciosJava.practicando.EjerciciosGenerales;

public class Ejercicio9 {

    /*
            Progama que indique el total a pagar en una farmacia si el total apagar es:
             0 a 500  0% de descuento
             501 a 1000 5%
             1001 a 7000 11%
             7001 a 15000 18%
             150001 en adelante 25%
    */

    public static void main(String[] args) {
        double valorProducto = 501;

        if (valorProducto <= 500) {
            System.out.println(valorProducto);
        } else if (valorProducto > 500 && valorProducto <= 1000) {
            System.out.println((valorProducto - (valorProducto * 5 / 100)));
        } else if (valorProducto > 1000 && valorProducto <= 7000) {
            System.out.println((valorProducto - (valorProducto * 11 / 100)));
        } else if (valorProducto > 7000 && valorProducto <= 15000) {
            System.out.println((valorProducto - (valorProducto * 18 / 100)));
        } else if (valorProducto > 15000) {
            System.out.println((valorProducto - (valorProducto * 25 / 100)));
        }
    }
}
