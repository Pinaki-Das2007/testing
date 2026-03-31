

class BankAccount {

    String accountHolder;
    double balance;

    // Constructor
    BankAccount(String name, double initialBalance) {
        accountHolder = name;
        balance = initialBalance;
    }

    // Method to display details
    void showDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

public class Main1 {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Pinaki", 150000);
        account1.showDetails();

    }
}