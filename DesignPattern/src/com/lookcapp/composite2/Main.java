package com.lookcapp.composite2;

public class Main {
	public static void main(String[] args) {
		System.out.println("Making hierachy data entries...");
		ModelArray rootArr = new ModelArray("root");
		ModelArray mostupdatedArr = new ModelArray("category");
		ModelArray mostviwedArr = new ModelArray("category");
		ModelArray manualArr = new ModelArray("category");
		rootArr.add(mostupdatedArr);
		rootArr.add(mostviwedArr);
		rootArr.add(manualArr);
		
		mostupdatedArr.add(new ModelObject("Most Updated", "1"));
		mostviwedArr.add(new ModelObject("Most Viewed", "2"));
		manualArr.add(new ModelObject("Manual", "3"));
		
		
	}
}
