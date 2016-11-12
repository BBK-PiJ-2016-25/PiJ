public class MatrixLauncher {


	public static void main(String[] args) {

		Matrix myMatrix = new Matrix(4,3);
		myMatrix.setRow(0, "1,2,3");
		myMatrix.setRow(2,"1,2,3");
		myMatrix.setRow(2,"6,7,8");

		System.out.println(myMatrix.toString());

		
	}

}