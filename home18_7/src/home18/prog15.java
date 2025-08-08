package home18;

public class prog15 {
	public static void main(String[] args) {
		int year = 2024;
		boolean leap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		System.out.println("Leap Year: " + leap);
	}
}
