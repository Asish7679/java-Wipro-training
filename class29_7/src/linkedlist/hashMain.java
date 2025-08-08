package linkedlist;

import java.util.*;

public class hashMain {

    static class Patient {
        int id;
        String name;

        Patient(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public String toString() {
            return "[ID: " + id + ", Name: " + name + "]";
        }

        
        public boolean equals(Object o) {
            if (this == o) return true;          // same object
            if (!(o instanceof Patient)) return false;  
            Patient p = (Patient) o;
            return this.id == p.id;              // sirf ID compare karenge
        }

        
        public int hashCode() {
            
            return Objects.hash(id);
        }
    }

    public static void main(String[] args) {
        HashSet<Patient> patients = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- HOSPITAL REGISTRATION MENU ---");
            System.out.println("1. Register New Patient");
            System.out.println("2. View All Patients");
            System.out.println("3. Search Patient by ID");
            System.out.println("4. Remove Patient by ID");
            System.out.println("5. Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Enter Patient ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Patient Name: ");
                    String name = sc.nextLine();

                    Patient p = new Patient(id, name);
                    if (patients.add(p)) {
                        System.out.println(" Registered Successfully!");
                    } else {
                        System.out.println(" Duplicate ID not allowed!");
                    }
                    break;

                case 2:
                    if (patients.isEmpty()) {
                        System.out.println("No patients registered yet.");
                    } else {
                        System.out.println(" Registered Patients:");
                        for (Patient pt : patients) {
                            System.out.println(pt);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter ID to Search: ");
                    int sid = sc.nextInt();
                    sc.nextLine();
                    boolean found = false;
                    for (Patient pt : patients) {
                        if (pt.id == sid) {
                            System.out.println(" Found: " + pt);
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println(" Patient not found!");
                    break;

                case 4:
                    System.out.print("Enter ID to Remove: ");
                    int rid = sc.nextInt();
                    sc.nextLine();
                    Patient toRemove = null;
                    for (Patient pt : patients) {
                        if (pt.id == rid) {
                            toRemove = pt;
                            break;
                        }
                    }
                    if (toRemove != null) {
                        patients.remove(toRemove);
                        System.out.println("Removed: " + toRemove);
                    } else {
                        System.out.println("Patient not found!");
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
