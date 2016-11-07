public class IntegerTreeNode{

	
	IntegerTreeNode left;
	IntegerTreeNode right;
	int value;
	static int leftDepth;
	static int rightDepth;
	int depth = 0;


	public IntegerTreeNode(int value) {

		this.value = value;
		this.right = null;
		this.left = null;


	}

	public void add(int newNumber) {

		System.out.println("add being called");

		if (newNumber > this.value) {
			if (right == null) {
				right = new IntegerTreeNode(newNumber);
			} else {
				right.add(newNumber);
			}
		} else {
			if (left == null) {
				left = new IntegerTreeNode(newNumber);
			} else {
				left.add(newNumber);
			}
		}
	}

	public boolean contains(int n) {
		if (n == this.value) {
			return true;
		} else if (n > this.value) {
			if (right == null) {
				return false;
			} else {
				return right.contains(n);
			}
		} else {
			if (left == null) {
				return false;
			} else {
				return left.contains(n);
			}
		}
	}

	public int getMax() {

		if (this.right == null) {

			return this.value;

		} else {

			return right.getMax();
		}


	}

	public int getMin() {

		if (this.left == null) {

			return this.value;

		} else {

			return left.getMin();
		}


	}

	public String toString(){


		if (this.left == null && this.right == null){

			return Integer.toString(value);

		} else if (this.left == null) {

			String str = "[" + this.value + " L[]" + " R" + right.toString() + "]";	

			return str;

		} else if (this.right == null) {

			String str = "[" + this.value + " L" + left.toString() + " R[]]";		

			return str;

		} else {

			String str = "[" + this.value + " L" + left.toString() + " R" + right.toString() + "]";		

			return str; 
		}

	}

	public int findDepth(){

		if (this.left == null) {


			return right.findDepth();
		} else {
			leftDepth++;
			return left.findDepth();
		}
		if (this.right == null) {


			return rightDepth;
		} else {
			rightDepth++;
			return right.findDepth();
		}
		
	}




}