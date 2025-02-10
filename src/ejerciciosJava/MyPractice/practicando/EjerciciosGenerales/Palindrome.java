package ejerciciosJava.MyPractice.practicando.EjerciciosGenerales;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Palindrome {

    public static void main(String[] args) {
        String palindrome = "anaana";
        List<String> ini = new ArrayList<>();
        List<String> end = new ArrayList<>();

        List<String> myList = new ArrayList<String>(Arrays.asList(palindrome.split("")));
        int middle = myList.size() / 2;

        for (int i = 0; i < middle; i++) {
            ini.add(myList.get(i));
        }

        for (int e = myList.size() - 1; e >= middle; e--) {
            end.add(myList.get(e));
        }

        if(ini.equals(end)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        System.out.println(ini);
        System.out.println(end);
    }
}
