package org.bihe.bean;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;

import org.bihe.service.HandleCommand;
import org.bihe.service.Service;

public class ThreadedServer implements Runnable {
	private Socket newclient;
	private int counter;
	private Service s;
	private Object obj;
	private HandleCommand hc;
	private Person p;

	public ThreadedServer(Socket newclient) {
		this.newclient = newclient;
		this.counter = counter;
		
	}

	@Override
	public void run() {
		try {
			InputStream is = newclient.getInputStream();
			ObjectInputStream ios = new ObjectInputStream(is);
			System.out.println("object about to receving...");
			s=(Service)( ios.readObject());
			
			System.out.println("Object recieved.");
			s.execute();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
