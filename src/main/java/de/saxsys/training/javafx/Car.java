package de.saxsys.training.javafx;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Car {

	private StringProperty make = new SimpleStringProperty();
	private StringProperty model = new SimpleStringProperty();
	private DoubleProperty price = new SimpleDoubleProperty();

	
	public Car() {
	}
	
	public Car(String make, String name, double price) {
		this.make.set(make);
		this.model.set(name);
		this.price.set(price);
	}

	public StringProperty makeProperty() {
		return make;
	}

	public void setMake(String make) {
		this.make.set(make);
	}

	public String getMake() {
		return this.make.get();
	}

	public StringProperty modelProperty() {
		return model;
	}

	public void setModel(String model) {
		this.model.set(model);
	}

	public String getModel() {
		return this.model.get();
	}

	public DoubleProperty priceProperty() {
		return price;
	}

	public void setPrice(double price) {
		this.price.set(price);
	}

	public double getPrice() {
		return this.price.get();
	}

}
