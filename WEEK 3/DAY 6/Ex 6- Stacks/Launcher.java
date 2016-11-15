public class Launcher {
	
	public static void main(String[] args) {

		Launcher launcher = new Launcher();

		launcher.launch();

	}

	private void launch() {

		Stack myStack = new Stack();

		myStack.push(5);
		System.out.println(myStack.getStackSpace()[0]);
		System.out.println(myStack.getStackSpace()[1]);
		System.out.println(myStack.getStackSpace()[2]);
		System.out.println(myStack.getStackSpace()[3]);
		System.out.println(myStack.getStackSpace()[4]);
		myStack.push(8);
		System.out.println(myStack.getStackSpace()[0]);
		System.out.println(myStack.getStackSpace()[1]);
		System.out.println(myStack.getStackSpace()[2]);
		System.out.println(myStack.getStackSpace()[3]);
		System.out.println(myStack.getStackSpace()[4]);
		myStack.push(12);
		System.out.println(myStack.getStackSpace()[0]);
		System.out.println(myStack.getStackSpace()[1]);
		System.out.println(myStack.getStackSpace()[2]);
		System.out.println(myStack.getStackSpace()[3]);
		System.out.println(myStack.getStackSpace()[4]);
		myStack.pop();
		System.out.println(myStack.getStackSpace()[0]);
		System.out.println(myStack.getStackSpace()[1]);
		System.out.println(myStack.getStackSpace()[2]);
		System.out.println(myStack.getStackSpace()[3]);
		System.out.println(myStack.getStackSpace()[4]);
		myStack.push(13);
		System.out.println(myStack.getStackSpace()[0]);
		System.out.println(myStack.getStackSpace()[1]);
		System.out.println(myStack.getStackSpace()[2]);
		System.out.println(myStack.getStackSpace()[3]);
		System.out.println(myStack.getStackSpace()[4]);	
		myStack.pop();
		System.out.println(myStack.getStackSpace()[0]);
		System.out.println(myStack.getStackSpace()[1]);
		System.out.println(myStack.getStackSpace()[2]);
		System.out.println(myStack.getStackSpace()[3]);
		System.out.println(myStack.getStackSpace()[4]);
		myStack.pop();
		System.out.println(myStack.getStackSpace()[0]);
		System.out.println(myStack.getStackSpace()[1]);
		System.out.println(myStack.getStackSpace()[2]);
		System.out.println(myStack.getStackSpace()[3]);
		System.out.println(myStack.getStackSpace()[4]);
		myStack.pop();
		myStack.pop();
		myStack.pop();
		myStack.empty();

	}

}