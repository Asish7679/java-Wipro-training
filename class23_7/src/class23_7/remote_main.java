package class23_7;

import java.util.Scanner;

public class remote_main {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        Remote remote = null;

		        System.out.println("Choose device:\n1. TV\n2. AC");
		        int deviceChoice = scanner.nextInt();
		        scanner.nextLine();

		        if (deviceChoice == 1) {
		            remote = new TVRemote();
		        } else if (deviceChoice == 2) {
		            remote = new ACRemote();
		        } else {
		            System.out.println("Invalid device selected.");
		            return;
		        }

		        System.out.println("Choose action:\n1. Turn ON\n2. Turn OFF");
		        int actionChoice = scanner.nextInt();

		        if (actionChoice == 1) {
		            remote.turnOn();
		        } else if (actionChoice == 2) {
		            remote.turnOff();
		        } else {
		            System.out.println("Invalid action selected.");
		        }

		        scanner.close();
		    }
		}

