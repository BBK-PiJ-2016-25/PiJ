
public class AquaticAnimal extends AnimalImpl{

	public AquaticAnimal(String name) {
		
		super(name);
	}
	
	
	@Override
	public void call() {
		System.out.println(getName() + " will not come...");
	}

}