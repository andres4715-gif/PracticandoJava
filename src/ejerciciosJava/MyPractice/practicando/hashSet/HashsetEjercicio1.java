package ejerciciosJava.MyPractice.practicando.hashSet;

import java.util.HashSet;

public class HashsetEjercicio1 {

    public static void main(String[] args) {

        // create a HashSet
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(3);
        hs.add(3);
        hs.add(87);
        hs.add(1);
        hs.add(3);
        hs.add(3);
        hs.add(87);
        hs.add(1);

        System.out.println(hs);
    }
}
