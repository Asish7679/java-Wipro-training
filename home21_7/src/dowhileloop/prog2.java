package dowhileloop;

public class prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1234, rev = 0;
		do {
		    int digit = num % 10;
		    rev = rev * 10 + digit;
		    num /= 10;
		} while (num != 0);
		System.out.println("Reversed: " + rev);


	}

}
