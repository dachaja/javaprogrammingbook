package com.lookcapp.composite2;

public class ModelObject extends Entry{
	private String name;
	private String id;
	public ModelObject(String name, String id) {
		this.name = name;
		this.id = id;
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public String getId() {
		return id;
	}
	@Override
	protected void printList(String prefix) {
		System.out.println(prefix + "/" + this);
	}
}
