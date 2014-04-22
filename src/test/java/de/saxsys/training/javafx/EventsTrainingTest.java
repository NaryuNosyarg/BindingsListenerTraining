package de.saxsys.training.javafx;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EventsTrainingTest {

	private EventsTraining eventsTraining = new EventsTraining();

	/**
	 * #Ü1
	 */
	@Test
	public void pythagorasTest() {
		eventsTraining.bindings.a.set(3);
		eventsTraining.bindings.b.set(4);
		assertEquals("Hypothenuse: 5", eventsTraining.result);
	}

	/**
	 * #Ü2
	 */
	@Test
	public void listTest() {
		eventsTraining.bindings.cityNames.add("Darmstadt");
		assertEquals("add", eventsTraining.result);
		eventsTraining.bindings.cityNames.remove(0);
		assertEquals("remove", eventsTraining.result);
	}

	@Test
	public void batmanTest() {
		eventsTraining.bindings.firstName.set("John");
		eventsTraining.bindings.lastName.set("Snow");
		assertEquals("I want to be batman.", eventsTraining.result);
		eventsTraining.bindings.firstName.set("Bruce");
		assertEquals("I want to be batman.", eventsTraining.result);
		eventsTraining.bindings.lastName.set("Wayne");
		assertEquals("I am batman.", eventsTraining.result);
	}

}
