public class DoublyLinkedList {
	
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
			current.getNextPatient().setLastPatient(current);
			current = current.getNextPatient();
		}

		current.setNextPatient(newPatient);
		newPatient.setLastPatient(current);
	}

	public boolean deletePatient(String name) {
		
		if (firstPatient == null) {
			return false;
		}

		if (firstPatient.getName().equals(name)) {
			firstPatient = firstPatient.getNextPatient();
			firstPatient.setLastPatient(null);
			return true;
		}

		Patient current = firstPatient;
		while (current.getNextPatient() != null) {
			if (current.getNextPatient().getName().equals(name)) {
				current.setNextPatient(current.getNextPatient().getNextPatient());
				current.getNextPatient().setLastPatient(current);
				return true;
			}
			current = current.getNextPatient();
		}

		return false;
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