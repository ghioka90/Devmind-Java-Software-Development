package Curs8;

public class OnWater extends vehicle{
    int noEngines;
    int cargoCapacity;

    public OnWater(String serialNumber, int noPersons){
        super (serialNumber, noPersons);
    }
    public OnWater(String serialNumber, int noPersons, String name){
        super (serialNumber, noPersons, name);
    }
    public OnWater(String serialNumber, int noPersons, String name, int noEngines){
        super(serialNumber, noPersons, name);
        this.noEngines = noEngines;
    }
    public OnWater(String serialNumber, int noPersons, String name, int noEngines, int cargoCapacity) {
        this(serialNumber, noPersons, name, noEngines);
        this.cargoCapacity = cargoCapacity;
    }


    @Override
    public boolean goTo(double positionX, double positionY){
        System.out.println("Sailing the vessel " + name + " to coordinates: [" + positionX + ", " + positionY + "]");
//        super.goTo(positionX,positionY);
        return true;
    }

    @Override
    public boolean addFuel( double fuel){
        System.out.println("Adding " + fuel + " l of fuel to the vessel " + name);
        return true;
    }


    @Override
    void printlnfo(){
        super.printlnfo();
        System.out.println("Vesel " + name + " properties:\n" +
                "\t\t- number of engines: " + noEngines +"\n" +
                "\t\t- cargo capacity " + cargoCapacity + " persons\n");
    }



    public static void main(String[] args) {
    }
}
