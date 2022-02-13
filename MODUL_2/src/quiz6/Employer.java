package quiz6;

public class Employer extends Employee{
  public Employer(String lastName, String firstname, int age, 
                  int salary, int nrOfEmployees) {
    super(lastName, firstname, age, salary);
    this.nrOfEmployees = nrOfEmployees;
  }

  private int nrOfEmployees;
  
  public void addEmployee() {
    this.nrOfEmployees++;
  }
  
  public void fireEmployee() {
    this.nrOfEmployees--;
  }
  
  @Override
  public void increaseSalary(int amount) {
    // Employer increases salary proportional with the no of employees
    for (int i=0; i<this.nrOfEmployees; i++) {
      super.increaseSalary(amount);
    }
  }
  
  @Override
  public void decreaseSalary(int amount) {
    // Employer decreases salary proportional with the no of employees
    for (int i=0; i<this.nrOfEmployees; i++) {
      super.decreaseSalary(amount);
    }
  }
  
  @Override
  public void printStatus() {
    System.out.println("Manager");
  }
}