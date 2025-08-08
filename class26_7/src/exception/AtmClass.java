package exception;
import java.util.*;

public class AtmClass {

	static Account[] accounts = {
			new Account("asish", 7679, 1000),
			new Account("rabi", 9732, 3000) };

	static Account findAccount(String name) {
		for (Account acc : accounts) {
			if (acc.name.equalsIgnoreCase(name)) {
				return acc;
			}
		}
		return null;
	}

	static void checkPin(Account acc, int enteredPin) throws InvalidPinException {
		if (acc.pin != enteredPin)
			throw new InvalidPinException("Incorrect PIN.");
	}

	static void withdraw(Account acc, double amount) throws InsufficientBalanceException {
		if (amount > acc.balance)
			throw new InsufficientBalanceException("Not enough balance.");
		acc.balance -= amount;
	}

	static void deposit(Account acc, double amount) {
		acc.balance += amount;
	}

	static void checkBalance(Account acc) {
		System.out.println("Your current balance is ₹" + acc.balance);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter your name: ");
			String name = sc.nextLine();

			Account user = findAccount(name);
			if (user == null) {
				System.out.println("Account not found.");
				return;
			}

			System.out.print("Enter PIN: ");
			int enteredPin = sc.nextInt();

			try {
				checkPin(user, enteredPin);
			} catch (InvalidPinException e) {
				System.out.println(e.getMessage());
				return;
			}

			int choice;
			do {
				System.out.println("\n-- ATM MENU ---");
				System.out.println("1. Balance Check");
				System.out.println("2. Deposit");
				System.out.println("3. Withdraw");
				System.out.println("4. Exit");
				System.out.print("Choose option: ");
				choice = sc.nextInt();

				switch (choice) {
				case 1 -> checkBalance(user);
				case 2 -> {
					System.out.print("Enter amount to deposit: ");
					double amt = sc.nextDouble();
					deposit(user, amt);
				}
				case 3 -> {
					System.out.print("Enter amount to withdraw: ");
					double amt = sc.nextDouble();
					try {
						withdraw(user, amt);
					} catch (InsufficientBalanceException e) {
						System.out.println(e.getMessage());
					}
				}
				case 4 -> System.out.println("Thank you for using our ATM.");
				default -> System.out.println("Invalid option.");
				}

			} while (choice != 4);

		} catch (InputMismatchException e) {
			System.out.println("Please enter valid numeric input.");
		} finally {
			System.out.println("completed");
			sc.close();
			
		}
	}
}
