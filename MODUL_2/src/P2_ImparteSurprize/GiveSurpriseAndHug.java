package P2_ImparteSurprize;

public class GiveSurpriseAndHug extends AbstractGiveSurprises {
    public GiveSurpriseAndHug(String contType, int wTime){
        super(contType, wTime);
    }

    @Override
    protected void giveWithPassion(){
        System.out.println("Warm wishes and a big hug!");
    }
    public static void main(String[] args) {
    }
}
