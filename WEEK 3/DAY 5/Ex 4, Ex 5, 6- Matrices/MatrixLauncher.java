public class MatrixLauncher {


	public static void main(String[] args) {
		

		Matrix symmetricalMatrix = new Matrix(3,3);
		symmetricalMatrix.setMatrix("1,2,1;2,3,2;1,2,1");

		Matrix triangularMatrix = new Matrix(3,3);
		triangularMatrix.setMatrix("1,0,0;1,1,0;1,1,1");

		Matrix biggerTriangularMatrix = new Matrix(5,5);
		biggerTriangularMatrix.setMatrix("1,0,0,0,0;1,1,0,0,0;1,1,1,0,0;1,1,1,1,0;1,1,1,1,1");

		symmetricalMatrix.prettyPrint();

		System.out.println(symmetricalMatrix.isSymmetrical());

		triangularMatrix.prettyPrint();

		System.out.println(triangularMatrix.isTriangular());

		biggerTriangularMatrix.prettyPrint();

		System.out.println(triangularMatrix.isTriangular());
		
	}

}