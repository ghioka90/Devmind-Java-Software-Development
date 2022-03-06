package Curs11Polimorfism;

public class Car {
    public Car(){
    }
    public void carDetailes(){
        System.out.println("I am a generic car!");
    }

    public void carSpecifications(double power){
        System.out.println("The power of the car is: " + power +" hp.");
    }

    public void carSpecifications(int km){
        System.out.println("The car has: " + km +" km.");
    }

    public void carSpecifications(String color){
        System.out.println("The color of the car is: " + color);
    }

    public static void main(String[] args) {
    }
}
