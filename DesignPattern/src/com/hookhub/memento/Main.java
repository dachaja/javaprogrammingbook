package com.hookhub.memento;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

import com.hookhub.memento.game.Gamer;
import com.hookhub.memento.game.Memento;

public class Main {
	public static final String SAVEFILENAME = "game.dat";
	public static void main(String[] args) {
		Gamer gamer = new Gamer(100);
//		Memento memento = gamer.createMemento();
		Memento memento = LoadMemento();
		if(memento != null) {
			System.out.println("Open previous game data.");
			gamer.restoreMemento(memento);
		} else {
			System.out.println("Create new game data.");
			memento = gamer.createMemento();
		}
		
		for(int i = 0; i < 100; i++) {
			System.out.println("==== " + i);
			System.out.println("Status: " + gamer);
			
			gamer.bet();
			
			System.out.println("Current money is " + gamer.getMoney() + ".");
			
			if(gamer.getMoney() > memento.getMoney()) {
				System.out.println("Save the status.");
				memento = gamer.createMemento();
			} else if(gamer.getMoney() < memento.getMoney() / 2) {
				System.out.println("Roll back to previous status.");
				gamer.restoreMemento(memento);
				saveMemento(memento);
			}
			
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				
			}
			
			System.out.println("");
		}
	}
	public static void saveMemento(Memento memento) {
		try {
			//ObjectOutput out = new ObjectOutputStream(new FileOutputStream(SAVEFILENAME));
			ObjectOutput out = new ObjectOutputStream(new DeflaterOutputStream(new FileOutputStream(SAVEFILENAME))); // Save file as zip.
			
			out.writeObject(memento);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static Memento LoadMemento() {
		Memento memento = null;
		try {
			//ObjectInput in = new ObjectInputStream(new FileInputStream(SAVEFILENAME));
			ObjectInput in = new ObjectInputStream(new InflaterInputStream(new FileInputStream(SAVEFILENAME)));
			
			memento = (Memento) in.readObject();
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return memento;
	}
}
