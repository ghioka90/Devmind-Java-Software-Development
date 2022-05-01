package Curs29.SistemGestiuneInscrieri;
 
public class Guest {
  private String nume;
  private String prenume;
  private String email;
  private String telefon;
 
  public Guest(String nume, String prenume, String email, String telefon) {
    this.nume = nume;
    this.prenume = prenume;
    this.email = email;
    this.telefon = telefon;
  }
 
  public boolean isEqualTo(Guest g) {
    return email.equalsIgnoreCase(g.email);
  }
 
  public boolean isEqualByName(String nume, String prenume) {
    return nume.equalsIgnoreCase(this.nume) && 
            prenume.equalsIgnoreCase(this.prenume);
  }
 
  public boolean isEqualByEmail(String email) {
    return this.email.equalsIgnoreCase(email);
  }
 
  public boolean isEqualByPhone(String telefon) {
    return this.telefon.equalsIgnoreCase(telefon);
  }
 
  public boolean updateField(String nume, String prenume, 
                             String email, String telefon) {
    if (nume != null) {
      this.nume = nume;
      return true;
    }
    if (prenume != null) {
      this.prenume = prenume;
      return true;
    }
    if (email != null) {
      this.email = email;
      return true;
    }
    if (telefon != null) {
      this.telefon = telefon;
      return true;
    }
    
    System.out.println("Error: An error occured in 'Guest'," + 
                       " method 'updateField(...)'");
    return false; // Error Code
  }
 
  public boolean smartSearch(String token) {
    token = token.toLowerCase();
    return this.nume.toLowerCase().contains(token) ||
        this.prenume.toLowerCase().contains(token) ||
        this.email.toLowerCase().contains(token)   ||
        this.telefon.toLowerCase().contains(token);
  }
 
  public String describe() {
    return "Nume: " + this.nume + " " + this.prenume + ", Email: "
           + this.email + ", Telefon: " + this.telefon; 
  }
 
  public void notifyParticipation() {
    System.out.println("["+ this.nume + " " + this.prenume + 
         "] Felicitari! Locul tau la eveniment este confirmat. Te asteptam!");
  }
 
  public void notifyWaitingList(int orderNo) {
    System.out.println("["+ this.nume + " " + this.prenume
                       + "] Te-ai inscris cu succes in lista de asteptare "
                       + "si ai primit numarul de ordine " + orderNo
                       + ". Te vom notifica daca un loc devine disponibil.");
  }
}