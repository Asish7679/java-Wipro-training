package bankModule;
	public class AccountCreation {
	    protected String accHolder;
	    protected int accNo;
	    protected double balance;  

	    public AccountCreation(String accHolder, int accNo) {
	        this.accHolder = accHolder;
	        this.accNo = accNo;
	        this.balance = 0.0;
	    }
	   

	    public void showAccountDetails() {
	        System.out.println("Account Holder: " + accHolder);
	        System.out.println("Account Number: " + accNo);
	        System.out.println("Account Balance: ₹" + balance);
	    }
	    public double getBalance() {
	        return balance;
	    }
	    public void deposit(double amount) {
	        balance += amount;
	    }

	    public boolean withdraw(double amount) {
	        if (balance >= amount) {
	            balance -= amount;
	            return true;
	        } else {
	            return false;
	        }
	    }
	}
