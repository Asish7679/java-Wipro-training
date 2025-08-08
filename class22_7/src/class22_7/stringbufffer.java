package class22_7;

import java.util.Scanner;

public class stringbufffer {
	public static void main(String[] args) {
		StringBuffer sab = new StringBuffer();
		sab.append(" -----recipit------\n");

		sab.append("customer name: Asish \n ");

		sab.append(" items    price\n");

		sab.append(" 1.bag      2500\n");

		sab.append(" 2.pencil    15\n");

		sab.append(" 3.bottle    40\n");

		sab.append(" 4.cycle    4000\n");
		sab.append("total       6665\n");
		System.out.println(sab);

		// employees profile

		Scanner sc = new Scanner(System.in);
		StringBuffer report = new StringBuffer();

		System.out.print("Enter number of employees: ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= n; i++) {
			System.out.println("\nEnter details for Employee " + i);

			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("ID: ");
			String id = sc.nextLine();

			System.out.print("Department: ");
			String dept = sc.nextLine();

			report.append("Employee ").append(i).append(":\n");
			report.append("Name: ").append(name).append("\n");
			report.append("ID: ").append(id).append("\n");
			report.append("Department: ").append(dept).append("\n");
			report.append("-----------------------------------\n");
		}

		System.out.println("\n===== EMPLOYEE PROFILE REPORT =====");
		System.out.println(report.toString());

		sc.close();
	}

}