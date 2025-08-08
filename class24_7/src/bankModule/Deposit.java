package bankModule;

public class Deposit {
    public void depositAmount(AccountCreation acc, double amount) {
        if (amount > 0) {
            acc.balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
}
