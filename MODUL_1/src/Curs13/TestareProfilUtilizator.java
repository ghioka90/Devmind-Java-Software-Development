package Curs13;

import java.util.Scanner;

public class TestareProfilUtilizator {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ProfilUtilizator alex = new ProfilUtilizator();
        ProfilUtilizator andreea = new ProfilUtilizator();

        andreea.initailizareProfil(
                andreea.nume, andreea.prenume, andreea.email,
                andreea.numarDeTelefon, andreea.ziNastere,
                andreea.lunaNastere, andreea.anNastere, andreea.gen);
        andreea.actualizareEmail(andreea.email);
        andreea.actualizareNumarTelefon(andreea.numarDeTelefon);
        System.out.println();
        andreea.afisareStareInterna();
        System.out.println();

        alex.initailizareProfil(
                alex.nume, alex.prenume, alex.email,
                alex.numarDeTelefon, alex.ziNastere,
                alex.lunaNastere, alex.anNastere, alex.gen);
        alex.actualizareEmail(alex.email);
        alex.actualizareNumarTelefon(alex.numarDeTelefon);
        System.out.println();
        alex.afisareStareInterna();

    }
}
