package org.bihe.bean;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;


public class ThreadedServer implements Runnable {
	private Socket newclient;
	private int counter;

	public ThreadedServer(Socket newclient) {
		this.newclient = newclient;
		this.counter=counter;
	}

	@Override
	public void run() {
		try {
			InputStream is = newclient.getInputStream();
			ObjectInputStream ios = new ObjectInputStream(is);
			String hi = (String) ios.readObject();
			System.out.println(hi);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
