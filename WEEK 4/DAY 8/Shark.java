
public class Shark extends AquaticAnimal implements NonMammal {

	private int total = 0;

	public Salmon(String name) {
		
		super(name);
		total++;
	}
	
	public void makeSound() {
	
		chomp();
	
	}
	
	private void bubble() {
	
		System.out.println("Chomp chomp... chomp chomp...");
	
	}
	
	public void reproduce() {
		
		super.reproduce();
		layEggs();
		Shark babyShark = new Shark("Baby Shark");
		babyShark.makeSound();
		System.out.println("Welcome to the world, " + babyShark.getName());
		
	}

	public void layEggs() {
		
		System.out.println(this.getName() + " is laying eggs...");
		
	}

	public int getTotal() {

		return total;
	}

} 