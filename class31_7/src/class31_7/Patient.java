package class31_7;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

class Patient {
    private String patientName;
    private String doctorName;

    public Patient(String patientName, String doctorName) {
        this.patientName = patientName;
        this.doctorName = doctorName;
    }

    public String toString() {
        return "Patient: " + patientName + ", Doctor: " + doctorName;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TreeMap<LocalTime, Patient> appointments = new TreeMap<>();

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss"); // include seconds for uniqueness

        int choice;
        do {
            System.out.println("\nHospital Appointment Scheduler ===");
            System.out.println("1. Add Appointment (System Time)");
            System.out.println("2. View All Appointments");
            System.out.println("3. Remove Appointment");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Patient Name: ");
                    String patientName = sc.nextLine();
                    System.out.print("Enter Doctor Name: ");
                    String doctorName = sc.nextLine();

                    LocalTime now = LocalTime.now();

                    appointments.put(now, new Patient(patientName, doctorName));
                    System.out.println("Appointment added at " + now.format(timeFormatter));
                    break;

                case 2:
                    if (appointments.isEmpty()) {
                        System.out.println("No appointments scheduled.");
                    } else {
                        System.out.println("\nAll Scheduled Appointments (Sorted):");
                        for (Map.Entry<LocalTime, Patient> entry : appointments.entrySet()) {
                            System.out.println(entry.getKey().format(timeFormatter) + " -> " + entry.getValue());
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Appointment Time to Remove (HH:mm:ss): ");
                    String removeInput = sc.nextLine();
                    LocalTime removeTime = LocalTime.parse(removeInput, timeFormatter);
                    Patient removed = appointments.remove(removeTime);
                    if (removed != null) {
                        System.out.println("Removed Appointment at " + removeTime.format(timeFormatter) + " -> " + removed);
                    } else {
                        System.out.println("No appointment found at this time.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting Appointment Scheduler...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
