package Curs13;

import java.util.Date;
import java.util.Scanner;

public class ProfilUtilizator {
    Scanner sc = new Scanner(System.in);
    String nume;
    String prenume;
    String email;
    String numarDeTelefon;
    int ziNastere;
    int lunaNastere;
    int anNastere;
    String gen;

    public void actualizareEmail(String email) {
        System.out.println("Introduceti noul E-mail: ");
        email = sc.next();
        this.email = email;
    }

    public void actualizareNumarTelefon(String nrTel) {
        System.out.println("Introduceti noul numar de telefon: ");
        nrTel = sc.next();
        this.numarDeTelefon = nrTel;
    }

    public void afisareVarsta(int an){
        System.out.println("Varsta: " + (an - this.anNastere));
    }

    public void schimbareNume(String numeNou) {
        nume = numeNou;
    }

    public void schimbarePrenume(String prenumeNou) {
        prenume = prenumeNou;
    }

    public void printareStareInitialaObiect() {
        System.out.println("Stare initiala obiect:");
        System.out.println("Nume: " + nume);
        System.out.println("Prenume: " + prenume);
        System.out.println("E-mail: " + email);
        System.out.println("Nr. tel: " + numarDeTelefon);
        System.out.println("Data nastere: " + ziNastere + "/" + lunaNastere + "/" + anNastere);
        System.out.println("Gen: " + gen);
    }

    public void initailizareProfil(
            String nume, String prenume,
            String email, String numarDeTelefon,
            int ziNastere, int lunaNastere, int anNastere, String gen) {
        System.out.println("Nume: ");
        nume = sc.nextLine();
        this.nume = nume;
        System.out.println("Prenume: ");
        prenume = sc.nextLine();
        this.prenume = prenume;
        System.out.println("E-mail: ");
        email = sc.nextLine();
        this.email = email;
        System.out.println("Numar de telefon: ");
        numarDeTelefon = sc.nextLine();
        this.numarDeTelefon = numarDeTelefon;
        System.out.println("Zi de nastere: ");
        ziNastere = sc.nextInt();
        this.ziNastere = ziNastere;
        System.out.println("Luna de nastere: ");
        lunaNastere = sc.nextInt();
        this.lunaNastere = lunaNastere;
        System.out.println("An de nastere: ");
        anNastere = sc.nextInt();
        this.anNastere = anNastere;
        System.out.println("Gen: ");
        gen = sc.next();
        this.gen = gen;
    }

    public void printareStareObiect() {
        System.out.println("Stare actuala obiect:");
        System.out.println("Nume: " + nume);
        System.out.println("Prenume: " + prenume);
        System.out.println("E-mail: " + email);
        System.out.println("Nr. tel: " + numarDeTelefon);
        System.out.println("Data nastere: " + ziNastere + "/" + lunaNastere + "/" + anNastere);
        System.out.println("Gen: " + gen);
        }
    public void afisareStareInterna() {
        System.out.println("Stare actuala obiect:");
        System.out.println("Nume: " + nume);
        System.out.println("Prenume: " + prenume);
        System.out.println("E-mail: " + email);
        System.out.println("Nr. tel: " + numarDeTelefon);
        System.out.println("Data nastere: " + ziNastere + "/" + lunaNastere + "/" + anNastere);
        System.out.println("Gen: " + gen);
        afisareVarsta(2021);
    }

    }

