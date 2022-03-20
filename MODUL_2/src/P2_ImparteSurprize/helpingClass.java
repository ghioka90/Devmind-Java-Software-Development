package P2_ImparteSurprize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class helpingClass {

    //clasa ajutatoare in care stocam continutul surpizelor si tipul acestora +  clasa random pe care o vom pela de aici ulterior

    public  static final Random random = new Random();

    public final static int typesOfSurprise = 3;

    public static ArrayList<String> cookieMessage (){
        return new ArrayList<>(Arrays.asList(
            "Actions speak louder than words.",
            "Don't be sad, don't be blue..Frankenstein was ugly too.",
            "To be or not to be, this is the question.",
            "The life is too short,to have time for sadness too.",
            "A bad workman always blames his tools.",
            "A bird in the hand is worth two in the bush.",
            "A friend in need is a friend indeed",
            "A smile doesn't cost anything.",
            "All waters have the color of drowning.",
            "Ee have to look for the facts, not words.",
            "Great haste makes great waste.",
            "He laughs best who laughs last.",
            "Home sweet home.",
            "Honesty is the best policy.",
            "If you believe in dreams...then you will sleep all your life time.",
            "If the life is harsh, then you have to be harsher than it.",
            "Never say never.",
            "We are crazy just when we love somebody.",
            "Whatever you are, be a good one!",
            "Too many people today know the price of everything and the value of nothing."));
    }

    public static ArrayList<String> candiesType () {
        return new ArrayList<>(Arrays.asList(
                "caramel", "chocolate", "jelly", "fruits", "vanilla"));
    }

    public static ArrayList<String> minionNames (){
        return new ArrayList<>(Arrays.asList("Dave", "Carl", "Kevin","Stuart", "Jerry", "Tim"));
    }

    public static void main(String[] args) {
    }
}