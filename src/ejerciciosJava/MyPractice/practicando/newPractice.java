package ejerciciosJava.MyPractice.practicando;

public class newPractice {

    public static void main(String[] args) {

            // calling the function with required parameters
            System.out.println("With two arguments: "+Sum(10, 5));
            // calling the function with the java optional parameters
            System.out.println("With three arguments: "+Sum(10, 5,5));
            System.out.println("With four arguments: "+Sum(10, 5,5,5));
        }
        // function with requred parameters
        public static Integer Sum(Integer num1, Integer num2){
            // return the sum of the numbers
            return num1+num2;
        }
        // java overiding method to create optional parameters
        public static Integer Sum(Integer num1, Integer num2, Integer num3){
            // return the sum
            return num1+num2+num3;
        }
        // java overiding method to create optional parameters
        public static Integer Sum(Integer num1, Integer num2, Integer num3, Integer num4){
            // return the sum
            return num1+num2+num3+num4;
        }
    }
