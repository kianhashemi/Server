package org.bihe.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Producer extends Person implements Runnable{

	// -------------------------------------------------
	// -------------Instance Fields---------------------
	private ArrayList<ProductionLine> productionLines;
	private ArrayList<Car> stockCars;
	private ArrayList<Thread> productionLinesThreads;
	private int stockSize;
	private int freeSpace;
	private WareHouse innerWareHouse;
	private String ID;
	// -------------------------------------------------
	
	

	// -------------------------------------------------
	// --------------Constructors-----------------------
	public Producer(String firstName, String lastName, String username,
			String password, int stockSize) {
		super(firstName, lastName, username, password);
		this.stockSize = stockSize;
		this.freeSpace = this.stockSize;
		generateID();

	}

	// -------------------------------------------------
	// ----------------Methods--------------------------
	public void addProductionLine(ProductionLine productionLine) {
		productionLines.add(productionLine);
		Thread thread = new Thread(productionLine);
		productionLinesThreads.add(thread);
	}

	// -------------------------------------------------
	private void setCarsToInnerWareHouse() {
		HashMap<CarID, Integer> IWH = new HashMap<>();
		for (ProductionLine pl : productionLines) {
			for(int i=0;i<pl.getCarTypes().size();i++){
				IWH.put(pl.getCarTypes().get(i).getModel(), 0);
			}
		}
	}

	// -------------------------------------------------
	private void countCar() {
		for(Car c:stockCars){
			for(CarID cid:innerWareHouse.getCars().keySet()){
				if(c.getModel().equals(cid)){
					innerWareHouse.getCars().put(cid,innerWareHouse.getCars().get(cid)+1 );
				}
			}
		}
	}

	// -------------------------------------------------
	public void addCarToStock(Car car) {
		stockCars.add(car);
	}

	// -------------------------------------------------
	private void generateID(){
		  Random rn = new Random(); 
		  int random =rn.nextInt(10000);
		  this.ID = "Producer " + random;
	}
	// -------------------------------------------------
	public Demand sendAlarmToCoordinator() {
		return null;
		// TODO
	}

	// -------------------------------------------------
	public Demand moveToWareHouse() {
		return null;
		// TODO
	}

	// -------------------------------------------------
	public Demand sendDirectlyToSalesMan() {
		return null;
		// TODO
	}

	// -------------------------------------------------
	@Override
	public void run() {
		for(Thread t:productionLinesThreads){
			t.start();
		}
		//TODO
		
	}
	
	// -------------------------------------------------
	// -----------Getters And Setters-------------------
	public ArrayList<ProductionLine> getProductionLines() {
		return productionLines;
	}

	public ArrayList<Car> getStockCars() {
		return stockCars;
	}

	public int getStockSize() {
		return stockSize;
	}

	public int getFreeSpace() {
		return freeSpace;
	}

	public WareHouse getInnerWareHouse() {
		return innerWareHouse;
	}

	public String getID() {
		return ID;
	}

	public void setFreeSpace(int freeSpace) {
		this.freeSpace = freeSpace;
	}

	

}
