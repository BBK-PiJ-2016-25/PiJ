
public class Bear extends AnimalImpl implements Mammal {


	public Bear(String name) {
		
		super(name);
	}
	
	public void makeSound() {
	
		growl();
	
	}
	
	private void growl() {
	
		System.out.println("Growl, growl, growl");
	
	}
	
	public void reproduce() {
		
		super.reproduce();
		giveBirth();
		
	}

	public void giveBirth() {
		
		System.out.println(this.getName() + " is giving birth...");
		
	}

} 