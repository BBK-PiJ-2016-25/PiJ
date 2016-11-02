public class PalindromeRecursive {


	public static void main(String[] args){
		
		System.out.println(isPalindrome("HANNAH"));

	}

	public static boolean isPalindrome(String str) {
		
		boolean result = false;

		if (str.length() == 0 || str.length() == 1) {

			result = true;

		} else if (str.charAt(0) != str.charAt(str.length()-1)) {

			result = false;

		} else {

			str = str.substring(1, str.length()-1);
			System.out.println(str);
			isPalindrome(str);
		}

		
		return result;

	}

	

}