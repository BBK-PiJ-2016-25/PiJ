int mcCarthy91(int n) {
	System.out.println("Calling with value " + n);
	if (n > 100) {
		return n - 10;
	} else {
		return mcCarthy91(mcCarthy91(n+11));
	}
}