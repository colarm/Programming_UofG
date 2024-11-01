package week5;

import week2.Person;
import week2.SavingAccount;

class InSufficientException extends Exception {
    public InSufficientException(String message) {
        super(message);
    }
}

public class Bank extends SavingAccount {
    public Bank(Person client, double interestRate) {
        super(client, interestRate);
    }

    public void withdraw(double amount) throws InSufficientException {
        if (amount > this.getBalance()) {
            throw new InSufficientException("Cannot withdraw. Insufficient funds in savings account. ");
        }
    }
}