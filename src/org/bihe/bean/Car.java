package org.bihe.bean;

public class Car {
	// -------------------------------------------------------------
	// ------------------Instance Fields----------------------------
	private String color;
	private CarID model;
	private String cost;
	private String id;

	// -------------------------------------------------------------
	// ------------------Constructor--------------------------------
	public Car(String color, CarID model, String cost, String id) {
		super();
		this.color = color;
		this.model = model;
		this.cost = cost;
		this.id = id;
	}

	// -------------------------------------------------------------
	// ------------------Accessories----------------------------
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public CarID getModel() {
		return model;
	}

	public void setModel(CarID model) {
		this.model = model;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
