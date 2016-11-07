public class PalindromeRecursive {


	public static void main(String[] args){
		
		System.out.println(isPalindrome("HANNAH"));
		System.out.println(isPalindrome("racecar"));
		System.out.println(isPalindrome("annie"));

	}

	public static boolean isPalindrome(String str) {
		

		if (str.length() == 0 || str.length() == 1) {

			return true;

		} else if (str.charAt(0) != str.charAt(str.length()-1)) {

			return false;

		} else {

			str = str.substring(1, str.length()-1);
			return isPalindrome(str);

		}


	}

	

}