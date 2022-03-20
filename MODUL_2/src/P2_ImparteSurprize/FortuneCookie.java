package P2_ImparteSurprize;

import java.util.ArrayList;

public class FortuneCookie implements ISurprise {
    private static String message;
    private static int randomNo;// indexul mesajului surprizei


    private static final ArrayList<String> messages  = helpingClass.cookieMessage();

    //constructor
    public FortuneCookie(String message) {
        this.message = message;
    }

    //metoda care deschide surpriza si afiseaza un mesaj
    @Override
    public void enjoy(){
        System.out.println("Enjoy your cookie!!!");
        System.out.println(this.message);
    }
    //metoda de generare a unei prajituri(surpize) random
    public static FortuneCookie generate (){
        randomNo = helpingClass.random.nextInt(messages.size()); //apelam random din helping class pentru generarea unui numar aleator
        return new FortuneCookie(messages.get(randomNo));//se compune surpriza nu mesajul randomNo
    }
    //metoda de afisare
    @Override
    public String toString(){
        return "Fortune cookie [ messsage: " + message + " at random number: " + randomNo + " ]";
    }

    public static void main(String[] args) {
    }
}
