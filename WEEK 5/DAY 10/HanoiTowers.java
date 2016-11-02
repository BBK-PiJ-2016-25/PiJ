public class HanoiTowers {


	public static void main(String[] args){
		
		System.out.println(moveDiscs(64));

	}

	public static int moveDiscs(int n) {
		

		int result = 0;

		if (n == 1) {

			return 1;

		} else {

			result = 1 + (moveDiscs(n-1)*2);

			System.out.println(result);

			return result;
		}
	}

	

}