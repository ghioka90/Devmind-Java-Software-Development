package Exercitii;

public class Play {
    public static Ball magicHappens(Ball b) {
        Ball c = b;
        c.setColor("purple");
        b = new Ball("black", 5);
        return c;
    }
    public static void main(String[] args) {
        Ball ballA = new Ball("red", 5);
        Ball ballB = new Ball("green", 5);

        ballB = magicHappens(ballA);
        System.out.println(ballA + " " + ballB);
    }
    }


