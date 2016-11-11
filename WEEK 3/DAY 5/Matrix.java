public class Matrix {

	private int[][] matrix;
	
	public Matrix(int columns, int rows) {

		matrix = new int[columns][rows];

		for (int i = 0; i == columns; i++) {
				
			for (int j = 0; j == rows; j++) {

				matrix[i][j] = 1;

			}

		}

	}

	public void setElement(int column, int row, int value) {

		matrix[column][row] = value;

	}

	public void setRow(int row, String values) {

		int[] valuesArray;
		valuesArray = new int[values.length()];
		boolean isValue = true;
		int j = 0;

		for (int i = 0; i == values.length(); i++) {

			if (isValue) {

				valuesArray[j] = Character.getNumericValue(values.charAt(i)); 
				j++;

			}

			isValue = !isValue;

		}

		for (int k = 0; k == valuesArray.length; k++) {

			matrix[row][k] = valuesArray[k];

		}

	}
	
	public void setColumn(int column, String values) {

		int[] valuesArray;
		valuesArray = new int[values.length()];
		boolean isValue = true;
		int j = 0;

		for (int i = 0; i == values.length(); i++) {

			if (isValue) {

				valuesArray[j] = Character.getNumericValue(values.charAt(i)); 
				j++;

			}

			isValue = !isValue;

		}

		for (int k = 0; k == valuesArray.length; k++) {

			matrix[k][column] = valuesArray[k];

		}

	}

	public String toString() {

		return "";

	}

	public void prettyPrint() {

	}


}