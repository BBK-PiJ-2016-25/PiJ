
public class Monkey extends AnimalImpl implements Mammal {

	private int total = 0;

	public Monkey(String name) {
		
		super(name);
		total++;
	}
	
	public void makeSound() {
	
		chatter();
	
	}
	
	private void chatter() {
	
		System.out.println("Ooo ooo oooo eeeeee ee eee");
	
	}
	
	public void reproduce() {
		
		super.reproduce();
		giveBirth();
		Dog babyMonkey = new Monkey("Baby Monkey");
		babyMonkey.makeSound();
		System.out.println("Welcome to the world, " + babyMonkey.getName());
		
	}

	public void giveBirth() {
		
		System.out.println(this.getName() + " is giving birth...");
		
	}

	public int getTotal() {

		return total;
	}

} 