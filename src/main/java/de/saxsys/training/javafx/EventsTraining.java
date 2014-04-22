package de.saxsys.training.javafx;

public class EventsTraining {

	protected BindingsTraining bindings = new BindingsTraining();
	protected String result = null;

	public EventsTraining() {
		initPythagorasListener();
		initListListener();
		initBatmanListener();
	}

	/**
	 * Uebung 1
	 * 
	 * <p>
	 * Jedes mal wenn c geaendert wird, soll <code>result.equals("Hypothenuse: ${NEUERWERTVONC}") == true</code> gelten
	 * </p>
	 */
	private void initPythagorasListener() {

	}

	/**
	 * Uebung 2
	 * 
	 * <p>
	 * Jedes mal wenn:
	 * </p>
	 * <ul>
	 * <li>aus cityList ein Element entfernt wird, soll <code>result.equals("remove")== true</code> gelten</li>
	 * <li>in cityList ein Element hinzugefuegt wird soll <code>result.equals("add") == true</code> gelten</li>
	 * </ul>
	 */
	private void initListListener() {

	}

	/**
	 * Uebung 3
	 * 
	 * <p>
	 * Wenn der komplette Name "Bruce Wayne" lautet, dann soll
	 * <code>result.equals("I am batman.") == true</code> gelten. In allen
	 * anderen Faellen soll
	 * <code>result.equals("I want to be batman.") == true</code> gelten.
	 * </p>
	 */
	private void initBatmanListener() {

	}

}
