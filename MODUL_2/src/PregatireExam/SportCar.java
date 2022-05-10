package PregatireExam;

public class SportCar extends Car{
  private int nrSeats;

  // Constructor 1
  public SportCar(double weight, int maxSpeed, String vin, int nrSeats) {
    super(weight, maxSpeed, vin);
    this.nrSeats = nrSeats;
  }

  // Constructor 2
  public SportCar() {
    this.nrSeats = -1;
  }

 }
