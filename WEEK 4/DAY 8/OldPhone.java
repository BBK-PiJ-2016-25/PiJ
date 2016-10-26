/** 
* The old phone is a basic phone that simply makes calls
*/

public class OldPhone implements Phone {
	/**
	* Just prints on the screen: "Calling <number>...".
	*/
	public void call(String number) {
		System.out.println("Calling " + number + " ...");
	}
}