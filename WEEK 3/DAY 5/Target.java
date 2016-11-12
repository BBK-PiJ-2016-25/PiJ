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

	public Result fire(int row, int column, int layer) {

		int leftTotal = 0;
		int rightTotal = 0;

		int aboveTotal = 0;
		int belowTotal = 0;

		int behindTotal = 0;
		int inFrontTotal = 0;


		for (int i = 0; i < row; i++) {

			leftTotal += target[i][column][layer];

		}

		for (int i = row; i < target.length; i++) {

			rightTotal += target[i][column][layer];

		}

		for (int j = 0; j < column; j++) {

			aboveTotal += target[row][j][layer];

		}

		for (int j = column; j < target.length; j++) {

			belowTotal += target[row][j][layer];

		}

		for (int k = 0; k < layer; k++) {

			inFrontTotal += target[row][column][k];

		}

		for (int k = layer; k < target.length; k++) {

			behindTotal += target[row][column][k];

		}


		if ((row >= target.length || column >= target.length || layer >= target.length)
		||
		(row < 0 || column < 0 || layer < 0)) {

			return Result.OUT_OF_RANGE;

		} else if (target[row][column][layer] == 1) {

			return Result.HIT;

		} else if (leftTotal < rightTotal) {

			return Result.FAIL_LEFT;

		} else if (rightTotal < leftTotal) {

			return Result.FAIL_RIGHT;

		} else if (belowTotal < aboveTotal) {

			return Result.FAIL_LOW;

		} else if (aboveTotal < belowTotal) {

			return Result.FAIL_HIGH;

		} else if (behindTotal < inFrontTotal) {

			return Result.FAIL_SHORT;

		} else if (inFrontTotal < behindTotal) {

			return Result.FAIL_LONG;
		
		} else {

			return Result.OUT_OF_RANGE;
		}




	}




}