package class28_7;

import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Is candidate passed? (true/false): ");
        String passFail = sc.nextLine();

        boolean status = Boolean.parseBoolean(passFail);

        if (status) {
            System.out.println("Candidate passed. Please enter details.");

            System.out.print("Enter age: ");
            String age = sc.nextLine();
            System.out.print("Enter marks: ");
            String marks = sc.nextLine();
            int Age = Integer.parseInt(age);
            double Marks = Double.parseDouble(marks);

            if (Age < 0 || Age > 100) {
                System.out.println("Invalid age entered.");
            } else if (Marks < 33) {
                System.out.println("But marks are less than 33. Candidate cannot be considered passed.");
            } else {
                System.out.println("All details are valid.");
                System.out.println("Age: " + Age + ", Marks: " + Marks);
            }

        } else {
            System.out.println("Candidate failed. No need to enter age or marks.");
        }
    }
}
