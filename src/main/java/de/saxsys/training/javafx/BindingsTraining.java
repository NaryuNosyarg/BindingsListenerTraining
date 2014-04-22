/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.saxsys.training.javafx;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ListProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.transformation.FilteredList;
import javafx.scene.paint.Color;

/**
 * 
 * @author alexander.casall
 */
public class BindingsTraining {

	// Uebung 1
	protected BooleanProperty aGreaterB = new SimpleBooleanProperty();
	protected BooleanProperty notAGreaterB = new SimpleBooleanProperty();
	// Uebung 2
	protected DoubleProperty a = new SimpleDoubleProperty();
	protected SimpleDoubleProperty b = new SimpleDoubleProperty();
	protected DoubleProperty c = new SimpleDoubleProperty();
	// Uebung 3
	protected StringProperty firstName = new SimpleStringProperty("Bruce");
	protected StringProperty lastName = new SimpleStringProperty("Wayne");
	protected StringProperty fullName = new SimpleStringProperty();
	// Uebung 4
	protected ListProperty<DoubleProperty> variablesList = new SimpleListProperty<>(
			FXCollections.<DoubleProperty> observableArrayList(a, b, c));
	protected ListProperty<DoubleProperty> anotherVariableList = new SimpleListProperty<>(
			FXCollections.<DoubleProperty> observableArrayList());
	// Uebung 5
	protected ListProperty<String> cityNames = new SimpleListProperty<>(
			FXCollections.observableArrayList("Dresden", "Koeln", "Hamburg",
					"Berlin", "Dortmund", "Duesseldorf", "Hannover", "Mainz"));
	protected FilteredList<String> filteredList;
	// Uebung 6
	protected DoubleProperty x = new SimpleDoubleProperty();
	protected DoubleProperty y = new SimpleDoubleProperty();
	// Ü7
	protected ObjectProperty<Color> color = new SimpleObjectProperty<>(
			Color.BLACK);
	protected StringProperty colorString = new SimpleStringProperty();
	// Ü8
	protected IntegerProperty illegalBindingA = new SimpleIntegerProperty();
	protected IntegerProperty illegalBindingB = new SimpleIntegerProperty();

	public BindingsTraining() {
		createAGreaterBBinding();
		createPythagorasBinding();
		createNameBinding();
		createListBinding();
		createFilteredListBinding();
		createTresholdBinding();
		createColorBinding();
	}

	/**
	 * #Ü1
	 * <ul>
	 * <li>1. aGreaterB soll ausdrücken, dass a größer b ist. wow ;-)</li>
	 * <li>2. notAGreaterB soll ausdrücken, dass a nicht größer b ist.
	 * (Negierung von aGreaterB)</li>
	 * </ul>
	 */
	private void createAGreaterBBinding() {
	}

	/**
	 * #Ü2: Implementierung des Satzes des Pythagoras c^2 = a^2 + b^2
	 * 
	 * <ul>
	 * <li>1. c soll gebunden werden, sodass es immer den aktuellen Wert der
	 * berechnung hat</li>
	 * <li>2. berechnen Sie zuerst cSquare (helper - IntegerProperty) -> a^2+b^2
	 * </li>
	 * <li>3. damit c den richtigen Wert darstellt, muss noch die Wurzel aus
	 * cSquare gezogen werden - entwickeln Sie dazu ein LowLevel Binding ->
	 * Folie</li>
	 * </ul>
	 */
	private void createPythagorasBinding() {
	}

	/**
	 * #Ü3
	 * <p>
	 * Binde fullName so dass es eine Konkatenation aus firstName und lastName
	 * ist.
	 * </p>
	 */
	private void createNameBinding() {
	}

	/**
	 * #Ü4
	 * <ul>
	 * <li>1. anotherVariableList soll den gleichen Inhalt haben wie
	 * variablesList</li>
	 * <li>2. variablesList soll den gleichen Inhalt haben wie
	 * anotherVariableList</li>
	 * </ul>
	 */
	private void createListBinding() {
	}

	/**
	 * #Ü5
	 * <p>
	 * Binde firstStringInList, so dass es immer den ersten Wert der Liste
	 * stringList hat. (Hinweise: Bindings.class)
	 * </p>
	 */
	private void createFilteredListBinding() {
	}

	/**
	 * #Ü6
	 * 
	 * <p>
	 * Binde y, so dass es sich verhält, wie am Beamer zu sehen ist.
	 * </p>
	 */
	private void createTresholdBinding() {
	}

	/**
	 * #Ü7
	 * <ul>
	 * <li>colorString soll bidirektional an color gebunden werden.</li>
	 * <li>Ändert sich der String, soll sich die Color anpassen.</li>
	 * <li>Ändert sich die Color soll sich der String anpassen.</li>
	 * <li>Verwenden Sie einen StringConverter -> Folie [Ü8]</li>
	 * </ul>
	 */
	private void createColorBinding() {
	}

	/**
	 * #Ü8
	 * <ul>
	 * <li>1. Binde illegalBindingA an illegalBindingB</li>
	 * <li>2. Setze auf illegalBindingA einen Wert mit dem setter.</li>
	 * </ul>
	 */
	protected void createNonValidBinding() {
	}
}