package class23_7;

public class bank {
  //private double withdra;
 // private double deposit;
  public double balance=50000;
  public void setdeposit(double deposit) {
	  balance=balance+deposit;
	  
  }
  public void setwithdra(double withdra) {
	  balance=balance-withdra;
  }
  public double getdeposit() {
	  return balance;
  }
  public double getwithdra() {
	  return balance;
  }
}
