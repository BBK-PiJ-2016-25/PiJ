public class Target {
	

	private int[][][] target;
	
	public Target(int size) {

		target = new int[size][size][size];

		for (int i = 0; i < size; i++) {
				
			for (int j = 0; j < size; j++) {

				for (int k = 0; k < size; k++) {

				target[i][j][k] = 0;

				}

			}
		}
	}

	public void init() {


	}


}