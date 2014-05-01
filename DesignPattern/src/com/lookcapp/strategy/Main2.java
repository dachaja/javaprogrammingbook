package com.lookcapp.strategy;

public class Main2 {
	public static void main(String[] args) {
		String[] data = {
				"Dumpty", "Bowman", "Carroll", "Elfland", "Alice"
		};
		SortAndPrint sap = new SortAndPrint(data, new SelectionSorter());
		sap.execute();
	}
}
