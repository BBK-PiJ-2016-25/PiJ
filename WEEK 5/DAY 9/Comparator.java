public class Comparator {

	public double getMax(double d1, double d2) {
		if (d1 > d2) {
			return d1;
		} else {
			return d2;
		}
	}

	public int getMax(int n, int m) {
		double n1 = (double) n;
		double n2 = (double) m;

		return (int) getMax(n1, n2);

	}

	public String getMax(String number1, String number2) {
		double n1 = Double.parseDouble(number1);
		double n2 = Double.parseDouble(number2);
	
		return Double.toString(getMax(n1, n2));

	}

}
