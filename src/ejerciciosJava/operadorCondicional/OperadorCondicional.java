package ejerciciosJava.operadorCondicional;

public class OperadorCondicional {
    public static void main(String[] args) {

        int A = 10;
/*        if (A % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }*/

        System.out.println(A + (A % 2 == 0 ? " Es entero" : " No es entero"));
    }
}
