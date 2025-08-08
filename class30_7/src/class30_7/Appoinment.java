package class30_7;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.TreeSet;
class Appointment implements Comparable<Appointment> {
    String patientName;
    LocalDateTime dateTime;

    Appointment(String patientName, LocalDateTime dateTime) {
        this.patientName = patientName;
        this.dateTime = dateTime;
    }

    public int compareTo(Appointment other) {
        int cmp = this.dateTime.compareTo(other.dateTime);
        if (cmp == 0) {
            return this.patientName.compareTo(other.patientName);
        }
        return cmp;
    }

    public String toString() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        return patientName + " → " + dateTime.format(fmt);
    }
}

public class Appoinment{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Appointment> appointments = new TreeSet<>();

        while (true) {
            System.out.println("\n===== Appointment Menu =====");
            System.out.println("1. Book Appointment");
            System.out.println("2. View Appointments");
            System.out.println("3. Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) {
                System.out.print("Enter Patient Name: ");
                String name = sc.nextLine();

                System.out.print("Enter DateTime (dd-MM-yyyy HH:mm): ");
                String dt = sc.nextLine();

                try {
                    LocalDateTime dateTime = LocalDateTime.parse(dt,
                            DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm"));

                    if (appointments.add(new Appointment(name, dateTime)))
                        System.out.println("Appointment Added");
                    else
                        System.out.println("Appointment Already Exists");
                } catch (Exception e) {
                    System.out.println("Invalid format! Please use dd-MM-yyyy HH:mm");
                }

            } else if (ch == 2) {
                if (appointments.isEmpty())
                    System.out.println("No Appointments Yet.");
                else {
                    System.out.println("\n--- Scheduled Appointments ---");
                    for (Appointment a : appointments) {
                        System.out.println(a);
                    }
                }
            } else if (ch == 3) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid Choice! Try again.");
            }
        }
        sc.close();
    }
}
