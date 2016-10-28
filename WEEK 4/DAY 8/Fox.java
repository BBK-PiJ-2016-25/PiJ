
public class Fox extends AnimalImpl implements Mammal {

	private int total = 0;

	public Fox(String name) {
		
		super(name);
		total++;
	}
	
	public void makeSound() {
	
		ylvis();
	
	}
	
	private void ylvis() {
	
		System.out.println("Wa-pa-pa-pa-pa-pa-pow! Hatee-hatee-hatee-ho!");
	
	}
	
	public void reproduce() {
		
		super.reproduce();
		giveBirth();
		Fox babyDog = new Fox("Baby Fox");
		babyFox.makeSound();
		System.out.println("Welcome to the world, " + babyFox.getName());
		
	}

	public void giveBirth() {
		
		System.out.println(this.getName() + " is giving birth...");
		
	}

	public int getTotal() {

		return total;
	}

} 