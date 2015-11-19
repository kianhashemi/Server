package org.bihe.bean;

import java.util.HashMap;

public class WareHouse {
	// -------------------------------------------------------------
	// ------------------Instance Fields----------------------------
	private static int idNumber=0;
	private String id;
	private HashMap<CarID, Integer> cars;
	private int capacity;
	private int freeSpace;

	// -------------------------------------------------------------
	// ------------------Constructor--------------------------------
	public WareHouse( HashMap<CarID, Integer> cars, int capacity) {
		super();
		this.cars = cars;
		this.capacity = capacity;
		generateID();
	}
	// -------------------------------------------------------------
	// -----------------------Methods-------------------------------
	private void generateID(){
		this.id="WareHouse"+idNumber;
	}
	// -------------------------------------------------------------
	public void calculateFreeSpace(){
		freeSpace=capacity;
		for(CarID cid:cars.keySet()){
			freeSpace=freeSpace-cars.get(cid);
		}
	}
	// -------------------------------------------------------------
	public void addToWareHouse(){
		
	}
	// -------------------------------------------------------------
	public void removeFromWareHouse(){
		
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
	public int getFreeSpace() {
		calculateFreeSpace();
		return freeSpace;
	}
	public void setFreeSpace(int freeSpace) {
		this.freeSpace = freeSpace;
	}
	

}

