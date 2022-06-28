package ejerciciosJava.practicando.hashSet;

import java.util.HashSet;

public class hashsetEjercicio1 {

    public static void main(String[] args) {

        // create a hashset
        HashSet hs = new HashSet();
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
