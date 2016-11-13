
public class HospitalManager {

	private Patient firstPatient = null;

	public Patient getFirstPatient() {
		
		return firstPatient;
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

	public int length() {

		int length = 0;

		if (firstPatient == null) {

			return length;

		} else {

			Patient current = firstPatient;

			do {

				length++;
				current = current.getNextPatient();

			} while (current != null);

			return length;

		}


	}

	public void print() {

		Patient current = firstPatient;

			do {

				System.out.println(

					current.getName() + " " +
					current.getAge() + " " +
					current.getIllness()

					);

				current = current.getNextPatient();


			} while (current != null);
	}

}