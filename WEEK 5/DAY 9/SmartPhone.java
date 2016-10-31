/** 
* The smart phone is a complex phone with internet and GPS connectivity
*/

public class SmartPhone extends MobilePhone {

	public SmartPhone(String brand) {
		super(brand);	
	}
	
	@Override
	public void call(String number) {
		String numberPrefix = number.substring(0,2);
		if(numberPrefix.equals("00")) {
			System.out.println("Calling " + number + " via the internet to save money...");
		} else {
			super.call(number);
		}
	}
	
	public void playGame(String name) {
		System.out.println("Playing " + name + "...");
	}
	
	public void browseWeb(String website) {
		System.out.println("Launching " + website + " in browser...");
	}
	
	
	public int findPosition() {
		int position = 100;
		System.out.println("Your position is " + position + "...");
		return position;
	}

}