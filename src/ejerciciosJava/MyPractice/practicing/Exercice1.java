package MyPractice.practicing;

public class Exercice1 {

    /*
    In this challenge, we test your knowledge of using if-else conditional statements to automate decision-making processes.
    An if-else statement has the following logical flow:
     */

    public static void main(String[] args) {
        int N = 3;

        if(N % 2 == 0 && N > 20) {
            System.out.println("Not Weird");
        } else if (N % 2 == 0 && (N >= 2 && N <= 5)) {
            System.out.println("Not Weird");
        } else if(N % 2 == 0 && (N >= 6 && N <= 20)) {
            System.out.println("Weird");
        } else if(N % 1 == 0) {
            System.out.println("Weird");
        }
    }
}
