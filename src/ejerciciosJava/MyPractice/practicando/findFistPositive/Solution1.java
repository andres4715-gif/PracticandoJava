package ejerciciosJava.MyPractice.practicando.findFistPositive;

import java.util.HashSet;

public class Solution1 {

    /*
            Dato que el array A tiene N cantidad de enteros, retornar el numero entero positivo que no esta en el array,

            Ejemplos:

            Dado A = [1,3,6,4,1,2] la funcion debe retormar 5
            Dado A = [1,2,3] la funcion debe retornar 4
            Dado A = [-1, -3] la funcion debe retornar 1
     */

    public static void main(String[] args) {
        Solution1 mi = new Solution1();
        System.out.println(mi.solution(new int [] {1, 3, 6, 4, 1, 2}));
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
