package de.saxsys.training.javafx;

import java.util.ArrayList;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.DoubleBinding;
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
import javafx.util.StringConverter;



/**
 * @author alexander.casall
 */
public class BindingsTraining {

	// Uebung 1
	public BooleanProperty aGreaterB = new SimpleBooleanProperty();
	public BooleanProperty notAGreaterB = new SimpleBooleanProperty();
	// Uebung 2
	public DoubleProperty a = new SimpleDoubleProperty();
	public DoubleProperty b = new SimpleDoubleProperty();
	public DoubleProperty c = new SimpleDoubleProperty();
	// Uebung 3
	public StringProperty firstName = new SimpleStringProperty("Bruce");
	public StringProperty lastName = new SimpleStringProperty("Wayne");
	public StringProperty fullName = new SimpleStringProperty();
	// Uebung 4
	public ListProperty<DoubleProperty> variablesList = new SimpleListProperty<>(
			FXCollections.<DoubleProperty> observableArrayList(a, b, c));
	public ListProperty<DoubleProperty> anotherVariableList = new SimpleListProperty<>(
			FXCollections.<DoubleProperty> observableArrayList());
	// Uebung 5
	public ListProperty<String> cityNames = new SimpleListProperty<>(
			FXCollections.observableArrayList("Dresden", "Koeln", "Hamburg",
					"Berlin", "Dortmund", "Duesseldorf", "Hannover", "Mainz"));
	public FilteredList<String> filteredList;
	// Uebung 6
	public ObjectProperty<Color> color = new SimpleObjectProperty<>(Color.BLACK);
	public StringProperty colorString = new SimpleStringProperty();
	// Uebung 7
	public IntegerProperty illegalBindingA = new SimpleIntegerProperty();
	public IntegerProperty illegalBindingB = new SimpleIntegerProperty();

	public Car car = new Car("Opel", "Manta", 100.0);
	public ListProperty<Car> cars = new SimpleListProperty<Car>(
			FXCollections.observableList(new ArrayList<Car>()));

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
	 * <p/>
	 * <ul>
	 * <li>1. aGreaterB soll ausdruecken, dass a groesser b ist. Wow! ;-)</li>
	 * <li>2. notAGreaterB soll ausdruecken, dass a nicht groesser b ist.
	 * (Negierung von aGreaterB)</li>
	 * </ul>
	 */
	private void createAGreaterBBinding() {

		aGreaterB.bind(a.greaterThan(b));
		notAGreaterB.bind(aGreaterB.not());
		//this.notAGreaterB.bind(Bindings.not(this.aGreaterB));
	}

	/**
	 * Uebung 2: Implementierung des Satzes des Pythagoras c^2 = a^2 + b^2
	 * <p/>
	 * <ol>
	 * <li>Berechnen Sie zuerst cSquare (DoubleProperty) -> a^2+b^2</li>
	 * <li>Damit c den richtigen Wert darstellt, muss noch die Wurzel aus
	 * cSquare gezogen werden - entwickeln Sie dazu ein LowLevel Binding</li>
	 * </ol>
	 */
	private void createPythagorasBinding() {
		//DoubleProperty cSquare = new SimpleDoubleProperty();
		//cSquare.bind(a.multiply(a).add(b.multiply(b)));
		//c.bind(Bindings.createDoubleBinding(() -> Math.sqrt(cSquare.get()), cSquare));

		DoubleBinding cSquare = new DoubleBinding() {

			{
				super.bind(a, b);
			}

			@Override
			protected double computeValue() {
				return (Math.sqrt((a.get() * a.get()) + (b.get() * b.get())));
			}
		};
		c.bind(cSquare);
	}

	/**
	 * Uebung 3
	 * <p/>
	 * <p>
	 * Binden Sie fullName so, dass es eine Konkatenation aus firstName und
	 * lastName ist.
	 * </p>
	 */
	private void createNameBinding() {
		fullName.bind(Bindings.concat(this.firstName, " ", this.lastName));
		//this.fullName.bind(this.firstName.concat(" ").concat(this.lastName));
	}

	/**
	 * Uebung 4
	 * <p/>
	 * <ol>
	 * <li>anotherVariableList soll den gleichen Inhalt haben wie variablesList;
	 * es soll aber erlaubt sein, Elemente in anotherVariableList hinzuzufuegen,
	 * die <strong>nicht</strong> in variablesList landen</li>
	 * </ol>
	 */
	private void createListBinding() {
		anotherVariableList.bindContent(variablesList);
	}

	/**
	 * Uebung 5
	 * <p/>
	 * <p>
	 * Die Variable <i>filteredList</i> soll alle Staedte (cityNames) enthalten,
	 * die mit einem "D" beginnen.
	 * </p>
	 */
	private void createFilteredListBinding() {
		filteredList = cityNames.filtered(city -> city.startsWith("D"));
		//...filtered(string -> string ....
	}

	/**
	 * Uebung 6
	 * <p/>
	 * <ul>
	 * <li>colorString soll bidirektional an color gebunden werden.</li>
	 * <li>Aendert sich der String, soll sich die Color anpassen.</li>
	 * <li>Aendert sich die Color, soll sich der String anpassen.</li>
	 * <li>Verwenden Sie einen StringConverter -> Folie [Uebung 6]</li>
	 * </ul>
	 */
	private void createColorBinding() {
		StringConverter<Color> converter = new StringConverter<Color>() {
			// Mapping from a Color to a String
			@Override
			public String toString(Color color) {
				if (color == null) {
					// colorString.setValue("0x000000ff");
					// return colorString.get();
					return "0x000000ff";
				}
				return color.toString();
			}

			// Mapping from a String to a Color
			@Override
			public Color fromString(String string) {
				if (string == null) {
					return null;
				}
				// Color colorValue = Color.valueOf(string);
				// return colorValue;
				return Color.web(string);
			}

		};
		colorString.bindBidirectional(color, converter);

	}

	/**
	 * Uebung 7
	 * <p/>
	 * <ul>
	 * <li>1. Binden Sie illegalBindingA an illegalBindingB</li>
	 * <li>2. Setzen Sie illegalBindingA auf einen neuen Wert.</li>
	 * </ul>
	 */
	protected void createNonValidBinding() {
		illegalBindingA.bind(illegalBindingB);
		illegalBindingA.set(5);
	}
}
