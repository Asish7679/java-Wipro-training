package class23_7;

	public class Account {
	    String name;
	    int AccNum;
	    double amount;

	    public void details() {
	        System.out.println("Name: " + name);
	        System.out.println("Account Number: " + AccNum);
	        System.out.println("Amount: ₹" + amount);
	    }
	}
	class saving extends Account {
	    public void save() {
	        System.out.println("This is a Saving Account.");
	    }
	}
	class current extends Account {
	    public void curr() {
	        System.out.println("This is a Current Account.");
	    }
	}
