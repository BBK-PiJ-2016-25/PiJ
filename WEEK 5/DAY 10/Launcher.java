public class Launcher {


	public static void main(String[] args){
		
		System.out.println(buggyMethod(11));
		
	}
	
	public static String buggyMethod(int n) {
		
		if (n <= 0) {
			return "";
		}
		
		return n + " " + buggyMethod(n - 2);
	}

}