public class Matrix {

	private int[][] matrix;
	
	public Matrix(int rows, int columns) {

		matrix = new int[rows][columns];

		for (int i = 0; i < rows; i++) {
				
			for (int j = 0; j < columns; j++) {

				matrix[i][j] = 1;

			}

		}

	}

	public void setElement(int column, int row, int value) {

		matrix[column][row] = value;

	}

	public void setRow(int row, String values) {

		int[] valuesArray;
		valuesArray = new int[(values.length()/2)+1];
		boolean isValue = true;
		int j = 0;

		for (int i = 0; i < values.length(); i++) {

			if (isValue) {

				valuesArray[j] = Character.getNumericValue(values.charAt(i)); 
				j++;

			}

			isValue = !isValue;

		}

		for (int k = 0; k < valuesArray.length; k++) {

			matrix[row][k] = valuesArray[k];

		}

	}
	
	public void setColumn(int column, String values) {

		int[] valuesArray;
		valuesArray = new int[values.length()];
		boolean isValue = true;
		int j = 0;

		for (int i = 0; i < values.length(); i++) {

			if (isValue) {

				valuesArray[j] = Character.getNumericValue(values.charAt(i)); 
				j++;

			}

			isValue = !isValue;

		}

		for (int k = 0; k < valuesArray.length; k++) {

			matrix[k][column] = valuesArray[k];

		}

	}

	public String toString() {

		String str = "[";

		for (int i = 0; i < matrix.length; i++) {


			for (int j = 0; j < matrix[0].length; j++) {
			
				str+= matrix[i][j];

				if (j < matrix[0].length-1) {
				
				str+= ",";
				
				}
			
			}

			if (i < matrix.length-1) {
				
				str += ";";
				
			}

		}

		str +="]";

		return str;

	}

	public void prettyPrint() {


		for (int i = 0; i < matrix.length; i++) {


			for (int j = 0; j < matrix[0].length; j++) {
			
				System.out.print(matrix[i][j] + "\t");
			
			}

			System.out.println("");

		}

	}


}