package ejerciciosJava.MyPractice.practicando.sumasAcomuladas;

public class Main {
    public static void main(String[] args) {
        AcumuladorDeSumas acumuladorDeSumas = new AcumuladorDeSumas();

        int[] original = {2, 4, 6, 8, 10, 12};
        for (int n : acumuladorDeSumas.cumulativeSums(original)) {
            System.out.print(n + " ");
        }

        acumuladorDeSumas.printing();
    }
}
