public class Fibonacci {
// arrays are 0-based, so F(1) is stored at position 0, etc
	private int[] precalculated = null;

	public int memoized(int n) {

		if (precalculated == null) {
			initPrecalculatedArray(n);
		}
		if (precalculated[n-1] != -1) {
			return precalculated[n-1];
		} else {
			int result = memoized(n-1) + memoized(n-2);
			precalculated[n-1] = result;
			return result;
		}

	}

	public int memoizedWithReset(int n) {

		precalculated = null;
		return memoized(n);
	}

	private void initPrecalculatedArray(int size) {
		precalculated = new int[size];
		for (int i = 0; i < precalculated.length; i++) {
			precalculated[i] = -1; // to indicate "not calculated yet"
		}
		precalculated[0] = 1; // F(1)
		precalculated[1] = 1; // F(2)
	}

	public static int unmemoized(int n) {
		
		if ((n == 1) || (n == 2)) {
			return 1;
		} else {
			return unmemoized(n-1) + unmemoized(n-2);
		}
	}

	public void timeAndPrint(boolean memoized, int n) {

		int result = 0;

		System.out.println("Calling memoized fibonacci method with n value of " + n);
		long startTime = System.currentTimeMillis();

		if (memoized) {
			result = memoizedWithReset(n);
		} else {
			result = unmemoized(n);
		}

		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println("Method executed in " + elapsedTime + ", returning a result of " + result);
		System.out.println("");

	}
}