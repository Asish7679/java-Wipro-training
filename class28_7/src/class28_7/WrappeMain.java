package class28_7;

import java.util.ArrayList;
import java.util.Scanner;

public class WrappeMain {
	public static void main(String[] args) {
	
	        Scanner sc = new Scanner(System.in);
	        ArrayList<Wrapper> studentList = new ArrayList<>();

	        System.out.print("Enter number of students: ");
	        int count = sc.nextInt();
	        sc.nextLine(); 

	        for (int i = 0; i < count; i++) {
	            System.out.print("Enter student name: ");
	            String name = sc.nextLine();

	            System.out.print("Enter marks: ");
	            int marks = sc.nextInt();
	            sc.nextLine(); 

	            studentList.add(new Wrapper(name, marks));
	        }

	        System.out.println("\n--- Student Marks ---");
	        int total = 0;
	        for (Wrapper s : studentList) {
	            s.display();
	            total += s.marks;
	        }

	        double average = (double) total / studentList.size();
	        System.out.println("\nAverage Marks: " + average);
	    }
	}

