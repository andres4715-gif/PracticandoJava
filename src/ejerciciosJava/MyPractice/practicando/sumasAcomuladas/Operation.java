package ejerciciosJava.MyPractice.practicando.sumasAcomuladas;

public class Operation {

    protected int[] cumulativeSums(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] + nums[i];
        }
        return result;
    }
}
