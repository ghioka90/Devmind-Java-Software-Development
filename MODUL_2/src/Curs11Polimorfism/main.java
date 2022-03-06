package Curs11Polimorfism;

public class main {
    public static void main(String[] args) {
        Car newCar1 = new Car();
        Sedan newCar2 = new Sedan();
        SUV newCar3 = new SUV();

        newCar1.carDetailes();
        newCar2.carDetailes();
        newCar3.carDetailes();

        newCar1.carSpecifications(12000);
        newCar1.carSpecifications("red");
        newCar1.carSpecifications(115.50);
    }
}
