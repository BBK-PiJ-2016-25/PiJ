
public class Fly extends FlyingAnimal implements NonMammal {

	private int total = 0;

	public Fly(String name) {
		
		super(name);
		total++;
	}
	
	public void makeSound() {
	
		buzz();
	
	}
	
	private void buzz() {
	
		System.out.println("Bzzzzzzzz Bzzz bzzz");
	
	}
	
	public void reproduce() {
		
		super.reproduce();
		giveBirth();
		Fly babyFly = new Fly("Baby Fly");
		babyFly.makeSound();
		System.out.println("Welcome to the world, " + babyFly.getName());
		
	}

	public void laysEggs() {
		
		System.out.println(this.getName() + " is laying eggs...");
		
	}

	public int getTotal() {

		return total;
	}

} 