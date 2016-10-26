/** 
* The restricted smart phone is the same as the smart phone, but does not allow playing games
* This exercise proves that you can't assign weaker access priveleges in a descendant class 
*/

public class RestrictedSmartPhone extends SmartPhone {
	
	public RestrictedSmartPhone(String brand) {
		super(brand);	
	}
	
	@Override
	private void playGame(String name) {
		System.out.println("Gameplay not enabled- you cannot play " + name);
	}
	

}