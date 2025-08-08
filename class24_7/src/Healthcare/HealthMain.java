
package Healthcare;

import java.util.Scanner;

public class HealthMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		PatientService service = new ServiceImp();

		for (int i = 0; i < 2; i++) {
			System.out.println("\nEnter details for patient " + (i + 1));
			System.out.print("ID: ");
			int id = sc.nextInt();
			sc.nextLine(); 
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Age: ");
			int age = sc.nextInt();
			sc.nextLine(); 
			System.out.print("Illness: ");
			String illness = sc.nextLine();

			Patient patient = new Patient(id, name, age, illness);
			service.registerPatient(patient);
		}

		Doctor doc1 = new Cardio("Dr. Mehta");
		Doctor doc2 = new General("Dr. Singh");

		for (int i = 0; i < 2; i++) {
			Patient patient = ((ServiceImp) service).getPatientByIndex(i);
			if (patient != null) {
				if (patient.getIllness().toLowerCase().contains("heart")) {
					doc1.diagnose(patient);
				} else {
					doc2.diagnose(patient);
				}
				System.out.println();
			}
		}

		sc.close();
	}
}
