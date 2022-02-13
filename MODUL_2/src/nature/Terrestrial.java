package nature;

public class Terrestrial extends Animal {

    private int legs;
    private int eyes;

    public Terrestrial(boolean carnivore, int weight, int size, String species){
        super(carnivore, weight, size, species);
    }

    public Terrestrial(boolean carnivore, int weight, int size, String species, int legs, int eyes){
        super(carnivore, weight, size, species);
        this.legs = legs;
        this.eyes = eyes;
    }

    public Terrestrial() {
        super();
    }

    public void fight(){
        System.out.println("The terrestrial animal in now fighting!");
    }

    @Override
    public void description(){
        System.out.println("The terrestrial animal has: " + this.legs
                + " legs and " + this.eyes + " eyes");
        super.description();
    }

    @Override
    public void move(int distance){
        System.out.println("This is a terrestrial species.");
        super.move(distance);
    }

    public void saySomething() {
        System.out.println("Unknown sound for non-specific terrestrial animal...");
    }

    public void camouflage(){
        System.out.println("Unknown sound for non-specific terrestrial animal...");
    }



    public static void main(String[] args) {
    }
}
