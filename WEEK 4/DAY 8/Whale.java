
public class Whale extends AquaticAnimal implements Mammal {

	private int total = 0;

	public Whale(String name) {
		
		super(name);
		total++;
	}
	
	public void makeSound() {
	
		whale();
	
	}
	
	private void whale() {
	
		System.out.println("Wooooaeaeeeeooooooo");
	
	}
	
	public void reproduce() {
		
		super.reproduce();
		giveBirth();
		Whale babyWhale = new Whale("Baby Whale");
		babyWhale.makeSound();
		System.out.println("Welcome to the world, " + babyWhale.getName());
		
	}

	public void giveBirth() {
		
		System.out.println(this.getName() + " is giving birth...");
		
	}

	public int getTotal() {

		return total;
	}

} 