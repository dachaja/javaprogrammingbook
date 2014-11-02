package com.lookcapp.visitor;

import java.util.ArrayList;
import java.util.Iterator;

public class ElementArrayList extends ArrayList<Entry> implements Element{

	@Override
	public void accept(Visitor v) {
		Iterator<Entry> it = iterator();
		while(it.hasNext()) {
			Element a = it.next();
			a.accept(v);
		}
	}

}
