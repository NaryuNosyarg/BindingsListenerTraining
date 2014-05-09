package de.saxsys.training.javafx;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.paint.Color;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author alexander.casall
 */
public class BindingsTrainingTest {

	private BindingsTraining bindings = new BindingsTraining();

	/**
	 * Uebung 1
     * <p/>
	 * Implementieren Sie {@link BindingsTraining#createAGreaterBBinding()}
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
	 * Uebung 2
     * <p/>
	 * Implementieren Sie {@link BindingsTraining#createPythagorasBinding()} .
	 */
	@Test
	public void pythagorasTest() {
		bindings.a.set(3);
		bindings.b.set(4);
		assertEquals(5, bindings.c.get(), 0.01);
	}

	/**
	 * Uebung 3
     * <p/>
	 * Implementieren Sie {@link BindingsTraining#createNameBinding()}.
	 */
	@Test
	public void nameTest() {
		assertEquals("Bruce Wayne", bindings.fullName.get());
		bindings.firstName.set("John");
		assertEquals("John Wayne", bindings.fullName.get());
	}

	/**
	 * Uebung 4
     * <p/>
	 * Implementieren Sie {@link BindingsTraining#createListBinding()}.
	 */
	@Test
	public void listTest() {
		assertEquals(bindings.variablesList, bindings.anotherVariableList);
		DoubleProperty z = new SimpleDoubleProperty(0.5);
        bindings.variablesList.add(0, z);
        assertEquals(bindings.variablesList.size(), bindings.anotherVariableList.size());
        z.set(0.7);
        assertEquals(bindings.variablesList, bindings.anotherVariableList);

        bindings.anotherVariableList.add(new SimpleDoubleProperty(0.4));
        assertNotEquals(bindings.variablesList, bindings.anotherVariableList);
	}

	/**
	 * Uebung 5
     * <p/>
	 * Implementieren Sie {@link BindingsTraining#createFilteredListBinding()}.
	 */
	@Test
	public void filteredListTest() {
		assertTrue(bindings.filteredList != null);
		assertEquals(3, bindings.filteredList.size());
		bindings.cityNames.add("Darmstadt");
		assertEquals(4, bindings.filteredList.size());
		bindings.cityNames.remove("Dresden");
		assertEquals(3, bindings.filteredList.size());
	}

	/**
	 * Uebung 6
     * <p/>
	 * Implementieren Sie {@link BindingsTraining#createColorBinding()}.
	 */
	@Test
	public void colorTest() {

		// CHECK DEFAULT VALUE
		assertEquals("0x000000ff", bindings.colorString.get());
		assertEquals("0x000000ff", bindings.color.get().toString());

		// SET COLOR FROM COLOR
		bindings.color.set(Color.RED);
		assertEquals("0xff0000ff", bindings.colorString.get());
		assertEquals("0xff0000ff", bindings.color.get().toString());

		// SET COLOR FROM STRING
		bindings.colorString.set("0x00ff00ff");
		assertEquals("0x00ff00ff", bindings.colorString.get());
		assertEquals("0x00ff00ff", bindings.color.get().toString());

		// NULL
		bindings.color.set(null);
		assertEquals("0x000000ff", bindings.colorString.get());
		bindings.colorString.set(null);
		assertNull(bindings.color.get());

	}

	/**
	 * Uebung 7
     * <p/>
	 * Implementieren Sie {@link BindingsTraining#createNonValidBinding()}.
	 */
	@Test(expected = RuntimeException.class)
	public void nonValidBindingTest() {
		bindings.createNonValidBinding();
	}

}
