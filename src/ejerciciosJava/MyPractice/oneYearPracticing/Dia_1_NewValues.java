package ejerciciosJava.MyPractice.oneYearPracticing;

public class Dia_1_NewValues {

    public static void main(String[] args) {
        int numero1 = 35;
        int numero2 = 20;
        int auxiliar;

        System.out.println("-------------Antes-------------");
        System.out.println("numero 1: " + numero1);
        System.out.println("numero 2: " + numero2);

        auxiliar = numero2;
        numero2 = numero1;
        numero1 = auxiliar;

        System.out.println("-------------Despues-------------");
        System.out.println("numero 1: " + numero1);
        System.out.println("numero 2: " + numero2);
    }
}
