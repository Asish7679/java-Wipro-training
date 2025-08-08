package class23_7;

public class Messege {
	    void sendMessage() {
	        System.out.println("Sending a message...");
	    }
	}

	class EmailSender extends Messege {
	    void sendMessage() {
	        System.out.println("Sending message via Email...");
	    }
	}

	class SMSSender extends Messege {
	    void sendMessage() {
	        System.out.println("Sending message via SMS...");
	    }
	}

	