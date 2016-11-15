public class Launcher {
	
	public static void main(String[] args) {

		Launcher launcher = new Launcher();

		launcher.launch();

	}

	private void launch() {

		Queue myQueue = new Queue();

		myQueue.insert(5);
		myQueue.insert(8);
		myQueue.insert(12);
		myQueue.size();
		myQueue.retrieve();
		myQueue.insert(13);
		myQueue.size();
		myQueue.retrieve();
		myQueue.retrieve();
		myQueue.size();

	}

}