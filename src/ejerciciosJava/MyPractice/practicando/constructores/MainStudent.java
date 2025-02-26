package ejerciciosJava.MyPractice.practicando.constructores;

import java.util.ArrayList;
import java.util.List;

public class MainStudent {

  public static void main(String[] args) {
    List<String> articles = new ArrayList<>(List.of("keys", "Radio", "Wallet", "Watch", "Guns"));
//    List<String> articles = new ArrayList<>(List.of("keys", "Radio", "Wallet", "Watch"));

    Student student = new Student(234, "Andres", "Rios", 40, articles);

    // Data
    System.out.println("🚀 --- id: " + student.id());
    System.out.println("🚀 --- Name: " + student.name());
    System.out.println("🚀 --- LastName: " + student.lastName());
    System.out.println("🚀 --- Age: " + student.age());
    System.out.println("🚀 --- Articles: " + student.getArticles());

    // Methods
    System.out.println("============= Methods =============");
    System.out.println("🚀 --- Access: " + student.accessTest(18));
  }
}
