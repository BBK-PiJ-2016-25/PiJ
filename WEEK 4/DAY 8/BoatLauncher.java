public class BoatLauncher {
	
	
	public static void main(String[] args) {

		BoatLauncher noahsArk = new BoatLauncher();
		noahsArk.castOff();
	}
	
	public void castOff() {

		System.out.println("The Ark is casting off...");
		
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


		mrsBear.reproduce(mrBear);
	
		mrsBeetle.reproduce(mrBeetle);

		mrsCat.reproduce(mrCat);
		
		mrsCrocodile.reproduce(mrCrocodile);
		
		mrsDog.reproduce(mrDog);
		
		mrsDolphin.reproduce(mrDolphin);
		
		mrsFly.reproduce(mrFly);

		mrsFox.reproduce(mrFox);

		mrsFrog.reproduce(mrFrog);
		
		mrsLizard.reproduce(mrLizard);

		mrsMonkey.reproduce(mrMonkey);

		mrsPigeon.reproduce(mrPigeon);

		mrsSalmon.reproduce(mrSalmon);

		mrsShark.reproduce(mrShark);

		mrsSnake.reproduce(mrSnake);

		mrsWhale.reproduce(mrWhale);

	}


}