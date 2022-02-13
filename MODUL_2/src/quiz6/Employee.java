package quiz6;

public class Employee extends Person {
  private int salary;

  public Employee(String lastName, String firstname, int age, int salary) {
    super(lastName, firstname, age);
    this.salary = salary;
  }

  public void increaseSalary(int amount) {
    this.salary += amount;
  }
  
  public void decreaseSalary(int amount) {
    this.salary -= amount;
  }
  
  @Override
  public void printStatus() {
    System.out.println("Employee");
  }
  
  public void printSalary() {
    System.out.println("Salary is: " + this.salary);
  }
}