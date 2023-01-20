package MyPractice.practicing;

public class stringPassword1 {
    public static void main(String[] args) {
        // String completePassword = customPassword("MYTEST", "", "", "@!");  //TF1-489
        String completePassword = customPassword("M", "ytf1test", "", "!");  //TF1-491
        System.out.println(completePassword);
    }

    public static String customPassword(String uppercase, String lowercase, String numbers, String specialCharacters) {
        String[] customizedPassword = {uppercase,lowercase, numbers, specialCharacters};
        String createdPassword = String.join("", customizedPassword);
        return createdPassword;
    }
}
