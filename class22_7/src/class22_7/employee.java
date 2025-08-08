package class22_7;
import java.util.Scanner;

public class employee {
	    String name;
	    int id;
	    double salary;

	    void getDetails(Scanner sc) {
	        System.out.print("Enter ID: ");
	        id = sc.nextInt();
	        sc.nextLine();
	        System.out.print("Enter Name: ");
	        name = sc.nextLine();
	        System.out.print("Enter Salary: ");
	        salary = sc.nextDouble();
	    }

	    void display() {
	        System.out.println("\nEmployee Details:");
	        System.out.println("ID: " + id);
	        System.out.println("Name: " + name);
	        System.out.println("Salary: " + salary);
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        employee emp = new employee();
	        emp.getDetails(sc);
	        emp.display();
	    }
	}
