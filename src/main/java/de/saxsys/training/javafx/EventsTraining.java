package de.saxsys.training.javafx;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class EventsTraining {

    public StringProperty result = new SimpleStringProperty();
    public BindingsTraining bindingsTraining;

    public EventsTraining() {
        this(new BindingsTraining());
    }

    public EventsTraining(BindingsTraining bindingsTraining) {
        this.bindingsTraining = bindingsTraining;
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
	 * <li>aus cityNames ein Element entfernt wird, soll <code>result.equals("remove")== true</code> gelten</li>
	 * <li>in cityNames ein Element hinzugefuegt wird soll <code>result.equals("add") == true</code> gelten</li>
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
