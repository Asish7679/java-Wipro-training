
package Healthcare;

public class ServiceImp implements PatientService {

	private Patient[] p = new Patient[5];
	private int count = 0;

	public void registerPatient(Patient patient) {
		if (count < p.length) {
			p[count++] = patient;
		} else {
			System.out.println("Patient limit reached.");
		}
	}

	public void showPatient(int patientId) {
		boolean found = false;
		for (int i = 0; i < count; i++) {
			if (p[i].getId() == patientId) {
				p[i].showDetails();
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("Patient with ID " + patientId + " not found.");
		}
	}
	public Patient getPatientByIndex(int index) {
	    if (index >= 0 && index < count) {
	        return p[index];
	    }
	    return null;
	}


}
