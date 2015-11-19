package org.bihe.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import org.bihe.service.HandleCommand;

public class Producer extends Person implements Runnable {

	// -------------------------------------------------
	// -------------Instance Fields---------------------
	private static int iDNumber;
	private ArrayList<ProductionLine> productionLines;
	private static ArrayList<Car> stockCars;
	private ArrayList<Thread> productionLinesThreads;
	private static int stockSize;
	private static int freeSpace;
	private static WareHouse innerWareHouse;
	private static String ID;

	// -------------------------------------------------

	// -------------------------------------------------
	// --------------Constructors-----------------------
	public Producer(String firstName, String lastName, String username,
			String password, int stockSize) {
		super(firstName, lastName, username, password);
		this.stockSize = stockSize;
		this.freeSpace = this.stockSize;
		generateID();
		innerWareHouse = new WareHouse( null, stockSize);

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
			for (int i = 0; i < pl.getCarTypes().size(); i++) {
				IWH.put(pl.getCarTypes().get(i).getModel(), 0);
			}
		}
	}

	// -------------------------------------------------
	private void countCar() {
		for (Car c : stockCars) {
			for (CarID cid : innerWareHouse.getCars().keySet()) {
				if (c.getModel().equals(cid)) {
					innerWareHouse.getCars().put(cid,
							innerWareHouse.getCars().get(cid) + 1);
				}
			}
		}
	}

	// -------------------------------------------------
	public static void addCarToStock(Car car) {
		stockCars.add(car);
	}

	// -------------------------------------------------
	private void generateID() {

		this.ID = "Producer " + iDNumber;
	}

	// -------------------------------------------------
	public static void checkingInnerWareHouseCapacity() {
		boolean checkingAlarm = false;
		if (!checkingAlarm) {
			if (stockCars.size() > (int) (0.8 * stockSize)) {
				checkingAlarm = true;
				sendAlarmToCoordinator();
			}
		} else {
			if (stockCars.size() == stockSize) {
				// TODO stop production
			}
		}

	}

	// -------------------------------------------------
	public static boolean checkingFreeSpace() {
		if (freeSpace == 0) {
			return false;
		} else {
			return true;
		}
	}

	// -------------------------------------------------
	public static void reduceFreeSpace() {
		freeSpace = freeSpace - 1;
	}

	// -------------------------------------------------
	public static void sendAlarmToCoordinator() {
		Demand demand = new Demand(getID(), innerWareHouse.getCars());
		HandleCommand.sendAlarmToCoordinator(demand);

		// TODO
	}

	// -------------------------------------------------
	public void moveToWareHouse(
			HashMap<String, HashMap<CarID, Integer>> movingCars) {

		for (String id : movingCars.keySet()) {
			deletingCarsFromInnerWareHouse(movingCars.get(id));
			deletingMovingCarsFromStockCars(movingCars.get(id));
		}
	}

	// -------------------------------------------------
	private void deletingCarsFromInnerWareHouse(
			HashMap<CarID, Integer> movingCars) {
		for (CarID cid : innerWareHouse.getCars().keySet()) {
			for (CarID cidd : movingCars.keySet()) {
				if (cid.equals(cidd)) {
					innerWareHouse.getCars().put(
							cid,
							innerWareHouse.getCars().get(cid)
									- movingCars.get(cidd));
				}
			}
		}
	}

	// -------------------------------------------------
	private void deletingMovingCarsFromStockCars(
			HashMap<CarID, Integer> movingCars) {
		for (CarID cid : movingCars.keySet()) {
			for (int i = 0; i < movingCars.get(cid); i++) {
				for (int j = 0; j < stockCars.size(); j++) {
					if (stockCars.get(j).getModel().equals(cid)) {
						stockCars.remove(j);
						break;
					}
				}
			}
		}
	}

	// -------------------------------------------------
	public void sendDirectlyToSalesMan() {
		
		// TODO
	}

	// -------------------------------------------------
	@Override
	public void run() {
		for (Thread t : productionLinesThreads) {
			t.start();
		}
		// TODO

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

	public static String getID() {
		return ID;
	}

	public void setFreeSpace(int freeSpace) {
		this.freeSpace = freeSpace;
	}

}
