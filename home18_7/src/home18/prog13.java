package home18;

public class prog13 {
	public static void main(String[] args) {
		double p = 1000, r = 5, t = 2;
		double ci = p * Math.pow((1 + r / 100), t) - p;
		System.out.println("Compound Interest: " + ci);
	}
}
