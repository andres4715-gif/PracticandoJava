package ejerciciosJava.practicando.hashSet;

import java.util.HashSet;

public class HashsetEjercicio2 {

    public static void main(String[] args) {

        // create a HashSet
        HashSet<String> hs = new HashSet<String>();
        hs.add("Andres");
        hs.add("Andres");
        hs.add("Andres");
        hs.add("Andres");
        hs.add("Stevan");
        hs.add("Camilo");

        for (String checkList : hs) {
            System.out.println(checkList);
        }
    }
}
