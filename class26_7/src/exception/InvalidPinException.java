package exception;

import java.util.*;

class InvalidPinException extends Exception {
	public InvalidPinException(String msg) {
		super(msg);
	}
}

class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String msg) {
		super(msg);
	}
}
class Account {
	String name;
	int pin;
	double balance;

	public Account(String name, int pin, double balance) {
		this.name = name;
		this.pin = pin;
		this.balance = balance;
	}
}


