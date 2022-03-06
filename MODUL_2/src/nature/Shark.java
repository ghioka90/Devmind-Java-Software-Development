package nature;

public class Shark extends Aquatic{
    public Shark(boolean carnivore, int weight, int size,
                 String species, int swimmers, int eyes) {
        super(carnivore, weight, size, species, swimmers, eyes);
    }

    public Shark() {
        super();
    }

    @Override
    public void saySomething() {
        System.out.println("irrr... This shark says something...");
    }


    @Override
    public void eat(int unitsOfFood) {
        System.out.println("Eating grass like a zebra, " + unitsOfFood + " kg.");
    }

    @Override
    public void move(int distance) {
        System.out.println("Fast moving forward like a zebra, " +
                distance + " meters in " + distance / 2 + " hours.");
    }



    @Override
    public void camouflage(){
        System.out.println("I'm a fearless beast! I don't hide!");
    }
    public static void main(String[] args) {
    }
}
