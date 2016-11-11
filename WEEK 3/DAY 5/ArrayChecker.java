public class ArrayChecker {

	public boolean isSymmetrical(int[] array) {
				
		for (int i = 0; i <= array.length/2; i++) {
			
			if (array[i] != array[array.length-(i+1)]) {
				
				return false;
			}
		}
		
		return true;

	}
	
	public int[] reverse(int[] array) {
		
		int[] arrayReverse = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			
			arrayReverse[i] = array[array.length-(i+1)];
			
		}
		
		return arrayReverse;
				
	}
	
	public void print(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
		
		System.out.print(array[i] + " ");
		
		}

		System.out.println("");
	
	}
	
	

}