package class23_7;

	abstract class Payment {
	    String payee;
	    double amount;

	    Payment(String payee, double amount) {
	        this.payee = payee;
	        this.amount = amount;
	    }
	    abstract void makePayment();
	}

	class CreditCardPayment extends Payment {
	    String cardNumber;

	    CreditCardPayment(String payee, double amount, String cardNumber) {
	        super(payee, amount);
	        this.cardNumber = cardNumber;
	    }

	    void makePayment() {
	        System.out.println("Paying ₹" + amount + " to " + payee + " using Credit Card ending with " + cardNumber);
	    }
	}

	class UPIPayment extends Payment {
	    String upiId;

	    UPIPayment(String payee, double amount, String upiId) {
	        super(payee, amount);
	        this.upiId = upiId;
	    }

	    void makePayment() {
	        System.out.println("Paying ₹" + amount + " to " + payee + " using UPI ID: " + upiId);
	    }
	}

