
public class AnimalImpl implements Animal {

	
	private String name;
	
	public AnimalImpl() {		
		this.name = "Unknown";
	}
	
	public AnimalImpl(String name) {	
		this.name = name;
	}
	
	public void call() {
		makeSound();
		System.out.println(name + " coming...");
	}
	
	public void reproduce() {
		System.out.println(name + " is making a baby...");
	}
	
	public void makeSound() {
		System.out.println(name + " has something to say...");
	}

	public String getName() {
		return name;
	}
	
}