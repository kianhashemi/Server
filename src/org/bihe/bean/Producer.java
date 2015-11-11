package org.bihe.bean;

import java.util.ArrayList;
import java.util.HashMap;

public class Producer {
	
	//-------------------------------------------------
	//-------------Instance Fields---------------------
	private ArrayList<ProductionLine> productionLines;
	private ArrayList<Car> stockCars;
	private int stockSize;
	private int freeSpace;
	private HashMap<String, Integer> cars;
	
	//-------------------------------------------------
	//--------------Constructors-----------------------
	
	
	//-------------------------------------------------
	//----------------Methods--------------------------
	public void addProductLine(ProductionLine productionLine){
		productionLines.add(productionLine);
	}
	//-------------------------------------------------
	private void countCar(){
		//TODO arayeyey mashin ha ra gerefte va bar asase model, shomaresh 
		// va dakhele hashmap gharar midahad
	}
	//-------------------------------------------------
	public void addCarToStock(Car car){
		//TODO add produced car to stock
	}
	//-------------------------------------------------
	public Demand sendAlarmToCoordinator(){
		return null;
		//TODO 
	}
	//-------------------------------------------------
	public Demand moveToWareHouse(){
		return null;
		//TODO
	}
	//-------------------------------------------------
	public Demand sendDirectlyToSalesMan(){
		return null;
		//TODO
	}
	//-------------------------------------------------
	

}
