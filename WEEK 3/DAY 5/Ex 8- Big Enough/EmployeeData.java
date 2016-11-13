public class EmployeeData {
	
	private int[] idArray;
	private String[] nameArray;

	public EmployeeData() {

		idArray = new int[2];

		for (int i = 0; i < idArray.length; i++) {

			idArray[i] = 0;
		}

		nameArray = new String[2];

		for (int i = 0; i < idArray.length; i++) {

			nameArray[i] = "";
		}

	}

	public int[] getIdArray() {

		return idArray;		
	}

	public String[] getNameArray() {

		return nameArray;		
	}

	public void enlargeId(int size) {

		int[] newIdArray = new int[size];


		for (int i = 0; i < newIdArray.length; i++) {

			newIdArray[i] = 0;
		}


		for (int i = 0; i < idArray.length; i++) {

			newIdArray[i] = idArray[i];
		}

		idArray = newIdArray;

	}

	public void enlargeName(int size) {

		String[] newNameArray = new String[size];


		for (int i = 0; i < newNameArray.length; i++) {

			newNameArray[i] = "";
		}


		for (int i = 0; i < nameArray.length; i++) {

			newNameArray[i] = nameArray[i];
		}

		nameArray = newNameArray;

	}

}