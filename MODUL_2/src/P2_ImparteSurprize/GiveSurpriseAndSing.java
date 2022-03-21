package P2_ImparteSurprize;

public class GiveSurpriseAndSing extends AbstractGiveSurprises{
    public GiveSurpriseAndSing(String contType, int wTime){
        super(contType, wTime);
    }

    @Override
    protected void giveWithPassion(){
        System.out.println("Singing a nice song, full of joy and genuine excitement…");
    }
    public static void main(String[] args) {
    }
}
