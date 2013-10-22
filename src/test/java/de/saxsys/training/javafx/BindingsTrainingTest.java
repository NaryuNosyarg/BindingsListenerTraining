/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.saxsys.training.javafx;

import javafx.scene.paint.Color;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alexander.casall
 */
public class BindingsTrainingTest {

    BindingsTraining bindings = new BindingsTraining();

    /**
     * #Ü1 Implementieren Sie {@link BindingsTraining#createAGreaterBBinding()}.
     */
    @Test
    public void aGreaterBTest() {
        assertEquals(false, bindings.aGreaterB.get());
        assertEquals(true, bindings.notAGreaterB.get());
        bindings.a.set(5);
        assertEquals(true, bindings.aGreaterB.get());
        assertEquals(false, bindings.notAGreaterB.get());
    }

    /**
     * #Ü2 Implementieren Sie {@link BindingsTraining#createPythagorasBinding()}.
     */
    @Test
    public void pythagorasTest() {
        bindings.a.set(3);
        bindings.b.set(4);
        assertEquals(5, bindings.c.get(), 0.01);
    }

    /**
     * #Ü3 Implementieren Sie {@link BindingsTraining#createNameBinding()}.
     */
    @Test
    public void nameTest() {
        assertEquals(bindings.firstName.get() + " " + bindings.lastName.get(), bindings.fullName.get());
    }

    /**
     * #Ü4 Implementieren Sie {@link BindingsTraining#createListBinding()}.
     */
    @Test
    public void listTest() {
        assertEquals(bindings.anotherVariableList.get(), bindings.variablesList.get());
    }

    /**
     * Ü5 Implementieren Sie {@link BindingsTraining#createFirstStringListBinding()}.
     */
    @Test
    public void firstStringInListTest() {
        assertEquals(bindings.stringList.get(0), bindings.firstStringInList.get());
        bindings.stringList.add(0, "x");
        assertEquals("x", bindings.firstStringInList.get());
    }

    /**
     * #Ü6 Implementieren Sie {@link BindingsTraining#createTresholdBinding()}.
     */
    @Test
    public void tresholdTest() {
        bindings.x.set(0.0);
        assertEquals(0, bindings.y.get(), 0.1);

        bindings.x.set(1.0);
        assertEquals(1.0, bindings.y.get(), 0.1);

        bindings.x.set(0.5);
        assertEquals(1.0, bindings.y.get(), 0.1);

        bindings.x.set(0.25);
        assertEquals(0.5, bindings.y.get(), 0.1);
    }

    /**
     * #Ü7 Implementieren Sie {@link BindingsTraining#createColorBinding()}.
     */
    @Test
    public void colorTest() {

        //CHECK DEFAULT VALUE
        assertEquals("0x000000ff", bindings.colorString.get());
        assertEquals("0x000000ff", bindings.color.get().toString());

        //SET COLOR FROM COLOR
        bindings.color.set(Color.RED);
        assertEquals("0xff0000ff", bindings.colorString.get());
        assertEquals("0xff0000ff", bindings.color.get().toString());

        //SET COLOR FROM STRING
        bindings.colorString.set("0x00ff00ff");
        assertEquals("0x00ff00ff", bindings.colorString.get());
        assertEquals("0x00ff00ff", bindings.color.get().toString());

        //NULL
        bindings.color.set(null);
        assertEquals("FFFFFF", bindings.colorString.get());
        bindings.colorString.set(null);
        assertNull(bindings.color.get());

    }
    
    /**
     * #Ü8 Implementieren Sie {@link BindingsTraining#createNonValidBinding()}.
     */
    @Test(expected = RuntimeException.class)
    public void nonValidBindingTest() {
        bindings.createNonValidBinding();
    }


}