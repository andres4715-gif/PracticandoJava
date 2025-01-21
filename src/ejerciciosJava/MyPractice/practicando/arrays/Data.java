package ejerciciosJava.MyPractice.practicando.arrays;

public class Data {

    public static void sumaAndMedia(int[] A) {
        double sumaPos = 0;
        double sumaNeg = 0;
        int pos = 0;
        int neg = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] >= 1 ) {
                sumaPos += A[i];
                pos++;
            } else if (A[i] < 0 ){
                sumaNeg += A[i];
                neg++;
            }
        }

        System.out.println("Positivos son: " + sumaPos);
        System.out.println("Negativos son: " + sumaNeg);
        System.out.println("Cantidad positivos son: " + pos);
        System.out.println("Cantidad negativos son: " + neg);

        System.out.println("Media positivos es: " + (sumaPos / pos));
        System.out.println("media negativos es: " + (sumaNeg / neg));
    }

    public static int[] data() {
        int contador = -5;
        int[] todaLaData = new int[11];
        for (int i = 0; i < todaLaData.length; i++) {
            todaLaData[i] = contador;
            contador++;
        }
        return todaLaData;
    }
}
