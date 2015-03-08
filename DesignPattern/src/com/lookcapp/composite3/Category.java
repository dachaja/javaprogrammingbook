package com.lookcapp.composite3;

import java.util.ArrayList;
import java.util.Iterator;

public class Category implements IObject{
	private String name;
	private ArrayList<IObject> array = new ArrayList<IObject>();
	
	public Category(String name) {
		this.name = name;
	}
	@Override
	public IObject add(IObject object) {
		array.add(object);
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		toString("");
		return null;
	}
	
	protected void toString(String prefix) {
		System.out.println(prefix + "/" + name);
		Iterator<IObject> it = array.iterator();
		while(it.hasNext()) {
			Category category = (Category) it.next();
			category.toString(prefix + "/" + name);
		}
	}
}
