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
			serverSocket = new ServerSocket(30000);
			System.out.println("waiting...");
			while (true) {
				Socket client = serverSocket.accept();
				System.out.println("Accepted.");
				ThreadedServer ts = new ThreadedServer(client);
				Thread t = new Thread(ts);
				t.start();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
