package de.saxsys.training.javafx;

import javafx.scene.paint.Color;
import org.junit.*;
import static org.junit.Assert.*;

public class EventsTrainingTest {
    
    private EventsTraining eventsTraining = new EventsTraining();

    /**
     * #Ü1
     */
    @Test
    public void pythagorasTest(){
        eventsTraining.bindings.a.set(3);
        eventsTraining.bindings.b.set(4);
        assertEquals("Hypothenuse: 5", eventsTraining.value);
    }
    
    /**
     * #Ü2
     */
    @Test
    public void listTest(){
        eventsTraining.bindings.stringList.add("test");
        assertEquals("add", eventsTraining.value);
        eventsTraining.bindings.stringList.remove(0);
        assertEquals("remove", eventsTraining.value);
    }
    
    /**
     * #Ü3
     */
    @Test
    public void colorObjectTest(){
        eventsTraining.bindings.color.set(Color.YELLOW);
        assertEquals("The Hex value of the color is: 0xffff00ff", eventsTraining.value);
    }
    
}
