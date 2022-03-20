package P2_ImparteSurprize;

import java.util.ArrayList;

public class Candies implements ISurprise {
    private int noCandies;
    private String type;
    private static int randomNo1;// numarul random de bomboane pe care il contine "cutia de bomboane"(surpriza);
    private static int randomNo2;// numarul ce reprezinta indexul tipului de bomboana
    private static final ArrayList<String> candyTypes = helpingClass.candiesType();

    // constructor
    public Candies(int noCandies, String type) {
        this.noCandies = noCandies;
        this.type = type;
    }

    @Override
    public void enjoy(){
        System.out.println("Felicitari: Ai primit o cutie cu " + noCandies + " de bomboane de " + type + ".");
    }

    public static Candies generate(){ // metoda de generare a unei cutii de bomboane;
        randomNo1 = helpingClass.random.nextInt(200);//apelam random din helpingClass pentru generarea unui numar aleator
        randomNo2 = helpingClass.random.nextInt(candyTypes.size());

        return new Candies(randomNo1, candyTypes.get(randomNo2));   //se compune surpiza cu
                                                                    // numarul de bomboane randomNo1 si tipul randomNo2
    }

    public static void main(String[] args) {
    }
}
