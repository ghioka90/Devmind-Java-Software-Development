package quiz6;

public class main {
    public static void main(String[] args) {
        Person employee = new Employer("Pop", "Dan", 34, 2500, 5);
        Employee employee2 = (Employer)employee;
        employee2.printStatus();

        Employee employee1 = (Employee)employee;
        employee1.printStatus();
    }
}
