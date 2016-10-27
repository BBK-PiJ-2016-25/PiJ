
public class Beetle extends FlyingAnimal implements NonMammal {

	private int total = 0;

	public Beetle(String name) {
		
		super(name);
		total++;
	}
	
	public void makeSound() {
	
		click();
	
	}
	
	private void click() {
	
		System.out.println("Clickety click click click");
	
	}
	
	public void reproduce(AnimalImpl mate) {
		
		super.reproduce(mate);
		layEggs();
		
	}

	public void reproduce() {
		
		super.reproduce();
		layEggs();
		
	}


	public void layEggs() {
		
		System.out.println(this.getName() + " is laying eggs...");
		Beetle babyBeetle = new Beetle("Baby Beetle");
		babyBeetle.makeSound();
		System.out.println("Welcome to the world, " + babyBeetle.getName());
		
	}

	public int getTotal() {

		return total;
	}

} 