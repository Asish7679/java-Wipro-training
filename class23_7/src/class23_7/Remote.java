package class23_7;
import java.util.Scanner;

	abstract class Remote {
	    abstract void turnOn();
	    abstract void turnOff();
	}

	class TVRemote extends Remote {
	    void turnOn() {
	        System.out.println("Turning ON the TV...");
	    }
	    void turnOff() {
	        System.out.println("Turning OFF the TV...");
	    }
	}

	class ACRemote extends Remote {
	    void turnOn() {
	        System.out.println("Turning ON the AC...");
	    }
	    void turnOff() {
	        System.out.println("Turning OFF the AC...");
	    }
	}
