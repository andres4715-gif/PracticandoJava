package ejerciciosJava.MyPractice.practicando.EjerciciosGenerales;

import java.util.Scanner;

public class JavaStdinAndStdout_II {

    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int i = scan.nextInt();
            Double d = scan.nextDouble();
            scan.nextLine();
            String s = scan.nextLine();

            System.out.println("String: " + s);
            System.out.println("Double: " + d);
            System.out.println("Int: " + i);
    }
}
