public class Calculator {

	public void add(int x, int y) {
		
		int result = x + y;
		System.out.println(x + " + " + y + " = " + result);
	
	}
	
	public void subtract(int x, int y) {
	
		int result = x - y;
		System.out.println(x + " - " + y + " = " + result);
	
	}
	
	public void multiply(int x, int y) {
	
		int result = x * y;
		System.out.println(x + " x " + y + " = " + result);
	
	}
	
	public void divide(int x, int y) {
	
		double result = (double) x / (double) y;
		System.out.println(x + " / " + y + " = " + result);
	
	}
	
	public void modulus(int x, int y) {
	
		int result = x % y;
		System.out.println(x + " % " + y + " = " + result);
	
	}
	


}