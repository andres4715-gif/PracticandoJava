package ejerciciosJava.MyPractice.practicando.arrays.ejercicio2;

public class Ejercicio2 {

    public static Model model(int[] array) {
        int totalSumaPares = sumaPares(array);
        int totalSumaImpares = sumaImpares(array);
        int totalMediaPares = mediaPares(array);
        int totalMediaImpares = mediaImpares(array);
        return new Model(totalSumaPares, totalSumaImpares, totalMediaPares, totalMediaImpares);
    }

    private static int sumaPares(int[] array) {
        int sumaPares1 = 0;

        for (int data : array) {
            if (data % 2 == 0) {
                sumaPares1 += data;
            }
        }
        return (sumaPares1);
    }

    private static int sumaImpares(int[] array) {
        int sumaImpares = 0;

        for (int data : array) {
            if (data % 2 != 0) {
                sumaImpares += data;
            }
        }
        return (sumaImpares);
    }

    private static int mediaPares(int[] array) {
        int sumaPares = 0;
        int contadorPares = 0;

        for (int data : array) {
            if (data % 2 == 0) {
                sumaPares += data;
                contadorPares ++;
            }
        }
        return sumaPares / contadorPares;
    }

    private static int mediaImpares(int[] array) {
        int contadorImares = 0;
        int sumaImpares = 0;

        for (int data : array) {
            if (data % 2 != 0) {
                sumaImpares += data;
                contadorImares ++;
            }
        }
        return sumaImpares / contadorImares;
    }
}
