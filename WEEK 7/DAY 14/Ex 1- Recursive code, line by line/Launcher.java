public class Launcher {
	
	public static void main(String[] args) {

		Launcher launcher = new Launcher();

		System.out.println("Starting with n value of 50..");
		System.out.println(launcher.mcCarthy91(50));
		System.out.println("");

		System.out.println("Starting with n value of 73..");
		System.out.println(launcher.mcCarthy91(73));
		System.out.println("");

		System.out.println("Starting with n value of 95..");
		System.out.println(launcher.mcCarthy91(95));
		System.out.println("");
	}

	public int mcCarthy91(int n) {
		System.out.println("Calling with value " + n);
		if (n > 100) {
			return n - 10;
		} else {
			return mcCarthy91(mcCarthy91(n+11));
		}
	}

}
