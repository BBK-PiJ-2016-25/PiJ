
public class FlyingAnimal extends AnimalImpl{
	
	public FlyingAnimal(String name) {
		
		super(name);
	}
	

	@Override
	public void call() {
		makeSound();
		System.out.println(getName() + " now flying, will come later when tired...");
	}

}