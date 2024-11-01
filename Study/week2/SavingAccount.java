package week2;

public class SavingAccount extends BankAccount {

    private double interestRate;
    public SavingAccount(Person client, double interestRate) {
        super(client);
        this.interestRate = interestRate;
    }

    @Override
    public void pay(double amount) {
        if (amount > getBalance()) {
            System.out.println("Sorry, your balance is insufficient. ");
            return;
        }
        super.pay(amount);
    }

    // Add interest to balance according to interest rate
    public void addInterest() {
        if (getBalance() < 0) {
            // Do something if balance less than 0. 
            return;
        }
        depositeMoney(getBalance() * (interestRate / 100.0));
    }
}
