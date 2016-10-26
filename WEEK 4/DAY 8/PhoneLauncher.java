public class PhoneLauncher {

	public static void main(String[] args) {	
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	
	public void launch() {
		
		SmartPhone mySmartPhone = new SmartPhone("Nokia");
		
		System.out.println(mySmartPhone.getBrand());
		mySmartPhone.call("07903871132");
		mySmartPhone.call("07976899745");
		mySmartPhone.printLastNumbers();
		mySmartPhone.ringAlarm("9.30 am");
		mySmartPhone.playGame("Snake");
		mySmartPhone.findPosition();
		mySmartPhone.browseWeb("Google");
		mySmartPhone.call("07903871132");
		mySmartPhone.call("07976899745");
		mySmartPhone.call("07903871132");
		mySmartPhone.call("07976899745");
		mySmartPhone.call("07903871132");
		mySmartPhone.call("07976899745");
		mySmartPhone.call("07903871132");
		mySmartPhone.call("07976899745");
		mySmartPhone.printLastNumbers();
		mySmartPhone.call("07901010101");
		mySmartPhone.printLastNumbers();
		mySmartPhone.call("00447901010101");

	}

}