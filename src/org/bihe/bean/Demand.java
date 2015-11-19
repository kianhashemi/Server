package org.bihe.bean;

import java.util.HashMap;

public class Demand {

	private String ID;
	private HashMap<CarID, Integer> listOfCar;
	
	public Demand(String id,HashMap<CarID, Integer> listofCars) {
		this.ID=id;
		this.listOfCar=listofCars;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public HashMap<CarID, Integer> getListOfCar() {
		return listOfCar;
	}

	public void setListOfCar(HashMap<CarID, Integer> listOfCar) {
		this.listOfCar = listOfCar;
	}
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	

}
