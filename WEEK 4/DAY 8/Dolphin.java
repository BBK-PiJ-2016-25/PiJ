
public class Dolphin extends AquaticAnimal implements Mammal {

	private int total = 0;

	public Dolphin(String name) {
		
		super(name);
		total++;
	}
	
	public void makeSound() {
	
		whistle();
	
	}
	
	private void whistle() {
	
		System.out.println("Whistle whistle whistle");
	
	}
	
	public void reproduce(AnimalImpl mate) {
		
		super.reproduce(mate);
		giveBirth();
		
	}

	public void reproduce() {
		
		super.reproduce();
		giveBirth();
		
	}

	public void giveBirth() {
		
		System.out.println(this.getName() + " is giving birth...");
		Dolphin babyDolphin = new Dolphin("Baby Dolphin");
		babyDolphin.makeSound();
		System.out.println("Welcome to the world, " + babyDolphin.getName());
		
	}

	public int getTotal() {

		return total;
	}

} 