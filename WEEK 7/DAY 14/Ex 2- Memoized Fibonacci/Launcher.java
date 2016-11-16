public class Launcher {
	
	public static void main(String[] args) {

		Launcher launcher = new Launcher();
		launcher.launch();

	}

	private void launch() {

		Fibonacci fib = new Fibonacci();

		fib.timeAndPrint(true, 40);

		fib.timeAndPrint(false,40);

		fib.timeAndPrint(true, 45);

		fib.timeAndPrint(false,45);

	}

}