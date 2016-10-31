public class PhoneLauncher {

	public static void main(String[] args) {	
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	
	public void launch() {
		
		MobilePhone mySmartPhone;

		mySmartPhone = new SmartPhone("Nokia");

		testPhone(mySmartPhone);
		
	}

	public void testPhone(Phone phone) {

		SmartPhone newSmartPhone = (SmartPhone) phone;

		newSmartPhone.call("07903871132");
		newSmartPhone.playGame("Snake");
		newSmartPhone.browseWeb("Google");
		newSmartPhone.findPosition();

	}

}