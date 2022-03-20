package P1_SistemGestiuneInscrieri;


import java.util.ArrayList;
import java.util.Scanner;


public class GuestList {
    private int avPlaces = 4;
    Scanner sc = new Scanner(System.in);
     ArrayList<Guest> participantList;
     ArrayList<Guest> waitingList;

    public GuestList(int avPlaces){
        this.avPlaces = avPlaces;
        this.participantList = new ArrayList<Guest>(avPlaces);
        this.waitingList =  new ArrayList<Guest>();
    }

    // 1. metoda prin care adaugam persoane la eveniment
    public int add (String firstName, String lastName, String email, int phoneNo){
        Guest newGuest = new Guest(firstName, lastName,email,phoneNo);

        if (!isRegistred(firstName, lastName, email, phoneNo)){ // verificam daca persoana respectiva nu este deja inscrisa la eveniment
            if (participantList.size() <= avPlaces){ // conditie care nu ne lasa sa depasim numarul de locuri disponibile la eveniment
                participantList.add(newGuest);
                System.out.println("Felicitari! Locul tau la eveniment este confirmat. Te asteptam!");
                return 0;
            }else{
                waitingList.add(newGuest); // daca se depseste numarul de locuri disponibile atunci cursantul va intra pe lista de asteptare
                System.out.println("Te-ai inscris cu succes in lista de asteptare si ai primit numarul de ordine "
                        + waitingList.indexOf(newGuest) + ". Te vom notifica daca un loc devine disponibil.");
                return waitingList.indexOf(newGuest);
            }
        }else{
            System.out.println("Esti deja inscris la eveniment.");
            return -1;
        }
//
//        if ((participantList.size() <= avPlaces) &&
//                (participantList.size() == 0 ||
//                        !search(participantList, firstName, lastName) ||
//                        !search(participantList, email) ||
//                        !search(participantList, phoneNo))){
//            participantList.add(newGuest);
//            System.out.println("Felicitari! Locul tau la eveniment este confirmat. Te asteptam!");
//            return 0;
//        }else{
//            if ((participantList.size() > avPlaces) &&
//                    (waitingList.size() == 0 ||
//                            !search(waitingList, firstName, lastName) ||
//                            !search(waitingList, email) ||
//                            !search(waitingList, phoneNo))){
//                waitingList.add(newGuest);
//                System.out.println("Te-ai inscris cu succes in lista de asteptare si ai primit numarul de ordine "
//                        + waitingList.indexOf(newGuest) + ". Te vom notifica daca un loc devine disponibil.");
//                return waitingList.indexOf(newGuest);
//
//            }else{
//                return -1;
//            }
//        }
    }

    // 2 metoda care determina daca o pesroana este sau nu inscrisa la eveniment, pe oricare din liste, reutilizand metoda search
    public boolean isRegistred(String firstName, String lastName, String email, int phoneNo){
        return search(participantList, firstName, lastName) ||
                search(participantList, email) ||
                search(participantList, phoneNo) ||
                search(waitingList, firstName, lastName) ||
                search(waitingList, email) ||
                search(waitingList, phoneNo);
    }


    //a. metode de cautare si indexOf  dupa nume si prenume
    public boolean search (ArrayList<Guest> guest, String firstName, String lastName){
        boolean result = false;
        if (indexOf(guest, firstName, lastName) > -1){
            result = true;
        }
//        for (Guest value : guest) {
//            result =  value.firstName.equalsIgnoreCase(firstName) &&
//                    value.lastName.equalsIgnoreCase(lastName);
//        }
        return result;
    }
    public  int indexOf (ArrayList<Guest> guest, String firstName, String lastName){
        int result = -1;
        for (int i = 0; i < guest.size(); i++) {
            if(guest.get(i).firstName.equalsIgnoreCase(firstName) &&
                    guest.get(i).lastName.equalsIgnoreCase(lastName)){
                result = i;
            }
        }
        return result;
    }

    //b. metode de cautare si indexOf  dupa email
    public boolean search (ArrayList<Guest> guest, String email){
        boolean result = false;
        if (indexOf(guest, email) > -1){
            result = true;
        }
//        for (Guest value : guest) {
//            result = value.email.equalsIgnoreCase(email);
//        }
        return result;
    }
    public int indexOf (ArrayList<Guest> guest, String email){
        int result = -1;
        for (int i = 0; i < guest.size(); i++) {
            if(guest.get(i).email.equalsIgnoreCase(email)){
                result = i;
            }
        }
        return result;
    }


    //c. metoda de cautare si indexOf dupa numarul de telefon
    public boolean search (ArrayList<Guest> guest, int phoneNo){
        boolean result = false;
        if (indexOf(guest, phoneNo) > -1) {
            result = true;
        }
//        for (Guest value : guest) {
//            result = value.phoneNo == phoneNo;
//        }
        return result;
    }
    public int indexOf (ArrayList<Guest> guest, int phoneNo){
        int result = -1;
        for (int i = 0; i < guest.size(); i++) {
            if(guest.get(i).phoneNo == phoneNo){
                result = i;
            }
        }
        return result;
    }

    public int searchBy(ArrayList<Guest> guest ,String firstName, String lastName, String email, int phoneNo){
        System.out.println("Tastati un criteriu de cautare:"+
                "\n\tA : Nume si Prenume" +
                "\n\tB : Adresa de email" +
                "\n\tC : Numar de telefon" );
        String choice = sc.nextLine();
        int result = -1;
        switch (choice){
            case "A","a":
                result = indexOf(guest, firstName, lastName);
                break;
            case "B", "b":
                result = indexOf(guest, email);
                break;
            case "C", "c":
                result = indexOf(guest, phoneNo);
                break;
            default:
                System.out.println("Criteriu necunoscut");
        }
        return result;
    }

//    public boolean remove (){
//        if ();
//    }

    //5. 6. metoda de afisare a tuturor participantilor dintr-o lista
    public void displayParticipants(ArrayList<Guest> guest){
        for (int i = 0; i < guest.size(); i++){
            System.out.println((i+1) + ". ");
            System.out.println();
        }
    }

    //7. numarul de locuri disponibile
    public int availablePlaces (){
        if (participantList.size() == avPlaces){
            return 0;
        }else
            return avPlaces - participantList.size();
    }

    //8. metoda de afisare a numarului de participanti
    public int noParticipants(){
        return participantList.size();
    }

    //9. metoda de afisare a numarului de persoane aflate pe lista asteptare
    public int noPrsWaiting(){
        return waitingList.size();
    }

    //10. obtinerea numarului total de persoane
    public void totalParciticants(){
        System.out.println("Numarul total de participanti este: " + (noParticipants()+ noPrsWaiting()));
    }
//
//    public String printAllParticipants(){
//        return""
//    }
//
//    public String printGuest(ArrayList<Guest> guest){
//        for (int i; i < guest.size(); i++){
//            return guest.toSring(i));
//        }
//
//    }



    public static void main(String[] args) {
    }
}
