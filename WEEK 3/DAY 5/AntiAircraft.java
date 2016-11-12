import java.util.Scanner;

public class AntiAircraft {


	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Target target = new Target(10);

		int row = 0;
		int column = 0;
		int layer = 0;

		target.init();

		System.out.println("Here they come! Try to bring the plane down!");
		

		do {

			System.out.println("Enter an X coordinate:");
			row = scan.nextInt();
			
			System.out.println("Enter a Y coordinate:");
			column = scan.nextInt();

			System.out.println("Enter a Z coordinate:");
			layer = scan.nextInt();

			switch (target.fire(row,column,layer)) {

				case OUT_OF_RANGE: 	System.out.println("That shot is out of range. Try harder!");
									break;

				case HIT: 			System.out.println("You hit it! Well done!");
									break;

				case FAIL_LEFT: 	System.out.println("You missed! The target is to the right!");
									break;

				case FAIL_RIGHT: 	System.out.println("You missed! The target is to the left!");
									break;

				case FAIL_LOW: 		System.out.println("You missed! The target is higher!");
									break;

				case FAIL_HIGH: 	System.out.println("You missed! The target is lower!");
									break;

				case FAIL_SHORT: 	System.out.println("You missed! The target is further away!");
									break;

				case FAIL_LONG: 	System.out.println("You missed! The target is closer!");
									break;

				default:			System.out.println("Something's gone wrong here! Sort it out Annie");

			}

		} while (target.fire(row,column,layer) != Result.HIT);



	}



}