public class ArrayCheckerLauncher {


	public static void main(String[] args) {

		ArrayChecker myArrayChecker = new ArrayChecker();
		
		int[] array1 = {1,2,3,2,1};
		int[] array2 = {1,2,3,2,5};
		int[] array3 = {8,9,9,8};
		int[] array4 = {8,9,10,11};
		
		System.out.println(myArrayChecker.isSymmetrical(array1));
		System.out.println(myArrayChecker.isSymmetrical(array2));
		System.out.println(myArrayChecker.isSymmetrical(array3));
		System.out.println(myArrayChecker.isSymmetrical(array4));
		
		myArrayChecker.print(myArrayChecker.reverse(array1));
		myArrayChecker.print(myArrayChecker.reverse(array2));
		myArrayChecker.print(myArrayChecker.reverse(array3));
		myArrayChecker.print(myArrayChecker.reverse(array4));
	}
}