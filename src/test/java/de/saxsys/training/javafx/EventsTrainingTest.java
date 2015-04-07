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
		assertEquals("Hypothenuse: 5.0", eventsTraining.result.get());
	}

	/**
	 * Uebung 2
	 * 
	 * Implementieren Sie {@link EventsTraining#initListListener()}
	 */
	@Test
	public void listTest() {
		eventsTraining.bindingsTraining.cars.add(new Car("Opel", "Corsa", 50000));
		assertEquals("add", eventsTraining.result.get());
		eventsTraining.bindingsTraining.cars.remove(0);
		assertEquals("remove", eventsTraining.result.get());
	}

	/**
	 * Uebung 3
	 * 
	 * Implementieren Sie {@link EventsTraining#initCorsaListener()}
	 */
	@Test
	public void corsaTest() {
		eventsTraining.bindingsTraining.car.setModel("Corsa");;
		assertEquals("Corsa rules!", eventsTraining.result.get());
		eventsTraining.bindingsTraining.car.setModel("Passat");
		assertEquals("I want to drive a Corsa!", eventsTraining.result.get());
	}

}
