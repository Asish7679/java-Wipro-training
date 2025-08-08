package class22_7;

import java.util.Scanner;

public class class_methods {

	int balance = 0;

	void deposit(int amt) {
		balance += amt;
	}

	void withdraw(int amt) {
		if (amt <= balance)
			balance -= amt;
	}

	void display() {
		System.out.println("Balance: " + balance);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		class_methods b = new class_methods();
		System.out.println("amount to deposit");
		b.deposit(sc.nextInt());
		System.out.println("amount to withdraw");
		b.withdraw(sc.nextInt());
		b.display();
		sc.close();
	}
}
