import java.util.List;
import java.util.ArrayList;

public class HailstoneLauncher {

	private ArrayList<Integer> hailstoneList = new ArrayList<Integer>();
	
	public static void main(String[] args) {

		HailstoneLauncher launcher = new HailstoneLauncher();

		System.out.println(launcher.hailstone(200));

	}	

	private ArrayList<Integer> hailstone(int n) {

		if (n == 1) {
			return hailstoneList;
		} else if (n%2 == 0) {
			int item = n/2;
			hailstoneList.add(item);
			hailstone(item);
			return hailstoneList;
		} else {
			int item = (3*n)+1;
			hailstoneList.add(item);
			hailstone(item);
			return hailstoneList;
		}

	}


}
