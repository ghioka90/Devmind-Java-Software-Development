package Curs15;

public class ex1 {
    public class BankAccount {
        private String firstName;
        private String lastName;
        private int accountBalance;

        private static String bankSWIFT;

        public void defaultBankAcc(){
            this.firstName = "UNKNOWN_FIRST_NAME";
            this.lastName = "UNKNOWN_LAST_NAME";
            this.accountBalance = 0;
        }

        public void initializeBankAccount (String personFirstName, String personLastName,
                                           int initialAccountBalance) {
            this.firstName = personFirstName;
            this.lastName = personLastName;
            this.accountBalance = initialAccountBalance;
        }

        public String getFullName() {
            return firstName + " " + lastName;
        }

        public void setFullName(String personFirstName, String personLastName) {
            this.firstName = personFirstName;
            this.lastName = personLastName;
            this.accountBalance = 0;
        }

        public boolean debitAccount(int amount) {
            if (amount <= accountBalance) {
                accountBalance -= amount;
                return true;
            }
            return false;
        }

        public void creditAccount(int amount) {
            this.accountBalance += amount;
        }

        protected void adminBlockAccount() {
            accountBalance = -1;
        }

        public static String getBankSWIFT() {
            return bankSWIFT;
        }

        public static void setBankSWIFT(String newBankSWIFT) {
            bankSWIFT = newBankSWIFT;
        }
    }
}
