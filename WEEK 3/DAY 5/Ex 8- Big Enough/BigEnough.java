import java.util.Scanner;

public class BigEnough {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int id = 0;
		String name = "";
		int counter = 0;

		EmployeeData employeeData = new EmployeeData();

		do {

			if (counter >= employeeData.getIdArray().length) {

				employeeData.enlargeId(counter*2);

			}

			if (counter >= employeeData.getNameArray().length) {

				employeeData.enlargeName(counter*2);

			}


			System.out.println("Please enter an employee ID:");
			id = scan.nextInt();
			scan.nextLine();

			System.out.println("Please enter an employee name:");
			name = scan.nextLine();

			employeeData.getIdArray()[counter] = id;
			employeeData.getNameArray()[counter] = name;

			counter++;



		} while (!(id == 0 || name.length() == 0));

		for (int i = 0; i < employeeData.getIdArray().length; i++) {

			if ((employeeData.getIdArray()[i]!= 0) && ((employeeData.getIdArray()[i]%2 == 0) || (employeeData.getNameArray()[i].charAt(0) == 'S'))) {

				System.out.println(employeeData.getIdArray()[i] + " " + employeeData.getNameArray()[i]);
			}
		}

	}

}