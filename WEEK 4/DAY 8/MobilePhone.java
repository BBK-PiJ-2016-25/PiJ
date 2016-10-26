/** 
* The mobile phone is a basic phone with limited additional memmory and media-based functionality
*/

public class MobilePhone extends OldPhone {

	private String[] callHistory = new String[10];
	private int callCounter = 0; // counts the number of numbers stored in the call history
	
	
	public void call(String number) {
		super.call(number);
		addToHistory(number);
	}
	
	public void ringAlarm(String time) {
		System.out.println("Alarm set for " + time + "...");
	}
	
	public void playGame(String name) {
		System.out.println("Playing " + name + "...");
	}
	
	public void printLastNumbers() {
		System.out.println("The last numbers called were: ");
		for(int i=0; i<=9; i++) {
				if(callHistory[i] != null) {
					System.out.println(callHistory[i]);
				} else {
					return;
				}
			}
	}
	
	private void addToHistory(String number) {
		if (callCounter <= 9) {
			callHistory[callCounter] = number;
			callCounter ++;
		} else { 
			for(int i=0; i<9; i++) {
				callHistory[i] = callHistory[i+1];
			} 
			callHistory[9] = number;
		}
	}
}