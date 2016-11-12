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

		String[] valuesArray;
		valuesArray = values.split(",");

		for (int i = 0; i < valuesArray.length; i++) {

			matrix[row][i] = Integer.parseInt(valuesArray[i]);

		}

	}
	
	public void setColumn(int column, String values) {

		String[] valuesArray;
		valuesArray = values.split(",");

		for (int i = 0; i < valuesArray.length; i++) {

			matrix[i][column] = Integer.parseInt(valuesArray[i]);

		}

	}

	public void setMatrix(String values) {

		String[] rowsArray;
		rowsArray = values.split(";");

		for (int i = 0; i < rowsArray.length; i++) {

			setRow(i, rowsArray[i]);

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