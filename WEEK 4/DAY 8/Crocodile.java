
public class Crocodile extends AnimalImpl implements NonMammal {

	private int total = 0;

	public Crocodile(String name) {
		
		super(name);
		total++;
	}
	
	public void makeSound() {
	
		snap();
	
	}
	
	private void snap() {
	
		System.out.println("Snap snap snap");
	
	}
	
	public void reproduce() {
		
		super.reproduce();
		layEggs();
		Crocodile babyCat = new Crocodile("Baby Crocodile");
		babyCrocodile.makeSound();
		System.out.println("Welcome to the world, " + babyCrocodile.getName());
		
	}

	public void layEggs() {
		
		System.out.println(this.getName() + " is laying eggs...");
		
	}

	public int getTotal() {

		return total;
	}

} 