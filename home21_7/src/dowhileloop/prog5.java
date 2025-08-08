package dowhileloop;
import java.util.Scanner;
public class prog5 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int choice;
	do {
	    System.out.println("1. Say Hello\n2. Exit");
	    choice = sc.nextInt();
	    if (choice == 1) {
	        System.out.println("Hello!");
	    }
	} while (choice != 2);
	sc.close();

}}
