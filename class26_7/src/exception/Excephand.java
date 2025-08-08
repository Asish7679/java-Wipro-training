package exception;
import java.util.*;


class InvalidPin extends Exception{
	 public InvalidPin(String messege) {
		super(messege);
	}
}
public class Excephand {
	
	static final int CorrectPin=9876;
	static void validate(int pin) throws InvalidPin{
		if(CorrectPin!=pin) {
			throw new  InvalidPin("Incorrect Pin");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter the Pin");
			int pin=sc.nextInt();
			validate(pin);
			System.out.println("Access Granted");
			
		
    } catch (InputMismatchException e) {
        System.out.println("Please enter digits only.");
    } catch (InvalidPin e) {
        System.out.println(e.getMessage());
    } finally {
        System.out.println("Thanks for using the ATM.");
    }

    sc.close();
}}



