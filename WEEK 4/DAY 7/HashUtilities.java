public class HashUtilities {
	
	public static int shortHash(int value) {
		
		int key = (value*(value + 3))% 1000;
		int keyAbs = Math.abs(key);
		
		return keyAbs;
	}

}