import java.util.List;
import java.util.ArrayList;

public class Launcher {	
	public static void main(String[] args) {
		Launcher launcher = new Launcher();
		launcher.launch(5);
	}

	public void launch(int userInput) {
		List<Integer> list = new ArrayList<Integer>();	
		try {
			list.add(userInput);
		} catch (IndexOutOfBoundsException ex) {
			ex.printStackTrace();
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		}
	}
}