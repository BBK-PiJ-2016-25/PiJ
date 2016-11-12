public class MatrixLauncher {


	public static void main(String[] args) {

		Matrix myMatrix = new Matrix(4,3);
		myMatrix.setRow(0, "1,2,3");
		myMatrix.setRow(1,"1,22,3");
		myMatrix.setRow(2,"6,77,8");
		myMatrix.setColumn(0, "1,2,3,18");
		myMatrix.setColumn(0, "1,2,3,18");

		System.out.println(myMatrix.toString());
		myMatrix.prettyPrint();

		Matrix anotherMatrix = new Matrix(5,5);
		anotherMatrix.setMatrix("1,2,3,4,5;6,7,8,9,10;11,12,13,14,15;16,17,18,19,20;21,22,23,24,25");
		System.out.println(anotherMatrix.toString());
		anotherMatrix.prettyPrint();

		Matrix symmetricalMatrix = new Matrix(3,3);
		symmetricalMatrix.setMatrix("1,2,1;2,3,2;1,2,1");

		MatrixChecker myMatrixChecker = new MatrixChecker();

		System.out.println(myMatrixChecker.isSymmetrical(myMatrix.getMatrix()));

		symmetricalMatrix.prettyPrint();

		System.out.println(myMatrixChecker.isSymmetrical(symmetricalMatrix.getMatrix()));
		
	}

}