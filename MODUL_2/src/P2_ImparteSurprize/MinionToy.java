package P2_ImparteSurprize;

public class MinionToy {
    String minionName;

    public MinionToy(String minionName) {
        this.minionName = minionName;
    }

    public void open(){
        System.out.println("Felicitari! Ai primit minionul " + minionName + ".");
    }

    public static void main(String[] args) {
    }
}
