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
    public void camouflage(){
        System.out.println("I'm a fearless beast! I don't hide!");
    }
    public static void main(String[] args) {
    }
}
