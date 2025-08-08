package class22_7;
import java.util.Scanner;
public class google {
	    String name;
	    double size;

	    void upload(String n, double s) {
	        name = n;
	        size = s;
	    }

	    void display() {
	        System.out.println("File Name: " + name);
	        System.out.println("File Size: " + size + " MB");
	    }
	

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        google f1 = new google();
	        System.out.print("Enter file name: ");
	        String name = sc.nextLine();
	        System.out.print("Enter file size in MB: ");
	        double size = sc.nextDouble();

	        f1.upload(name, size);

	        System.out.println("\nUploaded File Details:");
	        f1.display();
	    }
	}

