/**
* Attempt to extend string... which fails.
* This is because String is a final class, and thus immutable.
*/


public class EvenString extends String {

	private boolean even = false;
	private int i = 0;
	
	public void printEvens() {
		for(i=0; i<(this.length()-1); i++) {
			if(even) {
				System.out.println(this[i]);
			}
			even = !even;
		}
	}

}