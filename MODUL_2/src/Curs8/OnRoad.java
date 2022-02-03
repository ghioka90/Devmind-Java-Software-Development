package Curs8;

public class OnRoad extends vehicle{
    int noWheels;
    int noDoors;

    public OnRoad(String serialNumber, int noPersons){
        super (serialNumber, noPersons);
    }
    public OnRoad(String serialNumber, int noPersons, String name){
        super (serialNumber, noPersons, name);
    }
    public OnRoad(String serialNumber, int noPersons, String name, int noWheels){
        super (serialNumber, noPersons, name);
        this.noWheels =  noWheels;
    }
    public OnRoad(String serialNumber, int noPersons, String name, int noWheels, int noDoors) {
        this(serialNumber, noPersons, name, noWheels);
        this.noDoors = noDoors;
    }
    @Override
    public boolean goTo(double positionX, double positionY){


        System.out.println("Driving the vehicle on road to coordinates: [" + positionX + ", " + positionY + "]");
        super.goTo(positionX,positionY);
        return true;

    }
    @Override
    public boolean addFuel( double fuel){
        System.out.println("Error: unknown type of vehicle…");
        return false;
    }
    @Override
    void printlnfo(){
        super (serialNumber, noPersons, name);
        System.out.println("Vehicle properties:\n" +
                "\t\t- serial number:" + serialNumber +"\n" +
                "\t\t- capacity: " + noPersons + " persons\n" +
                "\t\t- name: " + name);
    }


        public static void main(String[] args) {
    }
}
