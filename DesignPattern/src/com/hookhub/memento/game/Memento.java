package com.hookhub.memento.game;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Memento implements Serializable{
	int money;
	ArrayList<String> fruits;
	private int number;
	
	public int getMoney() {
		return money;
	}
	
	Memento(int money) {
		this.money = money;
		this.fruits = new ArrayList<>();
	}
	void addFruit(String fruit) {
		fruits.add(fruit);
	}
	List getFruits() {
		return (List)fruits.clone();
	}
	int getNumber() {
		return number;
	}
}
