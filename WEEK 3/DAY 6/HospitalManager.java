
public class HospitalManager {

	private Patient[] patientArray;
	private Patient firstPatient = null;

	public HospitalManager(int size) {

		patientArray = new Patient[size];

	}

	public Patient[] getPatientArray() {

		return patientArray;
	}

	public void addPatient(Patient newPatient) {
		if (firstPatient == null) {
			firstPatient = newPatient;
			return;
		}

		Patient current = firstPatient;
		while (current.getNextPatient() != null) {
			current = current.getNextPatient();
		}

		current.setNextPatient(newPatient);
	}

	public boolean deletePatient(String name) {
		
		if (firstPatient == null) {
			return false;
		}

		if (firstPatient.getName().equals(name)) {
			firstPatient = firstPatient.getNextPatient();
			return true;
		}

		Patient current = firstPatient;
		while (current.getNextPatient() != null) {
			if (current.getNextPatient().getName().equals(name)) {
				current.setNextPatient(current.getNextPatient().getNextPatient());
				return true;
			}
			current = current.getNextPatient();
		}

		return false;
	}

}