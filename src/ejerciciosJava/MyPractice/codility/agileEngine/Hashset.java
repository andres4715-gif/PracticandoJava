package ejerciciosJava.MyPractice.codility.agileEngine;

import java.util.HashSet;

public class Hashset {

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 6, 6, 2};

        HashSet<Integer> hashSet = new HashSet<>();
        for(int data : A) {
            if(data > 5) {
                hashSet.add(data);
            }
        }
        System.out.println(hashSet);
    }
}
