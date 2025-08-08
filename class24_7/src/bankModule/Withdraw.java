package bankModule;

public class Withdraw {
	public void withdrawAmount(AccountCreation acc, double amount) {
		if (amount > 0 && acc.getBalance() >= amount) {
			acc.balance -= amount;
			System.out.println("₹" + amount + " withdrawn successfully.");
		} else {
			System.out.println("Invalid or Insufficient balance.");
		}
	}
}
