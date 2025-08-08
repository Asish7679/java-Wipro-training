package class31_7;
import java.util.*;

public class PatientTreemap {

    private int id;
    private String name;
    private String disease;

    public PatientTreemap(int id, String name, String disease) {
        this.id = id;
        this.name = name;
        this.disease = disease;
    }

    public String toString() {
        return "[ID: " + id + ", Name: " + name + ", Disease: " + disease + "]";
    }

    public static void main(String[] args) {
        TreeMap<Integer, PatientTreemap> appointments = new TreeMap<>();

        appointments.put(1010, new PatientTreemap(1, "Asish", "Fever"));
        appointments.put(1030, new PatientTreemap(2, "Ravi", "Cold"));
        appointments.put(1000, new PatientTreemap(3, "Nikita", "Headache"));

        System.out.println("All Scheduled Appointments:");
        for (Map.Entry<Integer, PatientTreemap> entry : appointments.entrySet()) {
            System.out.println("Time: " + entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nRemoving appointment at 1030...");
        appointments.remove(1030);

        System.out.println("\nRescheduling Asish from 1010 to 1045...");
        PatientTreemap p = appointments.remove(1010);
        appointments.put(1045, p);

        System.out.println("\nNext Appointment: " + appointments.firstEntry());
        System.out.println("\nLast Appointment: " + appointments.lastEntry());

        System.out.println("\n Updated Appointments:");
        for (Map.Entry<Integer, PatientTreemap> entry : appointments.entrySet()) {
            System.out.println("Time: " + entry.getKey() + " -> " + entry.getValue());
        }
    }
}
