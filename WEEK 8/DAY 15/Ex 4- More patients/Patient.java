public class Patient {
	
	private String name;
	private int yearOfBirth;

	public Patient(String name, int yearOfBirth) throws IllegalArgumentException {
		if (2016-yearOfBirth > 130) {
			throw new IllegalArgumentException();
		}
		this.name = name;
		this.yearOfBirth = yearOfBirth;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

}