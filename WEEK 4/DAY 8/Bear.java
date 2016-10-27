
public class Bear extends AnimalImpl implements Mammal {

	private int total = 0;

	public Bear(String name) {
		
		super(name);
		total++;
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
		Bear babyBear = new Bear("Baby Bear");
		babyBear.makeSound();
		System.out.println("Welcome to the world, " + babyBear.getName());
		
	}

	public void giveBirth() {
		
		System.out.println(this.getName() + " is giving birth...");
		
	}

	public int getTotal() {

		return total;
	}

} 