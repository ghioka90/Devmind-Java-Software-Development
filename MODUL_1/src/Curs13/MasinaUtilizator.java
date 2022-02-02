package Curs13;

import java.util.Scanner;

public class MasinaUtilizator {
    Scanner sc = new Scanner(System.in);
    String marca;
    String model;
    String culoare;
    int nrKm;
    int caiPutere;


    public void schimbaMarca (String marcaNoua) {
        this.marca = marcaNoua;
    }

    public void schimbaPutere (int noiCaiPutere ) {
        this.caiPutere = noiCaiPutere;
    }

    public void schimbakm (int noiKm) {
        nrKm += noiKm;
    }
    public void printareStareInitialaObiect() {
        System.out.println("Stare initiala obiect:");
        System.out.println("Marca: " + marca);
        System.out.println("Model: " + model);
        System.out.println("Culoare: " + culoare);
        System.out.println("Nr. kilometri: " + nrKm);
        System.out.println("Putere motor: " + caiPutere);
    }
    public void initailizareStareMasina (String marca, String model, String culoare, int nrKm, int caiPutere){
        System.out.println("Marca: ");
        marca = sc.nextLine();
        this.marca = marca;
        System.out.println("Model: ");
        model = sc.nextLine();
        this.model = model;
        System.out.println("Culoare: ");
        culoare = sc.nextLine();
        this.culoare = culoare;
        System.out.println("Numar km");
        nrKm = sc.nextInt();
        this.nrKm = nrKm;
        System.out.println("Putere");
        caiPutere = sc.nextInt();
        this.caiPutere = caiPutere;

    }
    public void printareStareObiect() {
        System.out.println("Stare actuala obiect");
        System.out.println("Marca: " + marca);
        System.out.println("Model: " + model);
        System.out.println("Culoare: " + culoare);
        System.out.println("Nr. kilometri: " + nrKm);
        System.out.println("Putere motor: " + caiPutere);
    }




}
