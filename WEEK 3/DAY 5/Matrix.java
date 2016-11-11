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

	
	

}