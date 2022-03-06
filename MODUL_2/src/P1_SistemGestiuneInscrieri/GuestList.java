package P1_SistemGestiuneInscrieri;

import java.util.ArrayList;



public class GuestList {
    int avPlaces;
    ArrayList<Guest> participantList = new ArrayList<>();
    ArrayList<Guest> waitingList =  new ArrayList<>();

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
    // 2 metoda care determina daca o pesroana este sau nu inscrisa la eveniment, pe orcare din liste, reutilizand metoda search
    public boolean isRegistred(String firstName, String lastName, String email, int phoneNo){
        return search(participantList, firstName, lastName) ||
                search(participantList, email) ||
                search(participantList, phoneNo) ||
                search(waitingList, firstName, lastName) ||
                search(waitingList, email) ||
                search(waitingList, phoneNo);
    }
    //a. metoda de cautare dupa nume si prenume
    public boolean search (ArrayList<Guest> guest, String firstName, String lastName){
        boolean result = false;
        for (Guest value : guest) {
            result =  value.firstName.equalsIgnoreCase(firstName) &&
                    value.lastName.equalsIgnoreCase(lastName);
        }
        return result;
    }
    //b. metoda de cautare dupa email
    public boolean search (ArrayList<Guest> guest, String email){
        boolean result = false;
        for (Guest value : guest) {
            result = value.email.equalsIgnoreCase(email);
        }
        return result;
    }
    //c. metoda de cautare dupa numarul de telefon
    public boolean search (ArrayList<Guest> guest, int phoneNo){
        boolean result = false;
        for (Guest value : guest) {
            result = value.phoneNo == phoneNo;
        }
        return result;
    }

// public boolean remove (){}

    public void displayParticipants(){
        for (int i = 0; i < participantList.size(); i++){
            System.out.println((i+1) + ". ");
        }
    }


    public static void main(String[] args) {
    }
}
