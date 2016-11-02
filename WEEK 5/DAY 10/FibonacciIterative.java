public class FibonacciIterative {


	public static void main(String[] args){
		
		System.out.println(fibonacci(8));
		
	}
	
	public static int fibonacci(int n) {
		
		if (n == 0){

			return 0;

		} else {

			int x = 0;
			int y = 1;
			int z = 0;

			for (int i = 0; i<=n; i++) {
				
				x = z + y;
				y = z;
				z = x;

			}

			return y;
		}
	}

}