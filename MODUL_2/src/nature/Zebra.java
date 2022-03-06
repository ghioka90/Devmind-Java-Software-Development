package nature;

public class Zebra extends Terrestrial {

  public Zebra(boolean carnivore, int weight, int size, 
               String species, int legs, int eyes) {
    super(carnivore, weight, size, species, legs, eyes);
  }

  @Override
  public void saySomething() {
    System.out.println("Wzzeeaaaa... This zebra says something...");
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
  public void specialCharacteristic() {
    System.out.println("I am a perfect hunter - agile and precise!");
  }

  @Override
  public void camouflage(){
    System.out.println("Quick! Grouping all together confuses the predator!");
  }

  public void stripes() {
    System.out.println("I have particular stripes!");
  }

  public static void subspeciesDescription() {
    System.out.println("[static method] Zebra subspecies");
  }

  @Override
  public String toString() {
    return "This is a Zebra! " + super.toString();
  }
}