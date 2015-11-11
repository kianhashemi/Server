package org.bihe.bean;

import java.util.ArrayList;

public class ProductionLine implements Runnable {
	private ArrayList<Car> carTypes; 
	private int produceTime;
	private String ID;
	
	public ProductionLine() {
		// TODO Auto-generated constructor stub
	}
	
	//-----------------------------------------------------------------
	//Getters & Setters
	public ArrayList<Car> getCarTypes() {
		return carTypes;
	}
	public void setCarTypes(ArrayList<Car> carTypes) {
		this.carTypes = carTypes;
	}
	public int getProduceTime() {
		return produceTime;
	}
	public void setProduceTime(int produceTime) {
		this.produceTime = produceTime;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	//------------------------------------------------------------------
	//Methods

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	//Will produce a Car
	public Car produceCar(){
		
		return null;
		
	}
	
	//Will Add a car to the list of production line 
	public void addCar(){
		
	}
	//Generate ID
	public void IDgenerator(){
		
	}
	
	//Will Check Free Space Of Inner Warehouse
	public boolean checkFreeSpace(){
	
		
		return false;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	

}
