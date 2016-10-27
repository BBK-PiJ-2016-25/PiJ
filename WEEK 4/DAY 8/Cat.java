
public class Cat extends AnimalImpl implements Mammal {

	private int total = 0;

	public Cat(String name) {
		
		super(name);
		total++;
	}
	
	public void makeSound() {
	
		meow();
	
	}
	
	private void meow() {
	
		System.out.println("Meowwww, meow!");
	
	}
	
	public void reproduce() {
		
		super.reproduce();
		giveBirth();
		Cat babyCat = new Cat("Baby Cat");
		babyCat.makeSound();
		System.out.println("Welcome to the world, " + babyCat.getName());
		
	}

	public void giveBirth() {
		
		System.out.println(this.getName() + " is giving birth...");
		
	}

	public int getTotal() {

		return total;
	}

} 