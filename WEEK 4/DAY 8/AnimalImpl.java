
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
	
	public void reproduce(AnimalImpl mate) {
		System.out.println(name + " and " + mate.getName() + " are making a baby...");
	}
	public void reproduce() {
		System.out.println(name + " is making a baby with an unknown mate...");
	}
	
	public void makeSound() {
		System.out.println(name + " has something to say...");
	}

	public String getName() {
		return name;
	}

}