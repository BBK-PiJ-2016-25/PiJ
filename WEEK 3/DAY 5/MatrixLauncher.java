public class MatrixLauncher {


	public static void main(String[] args) {

		Matrix myMatrix = new Matrix(4,3);
		myMatrix.setRow(0, "1,2,3");
		myMatrix.setRow(1,"1,22,3");
		myMatrix.setRow(2,"6,77,8");
		myMatrix.setColumn(0, "1,2,3,18");

		myMatrix.prettyPrint();

		System.out.println(myMatrix.toString());

		
	}

}