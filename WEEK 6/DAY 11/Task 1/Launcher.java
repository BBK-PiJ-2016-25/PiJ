public class Launcher {
	
	public static void main(String[] args){

		IntegerTreeNode itn = new IntegerTreeNode(4);
		itn.add(5);
		itn.add(7);
		itn.add(9);
		itn.add(3);

		//int answer = itn.getMax();

		System.out.println(itn.getMax());
		System.out.println(itn.getMin());
	}



}