import java.util.Scanner;
import java.util.InputMismatchException;
public class Launcher {
	
	public static void main(String[] args) {
		Launcher launcher = new Launcher();
		launcher.launch();
	}

	public void launch() {
		Scanner scan = new Scanner(System.in);
		int total = 0;
		int userInput = 0;
		System.out.println("Please enter 10 numbers");
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter a number :");
			try {
				userInput = scan.nextInt();
			} catch (InputMismatchException ex) {
				System.out.println("Not recognised as a number. Please reenter using only your number keys.");
				scan.next();
				i--;
			}
			total += userInput;
		}
		double average = (double) total/10;
		System.out.println("The average of the numbers entered was: " + average);
	}
}