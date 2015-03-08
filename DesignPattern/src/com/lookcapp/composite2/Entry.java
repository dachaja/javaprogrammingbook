package com.lookcapp.composite2;

public abstract class Entry {
	public abstract String getName();
	public abstract String getId();
	public Entry add(Entry entry) throws ModelObjectException {
		throw new ModelObjectException();
	}
	protected abstract void printList(String prefix);
	public String toString() {
		return getName() + getId();
	}
}
