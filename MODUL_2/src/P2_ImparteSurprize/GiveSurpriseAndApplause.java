package P2_ImparteSurprize;

public class GiveSurpriseAndApplause extends AbstractGiveSurprises{

    public GiveSurpriseAndApplause(String contType, int wTime){
        super(contType, wTime);
    }

    @Override
    protected void giveWithPassion(){
        System.out.println("Loud applause to you… For it is in giving that we receive.");
    }

    public static void main(String[] args) {
    }
}
