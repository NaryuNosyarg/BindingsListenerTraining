/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.saxsys.training.javafx;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.paint.Color;

import org.junit.Test;

/**
 * 
 * @author alexander.casall
 */
public class BindingsTrainingTest {

	BindingsTraining bindings = new BindingsTraining();

	/**
	 * #Ü1 Implementieren Sie {@link BindingsTraining#createAGreaterBBinding()}
	 * .
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
	 * #Ü2 Implementieren Sie
	 * {@link BindingsTraining#createPythagorasBinding()} .
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
		assertEquals("Bruce Wayne", bindings.fullName.get());
		bindings.firstName.set("John");
		assertEquals("John Wayne", bindings.fullName.get());
	}

	/**
	 * #Ü4 Implementieren Sie {@link BindingsTraining#createListBinding()}.
	 */
	@Test
	public void listTest() {
		bindings.variablesList.bindContent(bindings.anotherVariableList);
		assertEquals(bindings.variablesList, bindings.variablesList);
		DoubleProperty z = new SimpleDoubleProperty(0.5);
		bindings.variablesList.add(z);
		bindings.anotherVariableList.add(z);
		assertTrue(bindings.variablesList.size() == (bindings.anotherVariableList
				.size() + 1));
	}

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