package week2;

public class BankAccount {
    Person client;
    private int accountNumber;
    private static int nextAccountNumber = 0;

    private double balance;

    // constructor
    public BankAccount(Person client) {
        this.client = client;
        accountNumber = nextAccountNumber;
        ++nextAccountNumber;
        this.balance = 0;
    }

    // Setter and getter method

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Balance operation
    public void depositeMoney(double amount) {
        balance += amount;
    }

    public void pay(double amount) {
        balance -= amount;
    }

    public void withdrawMoney(double amount) {
        if (balance < amount) {
            System.out.println("Sorry, your balance is insufficient. ");
            return;
        }
        balance -= amount;
    }

    // Bank transfer
    public void transferTo(BankAccount account, double amount) {
        if (this.balance < amount) {
            System.out.println("Sorry, your balance is insufficient. ");
            return;
        }
        this.balance -= amount;
        account.balance += amount;
    }

    public void printBalance() {
        System.out.println("Balance is: " + balance);
    }
}
