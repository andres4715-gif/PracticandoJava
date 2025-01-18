package ejerciciosJava.MyPractice.entrevistas.ejerciciosDePractica;

public class hola {

    public static void main(String[] args) {
        int[] original = {2, 4, 6, 8, 10, 12};
        for (int n : sumasAcumuladas(original)) {
            System.out.print(n + " ");
        }
    }

    public static int[] sumasAcumuladas(int[] nums) {
        int[] resultado = new int[nums.length];
        resultado[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            resultado[i] = resultado[i - 1] + nums[i];
        }
        return resultado;
    }
}
