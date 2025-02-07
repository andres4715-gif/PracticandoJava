package ejerciciosJava.MyPractice.practicando.EjerciciosGenerales;

public class NearToZero {
    public static int findClosestToZero(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int closestToZero = Integer.MAX_VALUE;
        int closestToZeroPositive = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i]) < Math.abs(closestToZero)) {
                closestToZero = arr[i];
            }

            if (arr[i] > 0 && arr[i] < closestToZeroPositive) {
                closestToZeroPositive = arr[i];
            }
        }

        System.out.println("el numero mas pequeño del array es: " + closestToZero);

        if (closestToZero < 0 && closestToZeroPositive != Integer.MAX_VALUE) {
            return closestToZeroPositive;
        } else if(closestToZero < 0 && closestToZeroPositive == Integer.MAX_VALUE) {
            closestToZeroPositive = closestToZero;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] > 0) {
                    closestToZeroPositive = Math.min(arr[i], closestToZeroPositive);
                }
            }
            return closestToZeroPositive;
        } else {
            return closestToZero;
        }
    }
}



