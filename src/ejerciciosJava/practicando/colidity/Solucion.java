package ejerciciosJava.practicando.colidity;

import java.util.HashSet;

public class Solucion {

    public static int[] A = {1, 3, 6, 4, 1, 2};

    public static void main(String[] args) {
        Solucion mi = new Solucion();
        System.out.println(mi.solution(A));
    }

    public int solution(int[] A) {
        HashSet<Integer> nums = new HashSet<Integer>();

        for (int i = 1; i <= A.length + 1; i++) {
            nums.add(i);
        }

        for (int a : A) {
            nums.remove(new Integer(a));
        }
        return nums.iterator().next();
    }
}
