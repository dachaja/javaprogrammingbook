package com.lookcapp.composite2;

import java.util.ArrayList;
import java.util.Iterator;

public class ModelArray extends Entry{
	private String name;
	private ArrayList<Entry> array = new ArrayList<Entry>();
	
	public ModelArray(String name) {
		this.name = name;
	}
	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getId() {
		String id = "";
		Iterator<Entry> it = array.iterator();
		while(it.hasNext()) {
			Entry entry = it.next();
			id += entry.getId() + "/";
		}
		return id;
	}
	public Entry add(Entry entry) {
		array.add(entry);
		return this;
	}

	@Override
	protected void printList(String prefix) {
		System.out.println(prefix + "/" + this);
		Iterator<Entry> it = array.iterator();
		while(it.hasNext()) {
			Entry entry = it.next();
			entry.printList(prefix + "/" + name);
		}
	}
	
}
