package linkedlist;
import java.util.*;

public class QueueMain {
    public static void main(String[] args) {
        LinkedList<Patient> patientQueue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nHOSPITAL QUEUE MENU");
            System.out.println("1. Add Patient (Normal)");
            System.out.println("2. Add Emergency Patient");
            System.out.println("3. Remove Patient");
            System.out.println("4. View All Patients");
            System.out.println("5. Check First Patient");
            System.out.println("6. Check Last Patient");
            System.out.println("7. Find Doctor by Patient Name");
            System.out.println("8. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Patient Name: ");
                    String name1 = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age1 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Disease: ");
                    String disease1 = sc.nextLine();
                    Patient p1 = new Patient(name1, age1, disease1);
                    patientQueue.add(p1);
                    System.out.println("Patient added to queue (Normal). Needs Doctor: " + p1.getDoctor());
                    break;

                case 2:
                    System.out.print("Enter Emergency Patient Name: ");
                    String name2 = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age2 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Disease: ");
                    String disease2 = sc.nextLine();
                    Patient p2 = new Patient(name2, age2, disease2);
                    patientQueue.addFirst(p2);
                    System.out.println("Emergency patient added at front! Needs Doctor: " + p2.getDoctor());
                    break;

                case 3:
                    if (!patientQueue.isEmpty()) {
                        Patient removed = patientQueue.poll();
                        System.out.println("Removed Patient: " + removed.getName());
                    } else {
                        System.out.println("No patients in queue!");
                    }
                    break;

                case 4:
                    if (patientQueue.isEmpty()) {
                        System.out.println("No patients in queue!");
                    } else {
                        System.out.println("Patients in Queue:");
                        for (Patient p : patientQueue) {
                            p.displayDetails();
                        }
                    }
                    break;

                case 5:
                    if (!patientQueue.isEmpty()) {
                        System.out.print("First Patient: ");
                        patientQueue.peekFirst().displayDetails();
                    } else {
                        System.out.println("Queue is empty!");
                    }
                    break;

                case 6:
                    if (!patientQueue.isEmpty()) {
                        System.out.print("Last Patient: ");
                        patientQueue.peekLast().displayDetails();
                    } else {
                        System.out.println("Queue is empty!");
                    }
                    break;

                case 7:
                    System.out.print("Enter Patient Name to find Doctor: ");
                    String searchName = sc.nextLine();
                    boolean found = false;

                    for (Patient p : patientQueue) {
                        if (p.getName().equalsIgnoreCase(searchName)) {
                            found = true;
                            System.out.println("Patient: " + p.getName() +
                                               " | Doctor: " + p.getDoctor());
                        }
                    }
                    if (!found) {
                        System.out.println("Patient not found!");
                    }
                    break;

                case 8:
                    System.out.println("Exiting Hospital Queue System...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
