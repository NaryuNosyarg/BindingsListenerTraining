package de.saxsys.training.javafx;

import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.collections.transformation.FilteredList;
import javafx.scene.paint.Color;

/**
 * @author alexander.casall
 */
public class BindingsTraining {

    // Uebung 1
    public BooleanProperty aGreaterB = new SimpleBooleanProperty();
    public BooleanProperty notAGreaterB = new SimpleBooleanProperty();
    // Uebung 2
    public DoubleProperty a = new SimpleDoubleProperty();
    public SimpleDoubleProperty b = new SimpleDoubleProperty();
    public DoubleProperty c = new SimpleDoubleProperty();
    // Uebung 3
    public StringProperty firstName = new SimpleStringProperty("Bruce");
    public StringProperty lastName = new SimpleStringProperty("Wayne");
    public StringProperty fullName = new SimpleStringProperty();
    // Uebung 4
    public ListProperty<DoubleProperty> variablesList = new SimpleListProperty<>(
            FXCollections.<DoubleProperty>observableArrayList(a, b, c));
    public ListProperty<DoubleProperty> anotherVariableList = new SimpleListProperty<>(
            FXCollections.<DoubleProperty>observableArrayList());
    // Uebung 5
    public ListProperty<String> cityNames = new SimpleListProperty<>(
            FXCollections.observableArrayList("Dresden", "Koeln", "Hamburg",
                    "Berlin", "Dortmund", "Duesseldorf", "Hannover", "Mainz")
    );
    public FilteredList<String> filteredList;
    // Uebung 6
    public ObjectProperty<Color> color = new SimpleObjectProperty<>(
            Color.BLACK);
    public StringProperty colorString = new SimpleStringProperty();
    // Uebung 7
    public IntegerProperty illegalBindingA = new SimpleIntegerProperty();
    public IntegerProperty illegalBindingB = new SimpleIntegerProperty();

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
    }

    /**
     * Uebung 4
     * <p/>
     * <ol>
     * <li>anotherVariableList soll den gleichen Inhalt haben wie variablesList; es soll aber erlaubt sein,
     * Elemente in anotherVariableList hinzuzufuegen, die <strong>nicht</strong> in variablesList landen</li>
     * </ol>
     */
    private void createListBinding() {
    }

    /**
     * Uebung 5
     * <p/>
     * <p>
     * Die Variable <i>filteredList</i> soll alle Staedte (cityNames) enthalten, die mit einem "D" beginnen.
     * </p>
     */
    private void createFilteredListBinding() {
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
    }
}
