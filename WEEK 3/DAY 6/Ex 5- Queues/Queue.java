public class Queue {
	
	private int[] queueSpace;
	private int size;
	
	public Queue() {

		queueSpace = new int[10];
		size = 0;
	}

	
	public Queue(int size) {

		queueSpace = new int[size];
		size = 0;
	}

	
	public void insert(int element) {

		System.out.println("Inserting request " + element);

		if (size >= queueSpace.length) {

			System.out.println("The queue is full. Please retrieve an item first.");

		} else {

				queueSpace[size] = element;

				size++;
		}

	}

	public void retrieve() {

		System.out.print("Retrieving request " + queueSpace[0] + " ... ");

		for (int i = 0; i < size;  i++) {

			queueSpace[i] = queueSpace[i+1];
		}

		size--;

		System.out.println("done.");


	}

	public int size() {

		System.out.println("There are " + size + " requests in the queue.");

		return size;

	}

}