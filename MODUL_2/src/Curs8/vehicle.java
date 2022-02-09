package Curs8;

public class vehicle {


    String serialNumber;
    int noPersons;
    String name;
    double fuel;
    double positionX;
    double positionY;


    public vehicle (String serialNumber, int noPersons){
        this.serialNumber = serialNumber;
        this.noPersons = noPersons;
    }
    public vehicle (String serialNumber, int noPersons, String name){
        this (serialNumber,noPersons);
        this.name = name;
    }


    public String getSerialNumber() {
        return serialNumber;
    }

    public boolean goTo(double positionX, double positionY){
        System.out.println("Error: unknown vehicle cannot move…");
        return false;
    }

    public boolean addFuel( double fuel){
        System.out.println("Error: unknown type of vehicle…");
        return false;
    }

    void printlnfo(){
        System.out.println("Vehicle properties:\n" +
                "\t\t- serial number:" + serialNumber +"\n" +
                "\t\t- capacity: " + noPersons + " persons\n" +
                "\t\t- name: " + name);
    }


    public static void main(String[] args) {
    }
}
