package ejerciciosJava.MyPractice.operadorCondicional;

public class OperadorCondicional3 {
    public static void main(String[] args) {

        if(checkingTrue()) {
            System.out.println("Valor entero: " + checkingTrue());
        } else {
            System.out.println("Valor entero: " + checkingTrue());
        }
    }

    public static boolean checkingTrue() {
        int A = 11;
        boolean b = A % 2 == 0 ? true : false;
        return b;
    }
}
