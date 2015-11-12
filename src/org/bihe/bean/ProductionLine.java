package org.bihe.bean;

import java.util.ArrayList;
import java.util.Random;

public class ProductionLine implements Runnable {
	private static Producer producer;
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
	try {
		Thread.sleep(produceTime);
		producer.addCarToStock(produceCar());
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
	//Will produce a Car
	public Car produceCar(){
		Random rn = new Random(); 
	int random =rn.nextInt(carTypes.size());
	
	return carTypes.get(random);
			
	}
	
	//Will Add a car to the list of production line //UI Handling 
	public void addCar(){
		
	}
	//Generate ID Should be called after creating the production line
	public void IDgenerator(){
	this.ID="producerID"+this.carTypes.get(0).getModel();
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
