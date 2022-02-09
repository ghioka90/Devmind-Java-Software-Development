package Curs8;

public class OnAir extends vehicle {
    int noTurbines;
    boolean hasFirstClass;

    public OnAir(String serialNumber, int noPersons){
        super (serialNumber, noPersons);
    }
    public OnAir(String serialNumber, int noPersons, String name){
        super (serialNumber, noPersons, name);
    }
    public OnAir(String serialNumber, int noPersons, String name, int noTurbines){
        super(serialNumber, noPersons, name);
        this.noTurbines = noTurbines;
    }
    public OnAir(String serialNumber, int noPersons, String name, int noTurbines, boolean hasFirstClass) {
        this(serialNumber, noPersons, name, noTurbines);
        this.hasFirstClass = hasFirstClass;
    }

    @Override
    public boolean goTo(double positionX, double positionY){
        System.out.println("Flying the airplane " + name + " to coordinates: [" + positionX + ", " + positionY + "]");
//        super.goTo(positionX,positionY);
        return true;
    }

    @Override
    public boolean addFuel( double fuel){
        System.out.println("Adding " + fuel + " l of fuel to the airplane " + name);
        return true;
    }


    @Override
    void printlnfo(){
        super.printlnfo();
        System.out.println("Airplane " + name + " properties:\n" +
                "\t\t- number of turbines: " + noTurbines +"\n" +
                "\t\t" + (hasFirstClass ? "has first class\n" : "does not have first class\n"));
    }

    public static void main(String[] args) {
    }
}
