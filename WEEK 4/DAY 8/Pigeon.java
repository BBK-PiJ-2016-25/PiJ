
public class Pigeon extends FlyingAnimal implements NonMammal {

	private int total = 0;

	public Pigeon(String name) {
		
		super(name);
		total++;
	}
	
	public void makeSound() {
	
		coo();
	
	}
	
	private void coo() {
	
		System.out.println("Coo coo cooo! Coo coo");
	
	}
	
	public void reproduce() {
		
		super.reproduce();
		layEggs();
		Pigeon babyPigeon = new Pigeon("Baby Pigeon");
		babyPigeon.makeSound();
		System.out.println("Welcome to the world, " + babyPigeon.getName());
		
	}

	public void layEggs() {
		
		System.out.println(this.getName() + " is laying eggs...");
		
	}

	public int getTotal() {

		return total;
	}

} 