package class23_7;

public class payment_main {
	
		    public static void main(String[] args) {
		        Payment p1 = new CreditCardPayment("Amazon", 1500.00, "1234567890123456");
		        Payment p2 = new UPIPayment("Flipkart", 750.50, "user@upi");

		        p1.makePayment(); 
		        p2.makePayment(); 
		    }
		}

