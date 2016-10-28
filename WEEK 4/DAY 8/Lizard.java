
public class Lizard extends AnimalImpl implements NonMammal {

	private int total = 0;

	public Lizard(String name) {
		
		super(name);
		total++;
	}
	
	public void makeSound() {
	
		hiss();
	
	}
	
	private void hiss() {
	
		System.out.println("Sssss ssss hissss");
	
	}
	
	public void reproduce() {
		
		super.reproduce();
		layEggs();
		Lizard babyLizard = new Lizard("Baby Lizard");
		babyLizard.makeSound();
		System.out.println("Welcome to the world, " + babyLizard.getName());
		
	}

	public void layEggs() {
		
		System.out.println(this.getName() + " is laying eggs...");
		
	}

	public int getTotal() {

		return total;
	}

} 