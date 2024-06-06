package ejerciciosJava.MyPractice.codility.agileEngine;

import java.util.HashSet;

public class Hashset {

    // Lo primero que hay que saber es que hashset no es un array es una lista
    // new practice.

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 6, 6, 2};

        HashSet<Integer> hashSetValues = new HashSet<>();
        HashSet<Integer> newHashSetData = new HashSet<Integer>();
        System.out.println(newHashSetData);

        for(int data : numbers) {
            if(data > 5) {
                hashSetValues.add(data);
            }
        }
        System.out.println(hashSetValues);
    }
}
