public class Person {
	
	private String name;
	private int situation;
	private int energy;
	private Person nextPerson;

/**
* Move a distance in a straight line, given in meters
*/

public Person() {

	this.name = "Anon";
	this.situation = 0;
	this.energy = 250;
	this.nextPerson = null;

}

public Person(String name) {

	this.name = name;
}

public void setName(String name) {

	this.name = name;
}

public String getName() {

	return this.name;
}

public void setNextPerson(Person nextPerson) {

	this.nextPerson = nextPerson;
}

public Person getNextPerson(Person nextPerson) {

	return this.nextPerson;
}

public void move(int distance) {
	for (int i = 0; i < distance; i++) {
		situation++;
	}
}
/**
* Say something
*/
public void say(String message) {
	System.out.println(message);
}

}
