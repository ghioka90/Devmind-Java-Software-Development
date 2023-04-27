package P2_ImparteSurprize;

public class MAIN {
    public static void main(String[] args) {
        ISurprise surprise1 = GatherSurprises.gather();
        ISurprise surprise2 = GatherSurprises.gather();
        ISurprise surprise3 = GatherSurprises.gather();

        surprise1.enjoy();
        surprise2.enjoy();
        surprise3.enjoy();

        GiveSurpriseAndApplause giveA = new GiveSurpriseAndApplause("RANDOM", 3);

        giveA.put(surprise1);
        giveA.put(surprise2);
        giveA.put(surprise3);

        System.out.println("\n\n");

        giveA.giveAll();

        System.out.println("\n\n");

        GiveSurpriseAndHug giveH = new GiveSurpriseAndHug("FIFO", 3);

        ISurprise surprise4 = GatherSurprises.gather();
        ISurprise surprise5 = GatherSurprises.gather();
        ISurprise surprise6 = GatherSurprises.gather();

        giveH.put(surprise4);
        giveH.put(surprise5);
        giveH.put(surprise6);


        surprise4.enjoy();
        surprise5.enjoy();
        surprise6.enjoy();

        System.out.println("\n\n");

        giveH.giveAll();

        System.out.println("\n\n");

        GiveSurpriseAndSing giveS = new GiveSurpriseAndSing("LIFO", 3);

        ISurprise surprise7 = GatherSurprises.gather();
        ISurprise surprise8 = GatherSurprises.gather();
        ISurprise surprise9 = GatherSurprises.gather();

        giveS.put(surprise7);
        giveS.put(surprise8);
        giveS.put(surprise9);


        surprise7.enjoy();
        surprise8.enjoy();
        surprise9.enjoy();

        System.out.println("\n\n");

        giveS.giveAll();

    }
}
