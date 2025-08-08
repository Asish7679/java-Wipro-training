
package class23_7;

public class AccMain {
	public static void main(String[] args) {
		saving sv = new saving();
		sv.name = "Asish";
		sv.AccNum = 123;
		sv.amount = 98;
		sv.details();
		sv.save();

		System.out.println();

		current cb = new current();
		cb.name = "Aman";
		cb.AccNum = 125;
		cb.amount = 100;
		cb.details();
		cb.curr();
	}
}
