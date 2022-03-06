package nature;

public class Rhino extends Terrestrial {

  public Rhino(boolean carnivore, int weight, int size, 
               String species, int legs, int eyes) {
    super(carnivore, weight, size, species, legs, eyes);
  }

  @Override
  public void saySomething() {
    System.out.println("Vveerrsseee... This rhino says something... ");
  }

  @Override
  public void camouflage(){
    System.out.println("I'm using my thick skin, strong horn and impressive large size to defend.");
  }
  @Override
  public void eat(int unitsOfFood) {
    System.out.println("Eating grass like a rhino, " + unitsOfFood + " tons.");
  }

  @Override
  public void move(int distance) {
    System.out.println("Slowly moving forward like a rhino, " +
            distance + " meters in " + distance / 2 + " days.");
  }
  @Override
  public void specialCharacteristic() {
    System.out.println("I have a strong horn!");
  }

  public static void subspeciesDescription() {
    System.out.println("[static method] Rhino subspecies");
  }

    @Override
    public String toString() {
      return "This is a Rhino! " + super.toString();
    }
  
}