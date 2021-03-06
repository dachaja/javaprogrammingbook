package com.lookcapp.factory.idcard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.lookcapp.factory.framework.Factory;
import com.lookcapp.factory.framework.Product;

public class IDCardFactory extends Factory{
	private List<String> owners = new ArrayList<>();
	private HashMap<Integer, String> database = new HashMap<Integer, String>();
	private int serial = 100;
	
	@Override
	//protected Product createProduct(String owner) {
	protected synchronized Product createProduct(String owner) {
		return new IDCard(owner, serial++);
	}

	@Override
	protected void registerProduct(Product product) {
		owners.add(((IDCard)product).getOwner());
		
		IDCard card = (IDCard) product;
		database.put(card.getSerial(), card.getOwner());
	}
	
	public HashMap<Integer, String> getDatabase() {
		return database;
	}

}
