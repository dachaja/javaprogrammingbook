package com.lookcapp.strategy;

public class QuickSorter implements Sorter {
	Comparable[] data;
	@Override
	public void sort(Comparable[] data) {
		this.data = data;
		qsort(0, data.length - 1);
	}

}
