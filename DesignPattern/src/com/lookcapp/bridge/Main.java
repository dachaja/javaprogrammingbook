package com.lookcapp.bridge;

public class Main {
	public static void main(String[] args) {
		Display d1 = new Display(new StringDisplayImpl("Hello, Korea."));
		Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World."));
		CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));
		
		d1.display();
		d2.display();
		d3.display();
		d3.multiDisplay(5);
		
		RandomCountDisplay d4 = new RandomCountDisplay(new StringDisplayImpl("Hello, Korea."));
		d4.randomDisplay(10);
		
		CountDisplay d5 = new CountDisplay(new FileDisplayImpl("star.txt"));
		d5.multiDisplay(3);
		
		IncreaseDisplay d6 = new IncreaseDisplay(new CharDisplayImpl('<', '*', '>'), 1);
		IncreaseDisplay d7 = new IncreaseDisplay(new CharDisplayImpl('|', '#', '-'), 2);
		
		d6.increaseDisply(4);
		d7.increaseDisply(6);
	}
}
