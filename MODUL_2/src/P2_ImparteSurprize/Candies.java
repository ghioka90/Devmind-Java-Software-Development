package P2_ImparteSurprize;

public class Candies {
    int noCandies;
    String type;

    public Candies(int noCandies, String type) {
        this.noCandies = noCandies;
        this.type = type;
    }

    public void open(){
        System.out.println("Felicitari: Ai primit o cutie cu " + noCandies + " de bomboane de " + type + ".");
    }

    public static void main(String[] args) {
    }
}
