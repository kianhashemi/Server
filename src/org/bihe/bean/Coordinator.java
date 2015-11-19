package org.bihe.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;

public class Coordinator extends Person implements Runnable {

	public Coordinator(String firstName, String lastName, String username,
			String password) {
		super(firstName, lastName, username, password);
		// TODO Auto-generated constructor stub
	}

	private Queue<Demand> sellTP;
	private Queue<Demand> WHTP;
	private HashMap<String, Integer> freeSpaces;
	private ArrayList<WareHouse> wareHouseStock;
	private HashMap<String, HashMap<CarID, Integer>> innerWareHouseStock;
	private int waitingCarsToMove;

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	

	// -------------------------------------------
	// Methods

	// This is were Every Handle Thing about Alarm will gather
	public void respondingToAlarm(Demand request) {
		if(checkingAlarmQueue()){
			checkingAlarmDemand(request);
			checkinWareHouseFreeSpaces();
			determiningOneWareHouseFreeSpaceForMovingCars(request);
			
			
		}else{
			addToWHTPQueue(request);
		}

	}
	// ---------------------------------------
	// Will Check out WareHouse Free Space
	public void checkinWareHouseFreeSpaces() {
		for(WareHouse wh:wareHouseStock){
			freeSpaces.put(wh.getId(), wh.getFreeSpace());
		}
	}
	// ---------------------------------------
	private boolean determiningOneWareHouseFreeSpaceForMovingCars(Demand request){
		boolean check=false;
		for(String id:freeSpaces.keySet()){
			if(freeSpaces.get(id)>=waitingCarsToMove){
				//TODO
				check=true;
				break;
			}
		}
		return check;
	}
	// ---------------------------------------
	// This is were Transportation complete
	public Boolean moveToWareHouse() {

		return false;
	}
	// ---------------------------------------
	// Will Add a Demand To The QUEUE
	public void addToWHTPQueue(Demand request) {
		WHTP.add(request);
	}
	// ---------------------------------------
	// Will Add a Demand To The QUEUE
	public void addToSellTPQueue(Demand request) {
		sellTP.add(request);
	}
	// ---------------------------------------
	// Will delete The Demand which is handled or changed
	public boolean deleteDemand(Demand request) {

		return false;
	}
	// ---------------------------------------
	// This Method were every thing about sending to salesman gather
	public boolean respondingToSellRequest(Demand request) {

		return false;

	}
	// ---------------------------------------
	// Count available Cars
	public HashMap<CarID, Integer> countingWhAvailableCars(
			HashMap<String, HashMap<CarID, Integer>> Cars) {

		return null;

	}
	// ---------------------------------------
	// IMPORTANT
	public void checkingAlarmDemand(Demand request) {
		waitingCarsToMove=0;
		for(CarID cid:request.getListOfCar().keySet()){
			waitingCarsToMove=waitingCarsToMove+request.getListOfCar().get(cid);
		}
		
	}
	// ---------------------------------------
	
	// ---------------------------------------
	// ye kelas besazim vorodie ino return kone
	public boolean moveToSalesMan(
			HashMap<String, HashMap<CarID, Integer>> carSent) {
		return false;
	}
	// ---------------------------------------
	public boolean checkingAlarmQueue() {
		if (!(WHTP.size() == 0)) {
			return true;
		}else{
			return false;
		}
	}
	// ---------------------------------------
	public void checkingSaleQueue(){
		
	}
	
	// ---------------------------------------
	// Getters And Setters
	public Queue<Demand> getSellTP() {
		return sellTP;
	}

	public void setSellTP(Queue<Demand> sellTP) {
		this.sellTP = sellTP;
	}

	public Queue<Demand> getWHTP() {
		return WHTP;
	}

	public void setWHTP(Queue<Demand> wHTP) {
		WHTP = wHTP;
	}

	public HashMap<String, Integer> getFreeSpaces() {
		return freeSpaces;
	}

	public void setFreeSpaces(HashMap<String, Integer> freeSpaces) {
		this.freeSpaces = freeSpaces;
	}

	public ArrayList<WareHouse> getWareHouseStock() {
		return wareHouseStock;
	}

	public void setWareHouseStock(ArrayList<WareHouse> wareHouseStock) {
		this.wareHouseStock = wareHouseStock;
	}

	public HashMap<String, HashMap<CarID, Integer>> getInnerWareHouseStock() {
		return innerWareHouseStock;
	}

	public void setInnerWareHouseStock(
			HashMap<String, HashMap<CarID, Integer>> innerWareHouseStock) {
		this.innerWareHouseStock = innerWareHouseStock;
	}

}
