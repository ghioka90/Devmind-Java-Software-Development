package nature;

public abstract class Aquatic extends Animal{
    int eyes;
    int swimmers;

    public Aquatic(boolean carnivore, int weight, int size, String species){
        super(carnivore, weight, size, species);
    }

    public Aquatic(boolean carnivore, int weight, int size, String species, int swimmers, int eyes){
        super(carnivore, weight, size, species);
        this.swimmers = swimmers;
        this.eyes = eyes;
    }

    public Aquatic() {
        super();
    }
    @Override
    public void description(){
        System.out.println("The aquatic animal has: " + this.swimmers
                + " wimmers and " + this.eyes + " eyes");
        super.description();
    }

//    @Override
//    public void move(int distance){
//        System.out.println("This is a aquatic species.");
//        super.move(distance);
//    }

    public abstract void saySomething();

    public abstract void camouflage();
}
