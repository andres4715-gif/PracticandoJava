package ejerciciosJava.MyPractice.practicando.constructores;

import java.util.List;

public class Student {

  private final int id;
  private final String name;
  private final String lastName;
  private final int age;
  private final List<String> articles;

  public Student(int id, String name, String lastName, int age, List<String> articles) {
    this.id = id;
    this.age = age;
    this.name = name;
    this.lastName = lastName;
    this.articles = articles;
  }

  // Getters
  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getLastName() {
    return lastName;
  }

  public int getAge() {
    return age;
  }

  public List<String> getArticles() {
    return articles;
  }

  // Methods
  public int id() {
    return getId();
  }

  public String name() {
    return getName();
  }

  public String lastName() {
    return getLastName();
  }

  public int age() {
    return getAge();
  }

  public boolean legalAge(int legalAge) {
    boolean access;
    access = getAge() > legalAge;
    return access;
  }

  public boolean accessTest(int age) {
    return legalAge(age) && !getArticles().contains("Guns");
  }
}
