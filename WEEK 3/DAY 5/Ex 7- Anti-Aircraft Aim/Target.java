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

	public int[][][] getTarget() {

		return target;
	}


	public void init() {

		for (int i = 0; i < target.length; i++) {
				
			for (int j = 0; j < target.length; j++) {

				for (int k = 0; k < target.length; k++) {

				target[i][j][k] = 0;

				}

			}
		}

		int rowToGuess =  (int) Math.abs(target.length * Math.random());
		int columnToGuess = (int) Math.abs(target.length * Math.random());
		int layerToGuess = (int) Math.abs(target.length * Math.random());

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

			for (int j = 0; j < target.length; j++) {

				for (int k = 0; k < target.length; k++) {

					leftTotal += target[i][j][k];
					// assigns the sum of all numbers to the left of the guessed coordinate

				}
			}

		}

		for (int i = row+1; i < target.length; i++) {

			for (int j = 0; j < target.length; j++) {

				for (int k = 0; k < target.length; k++) {

					rightTotal += target[i][j][k];
					 // assigns the sum of all numbers to the right of the guessed coordinate

				}
			}

		}

		for (int j = 0; j < column; j++) {

			for (int i = 0; i < target.length; i++) {

				for (int k = 0; k < target.length; k++) {

					aboveTotal += target[i][j][k];
					// assigns the sum of all numbers above the guessed coordinate (taking the column/y axis as a height dimension)

				}
			}

		}

		for (int j = column+1; j < target.length; j++) {

			for (int i = 0; i < target.length; i++) {

				for (int k = 0; k < target.length; k++) {

					belowTotal += target[i][j][k];
					// assigns the sum of all numbers below the guessed coordinate (taking the column/y axis as a height dimension)

				}
			}

		}

		for (int k = 0; k < layer; k++) {

			for (int i = 0; i < target.length; i++) {

				for (int j = 0; j < target.length; j++) {

					inFrontTotal += target[i][j][k];
					// assigns the sum of all numbers in front of the guessed coordinate (taking the layer/z axis as a depth dimension)

				}
			}

		}

		for (int k = layer+1; k < target.length; k++) {

			for (int i = 0; i < target.length; i++) {

				for (int j = 0; j < target.length; j++) {

					behindTotal += target[i][j][k];
					// assigns the sum of all numbers behind of the guessed coordinate (taking the layer/z axis as a depth dimension)

				}
			}

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

			return Result.FAIL_HIGH; 

		} else if (aboveTotal < belowTotal) {

			return Result.FAIL_LOW;

		} else if (behindTotal < inFrontTotal) {

			return Result.FAIL_LONG;

		} else if (inFrontTotal < behindTotal) {

			return Result.FAIL_SHORT;
		
		} else {

			return Result.OUT_OF_RANGE;
		}

	}




}