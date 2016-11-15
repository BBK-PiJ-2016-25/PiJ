public class Stack {

	private int[] stackSpace;
	private int size;

	public Stack() {

		stackSpace = new int[10];
		size = 0;
	}

	
	public Stack(int size) {

		stackSpace = new int[size];
		size = 0;
	}

	public int[] getStackSpace() {

		return stackSpace;
	}

	
	public void push(int element) {

		System.out.println("Pushing " + element + " ... ");

		for (int i = 0; i < size;  i++) {

			stackSpace[i+1] = stackSpace[i];
		}

		stackSpace[0] = element;

		size++;
	}

	public void pop () {

		System.out.println("Popping.. it's a " + stackSpace[0]);

		for (int i = 0; i < size;  i++) {

			stackSpace[i] = stackSpace[i+1];
		}

		size--;

	}

	public boolean empty() {

		if (size == 0) {

			System.out.println("Stack is empty");
			return true;
		} else {

			return false;
		} 


	}

}