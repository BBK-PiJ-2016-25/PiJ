public class Launcher {
	
	public static void main(String[] args) {

		HospitalManager patientList = new HospitalManager();

		Patient matthew = new Patient("Matthew", 25, "Conjunctivitis");
		Patient mark = new Patient("Mark", 31, "Hernia");
		Patient luke = new Patient("Luke", 46, "Hayfever");
		Patient john = new Patient("John", 57, "Broken Leg");
		Patient mary = new Patient("Mary", 27, "Headache");
		Patient lucy = new Patient("Lucy", 82, "Common Cold");
		Patient ruth = new Patient("Ruth", 14, "Appendicitis");
		Patient barbara = new Patient("Barbara", 90, "Arthritis");
		Patient jeremy = new Patient("Jeremy", 63, "Flu");
		Patient emily = new Patient("Emily", 5, "Chicken Pox");

		patientList.addPatient(matthew);
		patientList.addPatient(mark);
		patientList.addPatient(luke);
		patientList.addPatient(john);
		patientList.addPatient(mary);
		patientList.addPatient(lucy);
		patientList.addPatient(ruth);
		patientList.addPatient(barbara);
		patientList.addPatient(jeremy);
		patientList.addPatient(emily);

	}
}