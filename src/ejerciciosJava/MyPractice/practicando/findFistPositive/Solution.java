package ejerciciosJava.MyPractice.practicando.findFistPositive;

import java.util.HashSet;

public class Solution {

    public static int solution(int[] data) {
        HashSet<Integer> hashSet = new HashSet<>();
        int min = 1;
        for (int i : data) {
            if (i > 0) {
                hashSet.add(i);
            }
        }
        System.out.println("the set is: " + hashSet);
        while (hashSet.contains(min)) {
            min++;
        }
        System.out.println(min);
        return min;
    }
}
