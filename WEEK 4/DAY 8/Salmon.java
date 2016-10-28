
public class Salmon extends AquaticAnimal implements NonMammal {

	private int total = 0;

	public Salmon(String name) {
		
		super(name);
		total++;
	}
	
	public void makeSound() {
	
		bubble();
	
	}
	
	private void bubble() {
	
		System.out.println("Bubble bubble bubble");
	
	}
	
	public void reproduce() {
		
		super.reproduce();
		layEggs();
		Frog babyFrog = new Frog("Baby Frog");
		babyFrog.makeSound();
		System.out.println("Welcome to the world, " + babyFrog.getName());
		
	}

	public void layEggs() {
		
		System.out.println(this.getName() + " is laying eggs...");
		
	}

	public int getTotal() {

		return total;
	}

} 