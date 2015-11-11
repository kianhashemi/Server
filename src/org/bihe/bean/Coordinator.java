package org.bihe.bean;

import java.util.HashMap;
import java.util.Queue;

public class Coordinator extends Person implements Runnable {

	public Coordinator(String firstName, String lastName, String username,
			String password) {
		super(firstName, lastName, username, password);
		// TODO Auto-generated constructor stub
	}


	private Queue<Demand> sellTP ;
	private Queue<Demand> WHTP ;
	private HashMap<String, Integer> freeSpaces;
	private HashMap<String, HashMap<CarID, Integer>> wareHouseStock;
	private HashMap<String, HashMap<CarID, Integer>> innerWareHouseStock;
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}


	
	//---------------------------------------
	//Getters And Setters 
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


	public HashMap<String, HashMap<CarID, Integer>> getWareHouseStock() {
		return wareHouseStock;
	}


	public void setWareHouseStock(
			HashMap<String, HashMap<CarID, Integer>> wareHouseStock) {
		this.wareHouseStock = wareHouseStock;
	}


	public HashMap<String, HashMap<CarID, Integer>> getInnerWareHouseStock() {
		return innerWareHouseStock;
	}


	public void setInnerWareHouseStock(
			HashMap<String, HashMap<CarID, Integer>> innerWareHouseStock) {
		this.innerWareHouseStock = innerWareHouseStock;
	}
	
	
	//-------------------------------------------
	//Methods 
	
	
	//This is were Every Handle Thing about Alarm will gather
	public boolean  respondingToAlarm(Demand request){
		
		return false;
		
	}
	
	//Will Check out WareHouse Free Space
	public HashMap<CarID, Integer> checkinWareHouseFreeSpaces(){
		return null;
		
		
	}
	
	//This is were Transportation complete
	public Boolean moveToWareHouse(){
		
		
		return false;
	}
	
	
	//Will Add a Demand To The QUEUE 
	public void  addToQueue(Demand request){
		
		
	}
	
	//Will delete The Demand which is handled or changed 
	public boolean deleteDemand(Demand request){
		
		return false;
	}
	
	
	
	//This Method were every thing about sending to salesman gather
	public boolean respondingToSellRequest(Demand request){
		
		
		return false;
		
	}
	
	//Count available Cars
	public  HashMap<CarID, Integer> countingWhAvailableCars(HashMap<String, HashMap<CarID, Integer>> Cars){

		
		
		return null;
		
		
	}
	
	//IMPORTANT
	public Demand checkingDemand(Demand request,HashMap<CarID, Integer> Stock ){

		
		return request ; 
	}
	//ye kelas besazim vorodie ino return kone 
	public boolean moveToSalesMan(HashMap<String, HashMap<CarID, Integer>> carSent){
		return false;
	}
	
	
	public void checkingAlarmQueue(){
		
	}
	
	
	
}
