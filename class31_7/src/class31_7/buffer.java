package class31_7;
import java.io.*;
import java.util.*;

public class buffer{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Add Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter("example2.txt", true))) {
                    System.out.print("Enter the name: ");
                    String name = sc.nextLine();
                    writer.write("Name: " + name);
                    writer.newLine();

                    System.out.print("Enter the ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    writer.write("ID: " + id);
                    writer.newLine();

                    System.out.print("Enter the Disease: ");
                    String disease = sc.nextLine();
                    writer.write("Disease: " + disease);
                    writer.newLine();

                    System.out.print("Enter the Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    writer.write("Age: " + age);
                    writer.newLine();
                    writer.write("----------------------");
                    writer.newLine();

                    System.out.println("Data written successfully.");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } 
            else if (choice == 2) {
                try (BufferedReader reader = new BufferedReader(new FileReader("example2.txt"))) {
                    String line;
                    System.out.println("\nPatient Records:");
                    while ((line = reader.readLine()) != null) {
                        System.out.println(line);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } 
            else if (choice == 3) {
                System.out.println("Exiting...");
                break;
            } 
            else {
                System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}
