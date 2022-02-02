package quizuri;


    public class TestFramework {

        public static Player updateNickname(Player player) {
            Player aPlayer = new Player("dan");
            Player sndPlayer = player;

            player.setNickname("john001");
            sndPlayer.setNickname("andrew");
            player = aPlayer;

            return player;
        }

        public static void main(String[] args) {
            Player p = new Player("vincent");
            updateNickname(p);
            System.out.println(p.getNickname());

        }
    }

