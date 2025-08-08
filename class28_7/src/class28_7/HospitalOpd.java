package class28_7;
import java.util.ArrayList;
import java.util.Scanner;

public class HospitalOpd {
    public static void main(String[] args) {
        ArrayList<Patient> patientList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        patientList.add(new Patient("Vinay Bhat", 45, "Fever"));
        patientList.add(new Patient("Sonali Langar", 40, "Cough"));
        patientList.add(new Patient("Renu Sai", 30, "Pain"));

        while (true) {
            System.out.println("\n--- Hospital OPD Menu ---");
            System.out.println("1. Add New Patient");
            System.out.println("2. Display All Patients");
            System.out.println("3. Search Patient by Name");
            System.out.println("4. Update Patient Disease");
            System.out.println("5. Show Total Patients");
            System.out.println("6. Clear All Records");
            System.out.println("7. Check if List is Empty");
            System.out.println("8. Remove Patient by Name");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter patient name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter patient age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter disease: ");
                    String disease = scanner.nextLine();
                    patientList.add(new Patient(name, age, disease));
                    System.out.println("Patient added successfully!");
                    break;

                case 2:
                    if (patientList.isEmpty()) {
                        System.out.println("No patients found.");
                    } else {
                        System.out.println("All Registered Patients:");
                        for (Patient p : patientList) {
                            p.displayDetails();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter patient name to search: ");
                    String searchName = scanner.nextLine();
                    boolean found = false;
                    for (Patient p : patientList) {
                        if (p.getName().equalsIgnoreCase(searchName)) {
                            p.displayDetails();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("No patient found with name: " + searchName);
                    }
                    break;

                case 4:
                    System.out.print("Enter patient name to update disease: ");
                    String updateName = scanner.nextLine();
                    boolean updated = false;
                    for (Patient p : patientList) {
                        if (p.getName().equalsIgnoreCase(updateName)) {
                            System.out.print("Enter new disease: ");
                            String newDisease = scanner.nextLine();
                            p.setDisease(newDisease);
                            System.out.println("Disease updated successfully!");
                            updated = true;
                            break;
                        }
                    }
                    if (!updated) {
                        System.out.println("Patient not found.");
                    }
                    break;

                case 5:
                    System.out.println("Total Patients: " + patientList.size());
                    break;

                case 6:
                    patientList.clear();
                    System.out.println("All patient records cleared.");
                    break;

                case 7:
                    System.out.println(patientList.isEmpty() ? "List is empty." : "List is not empty.");
                    break;

                case 8:
                    System.out.print("Enter patient name to remove: ");
                    String removeName = scanner.nextLine();
                    boolean removed = false;
                    for (int i = 0; i < patientList.size(); i++) {
                        if (patientList.get(i).getName().equalsIgnoreCase(removeName)) {
                            patientList.remove(i);
                            System.out.println("Patient removed successfully.");
                            removed = true;
                            break;
                        }
                    }
                    if (!removed) {
                        System.out.println("Patient not found.");
                    }
                    break;

                case 9:
                    System.out.println("Exiting system...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
