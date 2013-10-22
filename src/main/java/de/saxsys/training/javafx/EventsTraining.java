package de.saxsys.training.javafx;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ListChangeListener;
import javafx.scene.paint.Color;

public class EventsTraining {

    protected BindingsTraining bindings = new BindingsTraining();
    protected String value = null;

    public EventsTraining() {
        initPythagorasListener();
        initListListener();
        initColorObjectListener();
    }

    /**
     * #Ü1
     * 
     * <p>Jedes mal wenn c geändert wird, soll value.equals("Hypothenuse:
     * ${NEUERWERTVONC}") == true gelten</p>
     */
    private void initPythagorasListener() {
      
    }

    /**
     * #Ü2 
     * 
     * <p>Jedes mal wenn:</p>
     * <ul>
     *  <li>aus stringList ein Element entfernt wird, soll value.equals("remove") == true gelten</li>
     *  <li>in stringList ein Element hinzugefügt wird soll value.equals("add") == true gelten</li>
     * </ul>
     */
    private void initListListener() {
      
    }

    /**
     * #Ü3
     * 
     * <p>Jedes mal wenn sich die color ändert soll value.equals("The Hex value of the color
     * is: ${HEXOFCOLOR}") == true gelten</p>
     */
    private void initColorObjectListener() {
      
    }
} 
   