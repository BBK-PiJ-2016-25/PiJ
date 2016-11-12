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

		for (int i = 0; i < target.length; i++) {
				
			for (int j = 0; j < target.length; j++) {

				for (int k = 0; k < target.length; k++) {

				target[i][j][k] = 0;

				}

			}
		}

		int rowToGuess =  (int) Math.abs(target.length+1 * Math.random());
		int columnToGuess = (int) Math.abs(target.length+1 * Math.random());
		int layerToGuess = (int) Math.abs(target.length+1 * Math.random());

		target[rowToGuess][columnToGuess][layerToGuess] = 1;


	}


}