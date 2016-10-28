public class BoatLauncher {
	
	
	public static void main(String[] args) {

		BoatLauncher noahsArk = new BoatLauncher();
		noahsArk.castOff();
		/*
		noahsArk.voyage();
		noahsArk.dock;
		*/
	}
	
	private boolean departed = false;
	
	
	public void castOff() {
		
		Bear mrBear = new Bear("Mr Bear");
		Bear mrsBear = new Bear("Mrs Bear");
		
		Beetle mrBeetle = new Beetle("Mr Beetle");
		Beetle mrsBeetle = new Beetle("Mrs Beetle");
	
		Cat mrCat = new Cat("Mr Cat");
		Cat mrsCat = new Cat("Mrs Cat");
		
		Crocodile mrCrocodile = new Crocodile("Mr Crocodile");
		Crocodile mrsCrocodile = new Crocodile("Mrs Crocodile");

		Dog mrDog = new Dog("Mr Dog");
		Dog mrsDog = new Dog("Mrs Dog");
		
		Dolphin mrDolphin = new Dolphin("Mr Dolphin");
		Dolphin mrsDolphin = new Dolphin("Mrs Dolphin");
		
		Fly mrFly = new Fly("Mr Fly");
		Fly mrsFly = new Fly("Mrs Fly");

		Fox mrFox = new Fox("Mr Fox");
		Fox mrsFox = new Fox("Mrs Fox");
		
		Frog mrFrog = new Frog("Mr Frog");
		Frog mrsFrog = new Frog("Mrs Frog");
	
		Lizard mrLizard = new Lizard("Mr Lizard");
		Lizard mrsLizard = new Lizard("Mrs Lizard");

		Monkey mrMonkey = new Monkey("Mr Monkey");
		Monkey mrsMonkey = new Monkey("Mrs Monkey");

		Pigeon mrPigeon = new Pigeon("Mr Pigeon");
		Pigeon mrsPigeon = new Pigeon("Mrs Pigeon");

		Salmon mrSalmon = new Salmon("Mr Salmon");
		Salmon mrsSalmon = new Salmon("Mrs Salmon");
		
		Shark mrShark = new Shark("Mr Shark");
		Shark mrsShark = new Shark("Mrs Shark");
		
		Snake mrSnake = new Snake("Mr Snake");
		Snake mrsSnake = new Snake("Mrs Snake");
		
		Whale mrWhale = new Whale("Mr Whale");
		Whale mrsWhale = new Whale("Mrs Whale");
		

		mrBear.call();
		mrsBear.call();
		
		mrBeetle.call();
		mrsBeetle.call();
		
		mrCat.call();
		mrsCat.call();
		
		mrCrocodile.call();
		mrsCrocodile.call();
		
		mrDog.call();
		mrsDog.call();
		
		mrDolphin.call();
		mrsDolphin.call();
		
		mrFly.call();
		mrsFly.call();

		mrFox.call();
		mrsFox.call();

		mrFrog.call();
		mrsFrog.call();
		
		mrLizard.call();
		mrsLizard.call();

		mrMonkey.call();
		mrsMonkey.call();
		
		mrPigeon.call();
		mrsPigeon.call();

		mrSalmon.call();
		mrsSalmon.call();

		mrShark.call();
		mrsShark.call();

		mrSnake.call();
		mrsSnake.call();

		mrWhale.call();
		mrsWhale.call();
		
		departed = true;
	}

/*
	public void voyage() {

		Unicorn mrUnicorn = new Unicorn("Mr Unicorn");
		Beetle mrsUnicorn = new Beetle("Mrs Unicorn");

		Raven mrRaven = new Raven("Mr Raven");
		Dove firstDove = new Dove("First Dove");
		Dove secondDove = new Dove("Second Dove");
		
		mrRaven.call();

		firstDove.call();
		firstDove.call();

	}

	public void dock() {

		mrsBear.reproduce();
		mrsBeetle.reproduce();

	}
*/


}