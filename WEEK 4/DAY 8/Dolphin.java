
public class Dolphin extends AquaticAnimal implements Mammal {

	private int total = 0;

	public Dolphin(String name) {
		
		super(name);
		total++;
	}
	
	public void makeSound() {
	
		bark();
	
	}
	
	private void bark() {
	
		System.out.println("Ruff ruff ruff!!");
	
	}
	
	public void reproduce() {
		
		super.reproduce();
		giveBirth();
		Dog babyDog = new Dog("Baby Dog");
		babyDog.makeSound();
		System.out.println("Welcome to the world, " + babyDog.getName());
		
	}

	public void giveBirth() {
		
		System.out.println(this.getName() + " is giving birth...");
		
	}

	public int getTotal() {

		return total;
	}

} 