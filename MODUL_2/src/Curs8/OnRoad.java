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
        System.out.println("Driving vehicle " + name + " on road to coordinates: [" + positionX + ", " + positionY + "]");
//        super.goTo(positionX,positionY);
        return true;

    }
    @Override
    public boolean addFuel( double fuel){
        System.out.println("Adding " + fuel + " l of fuel to vehicle " + name);
        return true;
    }


    @Override
    void printlnfo(){
        super.printlnfo();
        System.out.println("Vehicle " + name + " properties:\n" +
                "\t\t- number of wheels: " + noWheels +"\n" +
                "\t\t- number of dors " + noDoors + " persons\n");
    }


        public static void main(String[] args) {
    }
}
