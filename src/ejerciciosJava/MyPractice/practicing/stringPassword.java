package ejerciciosJava.MyPractice.practicing;

public class stringPassword {

    public static void main(String[] args) {
        System.out.println(">>>>>>" + password("MTEST", "@!"));
        System.out.println(">>>>>>" + password("MTEST", "@!", "345"));
    }





    // function with requred parameters
    public static String password(String mayusculas, String specialCharacters){
        String uniendo = (mayusculas + specialCharacters);
        return uniendo;
    }

    public static String password(String mayusculas, String specialCharacters, String numeros){
        String uniendo = (mayusculas + specialCharacters + numeros);
        return uniendo;
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
