package PregatireExam;

public class FamilyCar extends SportCar{
  @Override
  public String theCarQuote() {
    return "Get in time anywhere! Now with your family too..";
  }
  
  public static void main(String[] args) {
    FamilyCar fsc = new FamilyCar(); // Line 1
    System.out.println(fsc.theCarQuote());
    SportCar sCar = new SportCar();
    System.out.println(sCar.theCarQuote());
  }
}