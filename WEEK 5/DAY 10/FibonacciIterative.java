public class FibonacciIterative {


	public static void main(String[] args){
		
		System.out.println(fibonacci(8));
		
	}
	
	public static int fibonacci(int n) {
		
		if (n == 0){

			return 0;

		} else {

			int previous = 1;
			int current = 0;
			int next = 0;

			for (int i = 0; i<=n; i++) {
				
				next = current + previous;
				previous = current;
				current = next;

			}

			return previous;
		}
	}

}