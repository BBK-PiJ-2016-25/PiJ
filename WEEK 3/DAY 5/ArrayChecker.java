public class ArrayChecker {

	public boolean isSymmetrical(int[] array) {
				
		for (int i = 0; i <= array.length/2; i++) {
			
			if (array[i] != array[array.length-(i+1)]) {
				
				return false;
			}
		}
		
		return true;

	}
	

}