
public class Snake extends AnimalImpl implements NonMammal {

	private int total = 0;

	public Lizard(String name) {
		
		super(name);
		total++;
	}
	
	public void makeSound() {
	
		slither();
	
	}
	
	private void hiss() {
	
		System.out.println("Slithery slither slither");
	
	}
	
	public void reproduce() {
		
		super.reproduce();
		layEggs();
		Snake babySnake = new Snake("Baby Snake");
		babySnake.makeSound();
		System.out.println("Welcome to the world, " + babySnake.getName());
		
	}

	public void layEggs() {
		
		System.out.println(this.getName() + " is laying eggs...");
		
	}

	public int getTotal() {

		return total;
	}

} 