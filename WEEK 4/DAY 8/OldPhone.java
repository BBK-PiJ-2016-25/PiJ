/** 
* The old phone is a basic phone that simply makes calls
*/

public class OldPhone implements Phone {

	private String brand = null;
		
	/**
	* Just prints on the screen: "Calling <number>...".
	*/
	public void call(String number) {
		System.out.println("Calling " + number + " ...");
	}
	
	public OldPhone(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}
	
	// ... there is no setter for brand
}