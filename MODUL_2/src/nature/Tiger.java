package nature;

public class Tiger extends Terrestrial {

  public Tiger(boolean carnivore, int weight, int size, 
               String species, int legs, int eyes) {
    super(carnivore, weight, size, species, legs, eyes);
  }

  public Tiger() {
    super();
  }

  @Override
  public void saySomething() {
    System.out.println("Ggggrrrr... This tiger says something...");
  }

  @Override
  public void eat(int unitsOfFood) {
    System.out.println("Eating fresh meat like a tiger, " + unitsOfFood + " kg.");
  }

  @Override
  public void move(int distance) {
    System.out.println("Fast moving forward like a tiger, " +
            distance + " meters in " + distance / 2 + " hours.");
  }
  @Override
  public void specialCharacteristic() {
    System.out.println("I am a perfect hunter - agile and precise!");
  }
  @Override
  public void camouflage(){
    System.out.println("I'm a fearless beast! I don't hide!");
  }

  public void agility() {
    System.out.println("I am a perfect hunter - agile and precise!");
  }



  public static void subspeciesDescription() {
    System.out.println("[static method] Tiger subspecies");
  }

  @Override
  public String toString() {
    return "This is a Tiger! " + super.toString();
  }
}