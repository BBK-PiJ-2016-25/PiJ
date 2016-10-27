public class PersonQueueLinkedList implements PersonQueue {

/**
* Adds another person to the queue.
*/
	
public void insert(Person person) {

	if (firstPerson != null) {
		setNextPerson(firstPerson);
	}

	firstPerson = person;
}

/**
* Removes a person from the queue.
*/
public Person retrieve() {

if (firstPerson != null) {

	return firstPerson;
	firstPerson = firstPerson.getNextPerson();

	} else {

	return null;

	}
}

}
