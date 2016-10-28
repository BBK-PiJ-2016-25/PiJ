
public class Frog extends AquaticAnimal implements NonMammal {

	private int total = 0;

	public Frog(String name) {
		
		super(name);
		total++;
	}
	
	public void makeSound() {
	
		croak();
	
	}
	
	private void croak() {
	
		System.out.println("Croak croak ribbett ribbett");
	
	}
	
	public void reproduce() {
		
		super.reproduce();
		giveBirth();
		Frog babyFrog = new Frog("Baby Frog");
		babyFrog.makeSound();
		System.out.println("Welcome to the world, " + babyFrog.getName());
		
	}

	public void laysEggs() {
		
		System.out.println(this.getName() + " is laying eggs...");
		
	}

	public int getTotal() {

		return total;
	}

} 