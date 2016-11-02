public class FactorialIterative {


	public static void main(String[] args){
		
		System.out.println(factorial(8));
		
	}
	
	public static int factorial(int n) {
		
		int total = 1;

		for (int i = 1; i<=n; i++) {
			total *= i;
		}

		return total;
	}

}