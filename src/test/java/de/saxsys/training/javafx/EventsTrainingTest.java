package de.saxsys.training.javafx;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EventsTrainingTest {

	private EventsTraining eventsTraining = new EventsTraining();

	/**
	 * Uebung 1
	 * 
	 * Implementieren Sie {@link EventsTraining#initPythagorasListener()}
	 */
	@Test
	public void pythagorasTest() {
		eventsTraining.bindingsTraining.a.set(3);
		eventsTraining.bindingsTraining.b.set(4);
		assertEquals("Hypothenuse: 5", eventsTraining.result);
	}

	/**
	 * Uebung 2
	 * 
	 * Implementieren Sie {@link EventsTraining#initListListener()}
	 */
	@Test
	public void listTest() {
		eventsTraining.bindingsTraining.cityNames.add("Darmstadt");
		assertEquals("add", eventsTraining.result);
		eventsTraining.bindingsTraining.cityNames.remove(0);
		assertEquals("remove", eventsTraining.result);
	}

	/**
	 * Uebung 3
	 * 
	 * Implementieren Sie {@link EventsTraining#initBatmanListener()}
	 */
	@Test
	public void batmanTest() {
		eventsTraining.bindingsTraining.firstName.set("John");
		eventsTraining.bindingsTraining.lastName.set("Snow");
		assertEquals("I want to be batman.", eventsTraining.result);
		eventsTraining.bindingsTraining.lastName.set("Wayne");
		assertEquals("I want to be batman.", eventsTraining.result);
		eventsTraining.bindingsTraining.firstName.set("Bruce");
		assertEquals("I am batman.", eventsTraining.result);
	}

}
