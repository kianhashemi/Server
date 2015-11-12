package org.bihe.bean;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
	// -------------------------------------------------------------
	// ------------------Networking---------------------------------
	public Server() {
		ServerSocket serverSocket;
		try {
			serverSocket = new ServerSocket(8000);
			while (true) {
				Socket client = serverSocket.accept();
				ThreadedServer ts = new ThreadedServer(client);
				Thread t = new Thread(ts);
				t.start();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// -------------------------------------------------------------
	// ------------------Instance Fields----------------------------
	private Coordinator co;
	private ArrayList<WarehouseKeeper> wk;
	private ArrayList<Producer> pr;
	private ArrayList<SalesMan> sm;

	// -------------------------------------------------------------
	// ------------------Add Method---------------------------------
	public void addCoordinator() {
	}

	public void addWarehouseKeeper() {
	}

	public void addProducer() {
	}

	public void addSalesMan() {
	}

	// -------------------------------------------------------------
	// ------------------Edit Method--------------------------------
	public void editCoordinator() {
	}

	public void editWarehouseKeeper() {
	}

	public void editProducer() {
	}

	public void editSalesMan() {
	}

	// -------------------------------------------------------------
	// ------------------Remove Method------------------------------
	public void removeCoordinator() {
	}

	public void removeWarehouseKeeper() {
	}

	public void removeProducer() {
	}

	public void removeSalesMan() {
	}
}
