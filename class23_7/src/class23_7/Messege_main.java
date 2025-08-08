package class23_7;

public class Messege_main {

	public static void main(String[] args) {
		Messege sender = new EmailSender();;

		sender.sendMessage();

		Messege sender2 = new SMSSender();
		sender2.sendMessage();
	}
}
