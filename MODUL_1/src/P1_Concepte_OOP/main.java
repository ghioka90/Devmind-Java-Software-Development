package P1_Concepte_OOP;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class main {
    public static void main(String[] args) {
        PlayerStatus goten = new PlayerStatus();
        PlayerStatus trunks = new PlayerStatus();
        PlayerStatus opponent = new PlayerStatus();


        goten.initPlayer("Goten",3,100000);
        trunks.initPlayer("Trunks",3,100000);


        goten.findArtifact(13);
        trunks.findArtifact(6);

        goten.setWeaponInHand("sniper");
        trunks.setWeaponInHand("kalashnikov");


        goten.movePlayerTo(100,50);
        trunks.movePlayerTo(80, 60);


        System.out.println(goten.getScore());
        System.out.println(trunks.getScore());

        System.out.println(goten.getLives());
        System.out.println(trunks.getLives());

        System.out.println(goten.getHealth());
        System.out.println(trunks.getHealth());

        System.out.println(goten.getPositionX() + " " + goten.getPositionY());

        System.out.println(trunks.distanceBetweenPlayers(goten));
        System.out.println(goten.getWeaponInHand());
        System.out.println(goten.shoultAttackOpponent(trunks));

        }
    }

