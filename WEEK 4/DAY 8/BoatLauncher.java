public class BoatLauncher {
	
	
	public static void main(String[] args) {

		BoatLauncher noahsArk = new BoatLauncher();
		noahsArk.castOff();
		
	}
	
	private boolean departed = false;
	
	public enum Gender {
    MALE, UNKNOWN
	}
	
	public void castOff() {
		
		Bear mrBear = new Bear("Mr Bear");
		Bear mrsBear = new Bear("Mrs Bear");
		
		/** Beetle mrBeetle = new Beetle("Mr Beetle");
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
		Snake mrsWhale = new Whale("Mrs Whale");
		
		*/
		mrBear.call();
		mrsBear.call();
		/** Beetle.call();
		Cat.call();
		Crocodile.call();
		Dog.call();
		Dolphin.call();
		Fly.call();
		Fox.call();
		Frog.call();
		Lizard.call();
		Monkey.call();
		Pigeon.call();
		Salmon.call();
		Shark.call();
		Snake.call();
		Whale.call();
		*/
		departed = true;
	}


}