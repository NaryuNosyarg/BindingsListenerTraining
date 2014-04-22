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
	protected ObjectProperty<Color> color = new SimpleObjectProperty<>(
			Color.BLACK);
	protected StringProperty colorString = new SimpleStringProperty();
	// Uebung 7
	protected IntegerProperty illegalBindingA = new SimpleIntegerProperty();
	protected IntegerProperty illegalBindingB = new SimpleIntegerProperty();

	public BindingsTraining() {
		createAGreaterBBinding();
		createPythagorasBinding();
		createNameBinding();
		createListBinding();
		createFilteredListBinding();
		createColorBinding();
	}

	/**
	 * Uebung 1
	 * 
	 * <ul>
	 * <li>1. aGreaterB soll ausdruecken, dass a groesser b ist. Wow! ;-)</li>
	 * <li>2. notAGreaterB soll ausdruecken, dass a nicht groesser b ist.
	 * (Negierung von aGreaterB)</li>
	 * </ul>
	 */
	private void createAGreaterBBinding() {
	}

	/**
	 * Uebung 2: Implementierung des Satzes des Pythagoras c^2 = a^2 + b^2
	 * 
	 * <ol>
	 * <li>Berechnen Sie zuerst cSquare (DoubleProperty) -> a^2+b^2</li>
	 * <li>Damit c den richtigen Wert darstellt, muss noch die Wurzel aus
	 * cSquare gezogen werden - entwickeln Sie dazu ein LowLevel Binding ->
	 * Folie</li>
	 * </ol>
	 */
	private void createPythagorasBinding() {
	}

	/**
	 * Uebung 3
	 * 
	 * <p>
	 * Binden Sie fullName so, dass es eine Konkatenation aus firstName und
	 * lastName ist.
	 * </p>
	 */
	private void createNameBinding() {
	}

	/**
	 * Uebung 4
	 * 
	 * <ol>
	 * <li>anotherVariableList soll den gleichen Inhalt haben wie variablesList</li>
	 * <li>variablesList soll den gleichen Inhalt haben wie anotherVariableList</li>
	 * </ol>
	 */
	private void createListBinding() {
	}

	/**
	 * Uebung 5
	 * 
	 * <p>
	 * Die Variable <i>filteredList</i> soll alle Staedte (cityNames) enthalten, die mit einem "D" beginnen.
	 * </p>
	 */
	private void createFilteredListBinding() {
	}

	/**
	 * Uebung 6
	 * 
	 * <ul>
	 * <li>colorString soll bidirektional an color gebunden werden.</li>
	 * <li>Aendert sich der String, soll sich die Color anpassen.</li>
	 * <li>Aendert sich die Color, soll sich der String anpassen.</li>
	 * <li>Verwenden Sie einen StringConverter -> Folie [Uebung 6]</li>
	 * </ul>
	 */
	private void createColorBinding() {
	}

	/**
	 * Uebung 7
	 * 
	 * <ul>
	 * <li>1. Binde illegalBindingA an illegalBindingB</li>
	 * <li>2. Setze auf illegalBindingA einen neuen Wert.</li>
	 * </ul>
	 */
	protected void createNonValidBinding() {
	}
}