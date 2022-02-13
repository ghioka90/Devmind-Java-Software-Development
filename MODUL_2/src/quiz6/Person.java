package quiz6;

public class Person {
  
  private String lastName;
  private String firstname;
  private int age;
  
  public Person(String lastName, String firstname, int age) {
    this.lastName = lastName;
    this.firstname = firstname;
    this.age = age;
  }
  
  public void printStatus() {
    System.out.println("Unemployed");
  }
}