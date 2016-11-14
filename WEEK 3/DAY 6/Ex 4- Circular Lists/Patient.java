
public class Patient {

	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;


	public Patient(String name, int age, String illness) {

		this.name = name;
		this.age = age;
		this.illness = illness;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIllness() {
		return illness;
	}

	public void setIllness(String illness) {
		this.illness = illness;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Patient getNextPatient() {
		return nextPatient;
	}

	public void setNextPatient(Patient nextPatient) {
		this.nextPatient = nextPatient;
	}

}