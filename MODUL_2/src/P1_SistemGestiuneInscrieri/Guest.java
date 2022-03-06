package P1_SistemGestiuneInscrieri;

public class Guest {
    public String lastName;
    public String firstName;
    public String email;
    public int phoneNo;

    public Guest(){}

    public Guest(String lastName) {
        this.lastName = lastName;
    }

    public Guest(String lastName, String firstName) {
        this(lastName);
        this.firstName = firstName;
    }

    public Guest(String lastName, String firstName,String email) {
        this(lastName, firstName);
        this.email = email;
    }

    public Guest(String lastName, String firstName,String email, int phoneNo) {
        this(lastName, firstName, email);
        this.phoneNo = phoneNo;
    }

    public boolean equals (String lastName, String firstName,String email, int phoneNo){
        if ((this.lastName == lastName && this.firstName == firstName)
                || this.email == email
                || this.phoneNo == phoneNo) {
            return true;
        }else{
            return false;
        }
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }


    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public static void main(String[] args) {
    }
}
