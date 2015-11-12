package org.bihe.bean;

import java.util.HashMap;

public class WareHouse {
	// -------------------------------------------------------------
	// ------------------Instance Fields----------------------------
	private String id;
	private HashMap<CarID, Integer> cars;
	private int capacity;

	// -------------------------------------------------------------
	// ------------------Constructor--------------------------------
	public WareHouse(String id, HashMap<CarID, Integer> cars, int capacity) {
		super();
		this.id = id;
		this.cars = cars;
		this.capacity = capacity;
	}

	// -------------------------------------------------------------
	// ------------------Accessories-------------------------------
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public HashMap<CarID, Integer> getCars() {
		return cars;
	}

	public void setCars(HashMap<CarID, Integer> cars) {
		this.cars = cars;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}

