package PregatireExam;

public class Car {
  private double weight;
  private int maxSpeed;
  private String vin;
  
  public Car(double weight, int maxSpeed, String vin) {
    this.weight = weight;
    this.maxSpeed = maxSpeed;
    this.vin = vin;
  }
  
  public Car(double weight, int maxSpeed) {
    this(weight, maxSpeed, "_INVALID_");
  }

  public Car() {
    this(-1, -1, "_INVALID_");
  }
  
  public String theCarQuote() {
    return "Never drive a generic car!";
  }
}