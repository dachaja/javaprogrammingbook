package com.lookcapp.strategy;

public class Main2 {
	public static void main(String[] args) {
		String[] data = {
				"Dumpty", "Bowman", "Carroll", "Elfland", "Alice"
		};
		SortAndPrint sap1 = new SortAndPrint(data, new SelectionSorter());
		sap1.execute();
		
		SortAndPrint sap2 = new SortAndPrint(data, new QuickSorter());
		sap2.execute();
	}
}
